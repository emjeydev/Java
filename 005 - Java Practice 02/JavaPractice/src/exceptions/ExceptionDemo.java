package exceptions;

import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;


// This file is made by EmJey
// Project: JavaPractice.java
// FileName: ExceptionDemo.java
// Date: 2024/06/05
// Modified Date: 2024/06/06
// Email: emjeydev@gmail.com
// Github: emjeydev

public class ExceptionDemo {

    public static void withdrawChain() {
        var account = new Account();
        try {
            account.withdrawChain(10);
        } catch (AccountException e) {
            var cause = e.getCause();
            System.out.println(cause.getMessage());
        }
    }

    public static void withdraw() {
        var account = new Account();
        try {
            account.withdraw(10);
        } catch (InsufficientFundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void get()  throws IOException{
        var account = new Account();
        try {
            account.deposit(1);
        } catch (IOException e) {
            System.out.println("Logging");
            throw e;
        }
    }

    public static void show() {
        // Checked Exception
//        FileReader reader = null;

        try (var reader = new FileReader("file.txt");) {
            System.out.println("File opened");

            var value = reader.read();
//            new SimpleDateFormat().parse("");

//        } catch (FileNotFoundException ex) {
//            System.out.println(ex.getMessage());
//        } catch (IOException e) {
//            System.out.println("Could not read data");
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        } catch (IOException | ParseException e) {
//            System.out.println("Could not read data");
        } catch (IOException e) {
            System.out.println("Could not read data");
        }
//        finally {
//            if (reader != null) {
//                try {
//                    reader.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
    }
}
