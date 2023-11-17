package dev.educates.hub.model.educates;

import java.util.Objects;

public class EducatesWorkshop {
    public String name;
    public String id;
    public String title;
    public String description;
    public String vendor;
    public String[] authors;
    public String difficulty;
    public String duration;
    public String[] tags;
    public String logo;
    public String url;
    public String image;

    public EducatesWorkshop() {
    }

    public EducatesWorkshop(String name, String id, String title, String description, String vendor, String[] authors,
            String difficulty, String duration, String[] tags, String logo, String url, String image) {
        this.name = name;
        this.id = id;
        this.title = title;
        this.description = description;
        this.vendor = vendor;
        this.authors = authors;
        this.difficulty = difficulty;
        this.duration = duration;
        this.tags = tags;
        this.logo = logo;
        this.url = url;
        this.image = image;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVendor() {
        return this.vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String[] getAuthors() {
        return this.authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public String getDifficulty() {
        return this.difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getDuration() {
        return this.duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String[] getTags() {
        return this.tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public String getLogo() {
        return this.logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public EducatesWorkshop name(String name) {
        this.name = name;
        return this;
    }

    public EducatesWorkshop id(String id) {
        this.id = id;
        return this;
    }

    public EducatesWorkshop title(String title) {
        this.title = title;
        return this;
    }

    public EducatesWorkshop description(String description) {
        this.description = description;
        return this;
    }

    public EducatesWorkshop vendor(String vendor) {
        this.vendor = vendor;
        return this;
    }

    public EducatesWorkshop authors(String[] authors) {
        this.authors = authors;
        return this;
    }

    public EducatesWorkshop difficulty(String difficulty) {
        this.difficulty = difficulty;
        return this;
    }

    public EducatesWorkshop duration(String duration) {
        this.duration = duration;
        return this;
    }

    public EducatesWorkshop tags(String[] tags) {
        this.tags = tags;
        return this;
    }

    public EducatesWorkshop logo(String logo) {
        this.logo = logo;
        return this;
    }

    public EducatesWorkshop url(String url) {
        this.url = url;
        return this;
    }

    public EducatesWorkshop image(String image) {
        this.image = image;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof EducatesWorkshop)) {
            return false;
        }
        EducatesWorkshop EducatesWorkshop = (EducatesWorkshop) o;
        return Objects.equals(name, EducatesWorkshop.name) && Objects.equals(id, EducatesWorkshop.id)
                && Objects.equals(title, EducatesWorkshop.title)
                && Objects.equals(description, EducatesWorkshop.description)
                && Objects.equals(vendor, EducatesWorkshop.vendor) && Objects.equals(authors, EducatesWorkshop.authors)
                && Objects.equals(difficulty, EducatesWorkshop.difficulty)
                && Objects.equals(duration, EducatesWorkshop.duration) && Objects.equals(tags, EducatesWorkshop.tags)
                && Objects.equals(logo, EducatesWorkshop.logo) && Objects.equals(url, EducatesWorkshop.url)
                && Objects.equals(image, EducatesWorkshop.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, title, description, vendor, authors, difficulty, duration, tags, logo, url,
                image);
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", id='" + getId() + "'" +
                ", title='" + getTitle() + "'" +
                ", description='" + getDescription() + "'" +
                ", vendor='" + getVendor() + "'" +
                ", authors='" + getAuthors() + "'" +
                ", difficulty='" + getDifficulty() + "'" +
                ", duration='" + getDuration() + "'" +
                ", tags='" + getTags() + "'" +
                ", logo='" + getLogo() + "'" +
                ", url='" + getUrl() + "'" +
                ", image='" + getImage() + "'" +
                "}";
    }
}