import exceptions.ExceptionDemo;
import generics.GenericList;
import generics.Instructor;
import generics.User;
import generics.Utils;

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

//        var list = new GenericList<Integer>();
//        list.add(1);
//        list.add(8);
//        list.add(5);
//
//        int number = list.get(1);
//
//        var user1 = new User(50);
//        var user2 = new User(20);
//
//        if (user1.compareTo(user2) < 0)
//            System.out.println("user1 < user2");
//        else if (user1.compareTo(user2) == 0)
//            System.out.println("user1 == user2");
//        else
//            System.out.println("user1 > user2");
//
//
//        var max = Utils.max(1, 3);
//        System.out.println(max);
//
//
//        var maxUser = Utils.max(new User(140), new User(50));
//        System.out.println(maxUser);
//
//
//        Utils.print(1, "One");
//
//
//        User user = new Instructor(10);
//        Utils.printUser(user);
//
//
//        var instructor = new GenericList<Instructor>();
//        instructor.add(new Instructor(20));
//        instructor.add(new Instructor(40));
//        instructor.add(new Instructor(60));
//
//        Utils.printUsers(instructor);


        /* Collections */

        var list = new GenericList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        for (var item: list)
            System.out.println(item);
    }
}