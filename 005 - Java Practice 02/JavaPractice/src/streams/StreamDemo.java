package streams;

// This file is made by EmJey
// Project: JavaPractice.java
// FileName: StreamDemo.java
// Date: 2024/06/22
// Modified Date: 2024/06/23
// Email: emjeydev@gmail.com
// Github: emjeydev

import java.util.List;

public class StreamDemo {

    public static void imparitiveAndFunctionalComparision() {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 15),
                new Movie("c", 20)
        );

        // Imperative Programming
        // In imperative programming we have statements that specify how something should be done
        int count = 0;
        for (var movie : movies)
            if (movie.getLikes() > 10)
                count++;

        System.out.println("Imperative: " + count);

        // Declarative (Functional) programming
        var count2 = movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .count();

        System.out.println("Declarative: " + count2);
    }
}
