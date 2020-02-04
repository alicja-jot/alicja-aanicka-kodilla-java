package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        String theResultStringOfMovies = movieStore.getMovies().values().stream()
                .flatMap(movies -> movies.stream())
                .collect(Collectors.joining("!"));

        System.out.println(theResultStringOfMovies);


    }
}
