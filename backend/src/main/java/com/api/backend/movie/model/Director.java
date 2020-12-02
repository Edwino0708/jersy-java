
package com.api.backend.movie.model;

/**
 *
 * @author edwin
 */
public class Director {
    private String id;
    private String name;
    private String type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Director{" + "id=" + id + ", name=" + name + ", type=" + type + '}';
    }
    
}
