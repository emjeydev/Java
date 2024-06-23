package streams;

// This file is made by EmJey
// Project: JavaPractice.java
// FileName: StreamDemo.java
// Date: 2024/06/22
// Modified Date: 2024/06/23
// Email: emjeydev@gmail.com
// Github: emjeydev

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo {

    public static void slicingStreamUsage() {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 30),
                new Movie("c", 20)
        );

        System.out.println("limit() :");
        movies.stream()
                .limit(2)
                .forEach(m -> System.out.println(m.getTitle()));

        System.out.println("skip() :");
        movies.stream()
                .skip(2)
                .forEach(m -> System.out.println(m.getTitle()));

        System.out.println("takeWhile() :");
        movies.stream()
                .takeWhile(m -> m.getLikes() < 30)
                .forEach(m -> System.out.println(m.getTitle()));

        System.out.println("dropWhile() :");
        movies.stream()
                .takeWhile(m -> m.getLikes() < 30)
                .forEach(m -> System.out.println(m.getTitle()));
    }

    public static void filteringElementsUsage() {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 15),
                new Movie("c", 20)
        );

        Predicate<Movie> isPopular = m -> m.getLikes() > 10;

        movies.stream()
                .filter(isPopular)
                .forEach(m -> System.out.println(m.getTitle()));
    }

    public static void flatMappingUsage() {
        var stream = Stream.of(List.of(1, 2, 3), List.of(4, 5, 6));
        stream
                .flatMap(list -> list.stream())
                .forEach(n -> System.out.println(n));
    }

    public static void mappingElementsUsage() {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 15),
                new Movie("c", 20)
        );

        movies.stream()
                .map(movie -> movie.getTitle())
                .forEach(name -> System.out.println(name));
    }

    public static void infiniteStreamUsage() {
        var stream = Stream.generate(() -> Math.random());

        stream.limit(5).forEach(n -> System.out.println(n));
    }

    public static void arrayStreamUsage() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Arrays.stream(numbers)
                .forEach(n -> System.out.println(n));

        Stream.iterate(1, n -> n + 1)
                .limit(5)
                .forEach(n -> System.out.println(n));
    }

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
