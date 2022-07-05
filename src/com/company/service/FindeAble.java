package com.company.service;

import com.company.Movie;

import java.util.List;

public interface FindeAble {
    void findMovieByActorName(List<Movie> movies);
    void findMovieByYear(List<Movie> movies);
}
