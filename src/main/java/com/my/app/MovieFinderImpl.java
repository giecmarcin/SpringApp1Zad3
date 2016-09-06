package com.my.app;

import com.my.app.model.Movie;

import java.util.List;

/**
 * Created by mgiec on 9/5/2016.
 */
public class MovieFinderImpl implements MovieFinder {

    @Override
    public List findAll() {
        System.out.println("Test");
        return null;
    }

    @Override
    public List<Movie> findByDirector(String director) {
        return null;
    }
}
