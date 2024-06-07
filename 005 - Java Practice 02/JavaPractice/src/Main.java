import exceptions.ExceptionDemo;
import generics.GenericList;

import java.io.IOException;

// This file is made by EmJey
// Project: JavaPractice.java
// FileName: Main.java
// Date: 2024/06/05
// Modified Date: 2024/06/07
// Email: emjeydev@gmail.com
// Github: emjeydev

public class Main {
    public static void main(String[] args) {
        /* Exceptions */

//        try {
//            ExceptionDemo.get();
//        } catch (IOException e) {
//            System.out.println("An unexpected error occurred");
//        }

//        ExceptionDemo.withdrawChain();

        /* Generics */

        var list = new GenericList<Integer>();
        list.add(1);
        list.add(8);
        list.add(5);
        
        int number = list.get(1);
    }
}