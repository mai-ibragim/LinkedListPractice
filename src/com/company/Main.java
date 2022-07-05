package com.company;

import com.company.service.FindByField;
import com.company.service.FindeAble;
import com.company.service.SortAble;
import com.company.service.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        FindeAble findeAble = new FindByField();
        SortAble sortAble = new Sorting();
        Cinema cinema = new Cinema();
        Director director = new Director("Oriol", "Paulo");
        List<Cast> casts = new ArrayList<>();
        casts.add(new Cast("Mario Casas", "Businessman Adrián Doria"));
        casts.add(new Cast("Lora Vidal", "Barbara"));

        Director director1 = new Director("Anders", "Bais");
        List<Cast> casts1 = new ArrayList<>();
        casts1.add(new Cast("Clara Lago", "Belen"));
        casts1.add(new Cast("Kim Guterres", "Adrián"));

        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("The Invisible Guest", 2016, casts, director, "Krimi"));
        movies.add(new Movie("The Bunker", 2011, casts1, director1, "Thriller"));
        cinema.setMovies(movies);
        findeAble.findMovieByActorName(cinema.getMovies());
        findeAble.findMovieByYear(cinema.getMovies());

        System.out.println("-----SORTING OF MOVIES---------SORTING OF MOVIES-------SORTING OF MOVIES------");
        sortAble.printAllMovies(cinema.getMovies());
        System.out.println("---------SORTING OF YEAR------------------SORTING OF YEAR------------------SORTING OF YEAR---------");
        sortAble.sortByYear(cinema.getMovies());
        }
    }

