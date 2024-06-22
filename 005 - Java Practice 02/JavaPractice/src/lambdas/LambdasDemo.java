package lambdas;

// This file is made by EmJey
// Project: JavaPractice.java
// FileName: LambdasDemo.java
// Date: 2024/06/22
// Modified Date: 2024/06/22
// Email: emjeydev@gmail.com
// Github: emjeydev

public class LambdasDemo {

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
