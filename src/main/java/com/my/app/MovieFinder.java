package com.my.app;

import com.my.app.model.Movie;

import java.util.List;

/**
 * Created by mgiec on 9/5/2016.
 */
public interface MovieFinder {
    List findAll();
    List<Movie> findByDirector(String director);
}
