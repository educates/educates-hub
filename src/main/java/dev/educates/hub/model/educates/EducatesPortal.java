package dev.educates.hub.model.educates;

import java.util.Objects;

public class EducatesPortal {
    private String name;
    private String url;

    public EducatesPortal() {
    }

    public EducatesPortal(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public EducatesPortal name(String name) {
        this.name = name;
        return this;
    }

    public EducatesPortal url(String url) {
        this.url = url;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof EducatesPortal)) {
            return false;
        }
        EducatesPortal EducatesPortal = (EducatesPortal) o;
        return Objects.equals(name, EducatesPortal.name) && Objects.equals(url, EducatesPortal.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, url);
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", url='" + getUrl() + "'" +
                "}";
    }

}