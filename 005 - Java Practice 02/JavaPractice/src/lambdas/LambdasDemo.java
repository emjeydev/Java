package lambdas;

// This file is made by EmJey
// Project: JavaPractice.java
// FileName: LambdasDemo.java
// Date: 2024/06/22
// Modified Date: 2024/06/23
// Email: emjeydev@gmail.com
// Github: emjeydev

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdasDemo {

    public static void predicateInterfaceUsage() {
        Predicate<String> isLongerThan5 = str -> str.length() > 5;
        var result = isLongerThan5.test("Sky");
        System.out.println(result);
    }

    public static void composingFunctionUsage() {
        Function<String,String> replaceColon =  str -> str.replace(":", "=");
        Function<String, String> addBraces = str -> "{" + str+"}";

        // Declarative Programming
        var result = replaceColon.andThen(addBraces).apply("key:value");
        System.out.println(result);
    }

    public static void functionInterfaceUsage() {
        Function<String, Integer> map = str -> str.length();
        var length = map.apply("Sky");
        System.out.println(length);
    }

    public static void supplierInterfaceUsage() {
        Supplier<Double> list = () -> Math.random();
        var random = list.get();
        System.out.println(random);
    }

    public static void chainingConsumerUsage() {
        List<String> list = List.of("a", "b", "c");

        Consumer<String> print = item -> System.out.println(item);
        Consumer<String> printUpperCase = item -> System.out.println(item.toUpperCase());

        list.forEach(print.andThen(printUpperCase).andThen(print));
    }

    public static void consumerInterfaceUsage() {
        List<Integer> list = List.of(1, 2, 3, 4, 5);

        // Imperative Programming
        for (Integer item : list)
            System.out.print(item);

        // Declaritive Programming
        list.forEach(item -> System.out.print(item));
    }

    public static void methodRefrenceUsage() {
        // Class/Object::method without ()
        greet(System.out::println);
    }

    public static void lambdaExpressionUsage() {
//        greet((String message) -> {System.out.println(message);});
        greet(message -> System.out.println(message));
    }

    public static void anonymousInnerClassUsasge() {
        greet(new Printer() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        });
    }

    public static void functionalInterfaceUsage() {
        greet(new ConsolePrinter());
    }

    public static void greet(Printer printer) {
        printer.print("Hello World");
    }
}
