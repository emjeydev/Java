package exceptions;

// This file is made by EmJey
// Project: JavaPractice.java
// FileName: ExceptionDemo.java
// Date: 2024/06/05
// Modified Date: 2024/06/05
// Email: emjeydev@gmail.com
// Github: emjeydev

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo {

    public static void show() {
        // Checked Exception
        try {
            var reader = new FileReader("file.txt");
            System.out.println("File opened");

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
