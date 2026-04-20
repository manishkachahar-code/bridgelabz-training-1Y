package com.glaStreamApi.StreamApiProblemStatement.StreamApi;
import java.util.*;
import java.util.stream.*;

class Movie {
    String name;
    double rating;
    int year;

    Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }
}

public class TrendingMovies {
    public static void main(String[] args) {

        List<Movie> movies = Arrays.asList(
                new Movie("A", 8.5, 2023),
                new Movie("B", 9.0, 2024),
                new Movie("C", 7.5, 2022),
                new Movie("D", 8.8, 2024),
                new Movie("E", 9.2, 2023),
                new Movie("F", 8.0, 2024)
        );

        movies.stream()
                .filter(m -> m.year >= 2023)
                .sorted((a, b) -> {
                    if (b.rating == a.rating)
                        return b.year - a.year;
                    return Double.compare(b.rating, a.rating);
                })
                .limit(5)
                .forEach(m -> System.out.println(m.name + " " + m.rating + " " + m.year));
    }


}
