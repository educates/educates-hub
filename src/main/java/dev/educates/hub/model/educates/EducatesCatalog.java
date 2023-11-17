package dev.educates.hub.model.educates;

import java.util.List;
import java.util.Objects;

public class EducatesCatalog {
    private EducatesPortal portal;
    private List<EducatesEnvironment> environments;

    public EducatesCatalog() {
    }

    public EducatesCatalog(EducatesPortal portal, List<EducatesEnvironment> environments) {
        this.portal = portal;
        this.environments = environments;
    }

    public List<EducatesEnvironment> getEnvironments() {
        return this.environments;
    }

    public void setEnvironments(List<EducatesEnvironment> environments) {
        this.environments = environments;
    }

    public EducatesPortal getPortal() {
        return portal;
    }

    public void setPortal(EducatesPortal portal) {
        this.portal = portal;
    }

    public EducatesCatalog environments(List<EducatesEnvironment> environments) {
        this.environments = environments;
        return this;
    }

    public EducatesCatalog portal(EducatesPortal portal) {
        this.portal = portal;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof EducatesCatalog)) {
            return false;
        }
        EducatesCatalog EducatesCatalog = (EducatesCatalog) o;
        return Objects.equals(environments, EducatesCatalog.environments) &&
                Objects.equals(portal, EducatesCatalog.portal);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(environments);
    }

    @Override
    public String toString() {
        return "{" +
                " portal='" + getPortal() + "'" +
                ", environments='" + getEnvironments() + "'" +
                "}";
    }

}