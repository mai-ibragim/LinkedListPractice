package com.company.service;

import com.company.Cast;
import com.company.Movie;
import java.util.List;
import java.util.Scanner;

public class FindByField implements FindeAble {
    private static final Scanner scanner = new Scanner(System.in);

    @Override
    public void findMovieByActorName(List<Movie> movies) {
        System.out.println("Write actor's name: ");
        String inputName = scanner.nextLine();
        for (Movie m : movies) {
            for (Cast c : m.getCast()) {
                String[] nameOfActor = c.getFullName().split(" ");
                if (c.getFullName().equals(inputName) || nameOfActor[0].equals(inputName) || nameOfActor[1].equals(inputName)) {
                    System.out.println("Name: " + m.getName());
                    System.out.println("Year: " + m.getYear());
                    System.out.println("Genre: " + m.getGenre());
                    System.out.println("Director: " + m.getDirector().getName() + " " + m.getDirector().getLastName());
                    System.out.println("Cast: " + m.getCast() + "\n" +
                            "Actor: " + c.getFullName() + " with role: " + c.getRole());
                }
            }
        }
    }

    @Override
    public void findMovieByYear(List<Movie> movies) {
        System.out.println("Write year: ");
        int year = scanner.nextInt();
        for (Movie m: movies) {
            if(m.getYear() == year) {
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
}