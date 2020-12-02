
package com.api.backend.movie.model;

/**
 *
 * @author edwin
 */
public class Criticism {
    private String id;
    private String color;
    private String journalist;
    private String media;
    private String url;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getJournalist() {
        return journalist;
    }

    public void setJournalist(String journalist) {
        this.journalist = journalist;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Criticism{" + "id=" + id + ", color=" + color + ", journalist=" + journalist + ", media=" + media + ", url=" + url + '}';
    }
    
    
}
