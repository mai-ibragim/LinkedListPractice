package com.company.service;

import com.company.Cast;
import com.company.Movie;

import java.util.Collections;
import java.util.List;

public class Sorting implements SortAble {
    @Override
    public void printAllMovies(List<Movie> movies) {
        for (Movie m : movies) {
            System.out.println("Name: " + m.getName());
            System.out.println("Year: " + m.getYear());
            System.out.println("Genre: " + m.getGenre());
            System.out.println("Director: " + m.getDirector().getName() + " " + m.getDirector().getLastName());
            System.out.println("Actor: ");
            for (Cast c : m.getCast()) {
                System.out.println("Cast: " + m.getCast() + "\n" +
                        "Actor: " + c.getFullName() + " with role: " + c.getRole());
            }
        }

    }


    @Override
    public void sortByYear(List<Movie> movies) {
        Collections.sort(movies);
        for (Movie m: movies) {
            System.out.println("Name: " + m.getName());
            System.out.println("Year: " + m.getYear());
            System.out.println("Genre: " + m.getGenre());
            System.out.println("Director: " + m.getDirector().getName() + " " + m.getDirector().getLastName());
            System.out.println("Actor: ");
            for (Cast c:m.getCast()) {
                System.out.println("Cast: " + m.getCast() + "\n" +
                        "Actor: " + c.getFullName() + " with role: " + c.getRole());
            }
        }
    }
}

