
package com.api.backend.movie.model;

/**
 *
 * @author edwin
 */
public class Prize {
    private String id;
    private String event;
    private String[] names;
    private int year;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Prize{" + "id=" + id + ", event=" + event + ", names=" + names + ", year=" + year + '}';
    }
    
    
}
