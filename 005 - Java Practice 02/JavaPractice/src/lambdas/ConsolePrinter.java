package lambdas;

// This file is made by EmJey
// Project: JavaPractice.java
// FileName: ConsolePrinter.java
// Date: 2024/06/22
// Modified Date: 2024/06/22
// Email: emjeydev@gmail.com
// Github: emjeydev

public class ConsolePrinter implements Printer{
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
