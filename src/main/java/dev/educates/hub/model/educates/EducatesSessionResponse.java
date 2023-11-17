package dev.educates.hub.model.educates;

import java.util.Objects;

public class EducatesSessionResponse {
    private String session;
    private String url;

    public EducatesSessionResponse() {
    }

    public EducatesSessionResponse(String session, String url) {
        this.session = session;
        this.url = url;
    }

    public String getSession() {
        return this.session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public EducatesSessionResponse session(String session) {
        this.session = session;
        return this;
    }

    public EducatesSessionResponse url(String url) {
        this.url = url;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof EducatesSessionResponse)) {
            return false;
        }
        EducatesSessionResponse EducatesSessionResponse = (EducatesSessionResponse) o;
        return Objects.equals(session, EducatesSessionResponse.session)
                && Objects.equals(url, EducatesSessionResponse.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(session, url);
    }

    @Override
    public String toString() {
        return "{" +
                " session='" + getSession() + "'" +
                ", url='" + getUrl() + "'" +
                "}";
    }

}