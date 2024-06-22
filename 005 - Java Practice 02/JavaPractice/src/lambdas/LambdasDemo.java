package lambdas;

// This file is made by EmJey
// Project: JavaPractice.java
// FileName: LambdasDemo.java
// Date: 2024/06/22
// Modified Date: 2024/06/22
// Email: emjeydev@gmail.com
// Github: emjeydev

import java.util.List;

public class LambdasDemo {
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
