package dev.educates.hub.config;

import java.util.List;
import java.util.Objects;

import dev.educates.hub.model.config.PortalConfig;

import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.context.properties.ConstructorBinding;

@ConfigurationProperties(prefix = "catalog")
public class EducatesPortalConfig {

    public static final String OAUTH_ENDPOINT = "/oauth2/token/";

    public static final String CATALOG_ENDPOINT = "/workshops/catalog/environments/";

    private List<PortalConfig> portals;

    public EducatesPortalConfig() {
    }

    public EducatesPortalConfig(List<PortalConfig> portals) {
        this.portals = portals;
    }

    public List<PortalConfig> getPortals() {
        return this.portals;
    }

    public void setPortals(List<PortalConfig> portals) {
        this.portals = portals;
    }

    public EducatesPortalConfig portals(List<PortalConfig> portals) {
        this.portals = portals;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof EducatesPortalConfig)) {
            return false;
        }
        EducatesPortalConfig EducatesPortalConfig = (EducatesPortalConfig) o;
        return Objects.equals(portals, EducatesPortalConfig.portals);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(portals);
    }

    @Override
    public String toString() {
        return "{" + " portals='" + getPortals() + "'" + "}";
    }

}