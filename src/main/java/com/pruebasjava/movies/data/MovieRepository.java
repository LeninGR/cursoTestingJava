package com.pruebasjava.movies.data;

import com.pruebasjava.movies.model.Movie;

import java.util.Collection;

public interface MovieRepository {

    Movie findById(long id);
    Collection<Movie> findAll();
    void saveOrUpdate(Movie movie);
}
