package com.api.backend.movie.model;

public class Movie {
    private String id;
    private String genre;
    private String title;
    private String type;
    private int year;
    private int running_Time;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRunning_Time() {
        return running_Time;
    }

    public void setRunning_Time(int running_Time) {
        this.running_Time = running_Time;
    }

    @Override
    public String toString() {
        return "Movie{" + "id=" + id + ", genre=" + genre + ", title=" + title + ", type=" + type + ", year=" + year + ", running_Time=" + running_Time + '}';
    }         
    
}
