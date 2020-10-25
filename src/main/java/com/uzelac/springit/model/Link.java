package com.uzelac.springit.model;

import java.util.Objects;

public class Link {

    private Long id;
    private String title;
    private String url;

    // comments


    public Link() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Link{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Link link = (Link) o;
        return id.equals(link.id) &&
                title.equals(link.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title);
    }
}
