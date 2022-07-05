package com.company;

import java.util.List;

public class Movie implements Comparable<Movie>{
    private String name;
    private int year;
    private List<Cast> cast;
    private Director director;
    private String genre;

    public Movie(String name, int year, List<Cast> cast, Director director, String genre) {
        this.name = name;
        this.year = year;
        this.cast = cast;
        this.director = director;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<Cast> getCast() {
        return cast;
    }

    public void setCast(List<Cast> cast) {
        this.cast = cast;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public int compareTo(Movie o) {
       return this.getYear() - o.getYear();
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", cast=" + cast +
                ", director=" + director +
                ", genre='" + genre + '\'' +
                '}';
    }
}
