package com.my.app.model;

/**
 * Created by mgiec on 9/5/2016.
 */
public class Movie {
    private int id;
    private String title;
    private String director;

    public Movie(int id, String title, String director) {
        this.id = id;
        this.title = title;
        this.director = director;
    }

    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
    }
}
