package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


// This file is made by EmJey
// Project: JavaPractice.java
// FileName: StreamDemo.java
// Date: 2024/06/22
// Modified Date: 2024/06/24
// Email: emjeydev@gmail.com
// Github: emjeydev


public class StreamDemo {

    public static void collectMethodUsage() {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 30)
        );

        var lisResult = movies.stream()
                .filter(m -> m.getLikes() > 10)
                .collect(Collectors.toList());
        System.out.println("list: " + lisResult);

        var setResult = movies.stream()
                .filter(m -> m.getLikes() > 10)
                .collect(Collectors.toSet());
        System.out.println("set: " + setResult);

        var mapResult = movies.stream()
                .filter(m -> m.getLikes() > 10)
                .collect(Collectors.toMap(Movie::getTitle, Movie::getLikes));
        System.out.println("map: " + mapResult);

        var summingIntResult = movies.stream()
                .filter(m -> m.getLikes() > 10)
                .collect(Collectors.summingInt(Movie::getLikes));
        System.out.println("summingInt: " + summingIntResult);

        var summarizingIntResult = movies.stream()
                .filter(m -> m.getLikes() > 10)
                .collect(Collectors.summarizingInt(Movie::getLikes));
        System.out.println("summarizingInt: " + summarizingIntResult);

        var joiningResult = movies.stream()
                .filter(m -> m.getLikes() > 10)
                .map(Movie::getTitle)
                .collect(Collectors.joining(", "));
        System.out.println("joining: " + joiningResult);
    }

    public static void reduceMethodUsage() {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 30)
        );

        Optional<Integer> sum = movies.stream()
                .map(m -> m.getLikes())
//                .reduce((a, b) -> a + b);
                .reduce(Integer::sum);
//        System.out.println(sum.get()); It may throw an exception so:
        System.out.println("optional object: " + sum.orElse(0));

        Integer sumInteger = movies.stream()
                .map(m -> m.getLikes())
                .reduce(0, Integer::sum);
        System.out.println("integer object: " + sumInteger);
    }

    public static void simpleReducersUsage() {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 30)
        );

        var count = movies.stream()
                .count();
        System.out.println("count() :" + count);

        var anyMatchResult = movies.stream()
                .anyMatch(m -> m.getLikes() > 20);
        System.out.println("anyMatchResult(): " + anyMatchResult);

        var allMatchResult = movies.stream()
                .allMatch(m -> m.getLikes() > 20);
        System.out.println("allMatchResult(): " + allMatchResult);

        var nonMatchResult = movies.stream()
                .noneMatch(m -> m.getLikes() > 20);
        System.out.println("noneMatchResult(): " + nonMatchResult);

        var findFirstResult = movies.stream()
                .findFirst().get();
        System.out.println("findFirstResult(): " + findFirstResult.getTitle());

        var findAnyResult = movies.stream()
                .findAny().get();
        System.out.println("findAnyResult(): " + findAnyResult.getTitle());

        var maxResult = movies.stream()
                .max(Comparator.comparing(Movie::getLikes)).get();
        System.out.println("maxResult(): " + maxResult.getTitle());
    }

    public static void peekMethodUsage() {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 30)
        );

        movies.stream()
                .filter(m -> m.getLikes() > 10)
                .peek(m -> System.out.println("filtered: " + m.getTitle()))
                .map(Movie::getTitle)
                .peek(t -> System.out.println("mapped: " + t))
                .forEach(System.out::println);
    }

    public static void distinctStreamUsage() {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 30)
        );

        movies.stream()
                .map(Movie::getLikes)
                .distinct()
                .forEach(System.out::println);
    }

    public static void sortingStreamUsage() {
        List<Movie> movies = List.of(
                new Movie("c", 10),
                new Movie("b", 30),
                new Movie("a", 20)
        );

        movies.stream()
//                .sorted((a, b) -> a.getTitle().compareTo(b.getTitle()))
                .sorted(Comparator.comparing(Movie::getTitle))
                .forEach(m -> System.out.println(m.getTitle()));
    }

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
