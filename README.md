# educates hub (hub.educates.io)

Site for educates hub.

## Deploy

### Use kapp for deploying your app

We find [kapp](https://get-kapp.io/) to be a better tool than kubectl for deployment of your application in Kubernetes. If you have _kapp_ installed, you can easily try this application:

### Use ytt for deploying your app

**NOTE:** [There's a sample values file](values-sample.yaml) that you can use as source of inspiration

[ytt](https://get-ytt.io/) is a fantastic templating engine for Kubernetes that gives us a lot of flexibility. If you have _ytt_ installed, you can easily customize your deployment:

```bash
ytt -f values.yaml -f k8s | kapp deploy -y --diff-changes -a educateshub -f-
```

#### Customize any value

If you want to customize any of the possible values you can, either provide a values.yml file or provide specific values via command line:

```bash
ytt -f values.yaml -f k8s --data-value-yaml namespace.name=educateshub | kapp deploy -y --diff-changes -a educateshub -f-
```

### Use kbld to build your container image

If you're in the building process, and you want to use the image you're building in the the deployment, [kbld](https://get-kbld.io/) is your tool. If you have _kbld_ installed, you can use it very easily:

```bash
ytt -f values.yaml -f k8s --data-value-yaml namespace.name=educateshub  --data-value-yaml image.build=true | kbld -f - | kapp deploy -y --diff-changes -a educateshub -f-
```

If you want to build your container by compiling locally your java application (faster), use:

```bash
mvn package
ytt -f values.yaml -f k8s --data-value-yaml namespace.name=educateshub  --data-value-yaml image.build=true --data-value-yaml dockerfile=docker/Dockerfile.innerloop | kbld -f - | kapp deploy -y --diff-changes -a educateshub -f-
```

If you don't have maven locally, or you want to build your application archive (.jar file) it in a container, use:

```bash
ytt -f values.yaml -f k8s --data-value-yaml namespace.name=educateshub  --data-value-yaml image.build=true --data-value-yaml dockerfile=docker/Dockerfile.outerloop | kbld -f - | kapp deploy -y --diff-changes -a educateshub -f-
```

### Delete your application

If you want to delete your application, it can be done in an easy command, anywhere:

```bash
kapp delete -a educateshub
```

## Deploy our existing container

We use ytt to create/customize the configuration, so create a values.yaml file in the root folder with at least following content:

```
host: hub.<YOUR_WILDCARD_DOMAIN>
application_yaml:
  catalog:
    portals: #! This can be a list of trainingportals
      - name: <YOUR_TRAININGPORTAL_NAME>
        url: <YOUR_TRAININGPORTAL_URL>
        robot:
          client_id: <YOUR_TRAININGPORTAL_ROBOT_CLIENT_ID>
          client_secret: <YOUR_TRAININGPORTAL_ROBOT_CLIENT_SECRET>
          username: <YOUR_TRAININGPORTAL_ROBOT_USERNAME>
          password:<YOUR_TRAININGPORTAL_ROBOT_PASSWORD>
```

**NOTE:** You can customize any other values defined in the [schema](k8s/schema.yaml)

and run:

```
ytt -f values.yaml -f k8s | kbld -f - | kapp deploy -y --diff-changes -a educateshub -f-
```

## Build your container

There's 4 ways to build your container image:

- Build your application locally using maven and the SpringBoot Cloud Native Buildpacks (CNB).
- Build your application locally and then create the container image with a Docker multi-stage build. This will mostly be used for local development as it benefits from maven cache
- Build your application and container image with a Docker multi-stage build. This will be slower, but it doesn't depend on having maven installed.
- Build your application and image with a Buildpack

**NOTE**: We use a sumbolic image name of k8s/educateshub:latest. Adjust to your correct registry/container name.

### Option 1: Spring-Boot maven build plugin

```
mvn package spring-boot:build-image
# Image will be: ghcr.io/educates/educates-hub:main
```

### Option 2: Inner loop build

```
mvn package
docker build -t "ghcr.io/educates/hub/hub:main" -f docker/Dockerfile.innerloop .
```

### Option 3: Outer loop build

```
docker build -t "ghcr.io/educates/hub/hub:main" -f docker/Dockerfile.outerloop .
```

## Split configuration (THIS IS NOT TRUE ANYMORE)

Currently we have 2 profiles:

- development profile: `application-default.yaml`
- production profile: `application.yaml`

In development, we have the hub configuration in `application-default.yaml` although you can split configuration into multiple files and start your Boot application this way:

```
java -jar hub-main.jar --spring.config.location=classpath:/application.yaml,classpath:/hub.yaml
```

Although in Kubernetes, you only need to place the files in `file:./config/*/` and they will be automatically loaded
