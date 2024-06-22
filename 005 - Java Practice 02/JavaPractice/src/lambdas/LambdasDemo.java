package lambdas;

public class LambdasDemo {

    public static void functionalInterfaceUsage() {
        greet(new ConsolePrinter());
    }

    public static void greet(Printer printer) {
        printer.print("Hello World");
    }
}
