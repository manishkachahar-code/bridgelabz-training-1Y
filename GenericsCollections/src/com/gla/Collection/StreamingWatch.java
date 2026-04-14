package com.gla.Collection;
import java.util.*;

// Movie class
class Movie {
    String title;
    String genre;

    public Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return title + " (" + genre + ")";
    }
}

public class StreamingWatch {
    public static void main(String[] args) {

        // 1. All available movies (List)
        List<Movie> allMovies = new ArrayList<>();
        allMovies.add(new Movie("Inception", "Sci-Fi"));
        allMovies.add(new Movie("Titanic", "Romance"));
        allMovies.add(new Movie("Avengers", "Action"));
        allMovies.add(new Movie("Interstellar", "Sci-Fi"));
        allMovies.add(new Movie("The Notebook", "Romance"));
        allMovies.add(new Movie("John Wick", "Action"));

        // 2. Up Next Queue
        Queue<Movie> upNext = new LinkedList<>();

        // Add movies to Up Next
        upNext.add(allMovies.get(0));
        upNext.add(allMovies.get(2));
        upNext.add(allMovies.get(3));

        // 3. Watch history (Stack)
        Stack<Movie> history = new Stack<>();

        // 4. Unique genres watched
        Set<String> watchedGenres = new HashSet<>();

        System.out.println("Watching Movies:\n");

        // Process queue
        while (!upNext.isEmpty()) {
            Movie current = upNext.poll();

            System.out.println("Now Watching: " + current);

            // Move to history
            history.push(current);

            // Track genre
            watchedGenres.add(current.genre);
        }

        // Display history
        System.out.println("\nWatch History (Recent First):");
        while (!history.isEmpty()) {
            System.out.println(history.pop());
        }

        // Display genres
        System.out.println("\nGenres Watched:");
        for (String genre : watchedGenres) {
            System.out.println(genre);
        }

        // 5. Recommendations based on genres
        System.out.println("\nRecommended Movies:");

        for (Movie m : allMovies) {
            if (watchedGenres.contains(m.genre)) {
                System.out.println(m);
            }
        }
    }
}
