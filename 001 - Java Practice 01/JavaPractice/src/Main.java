import java.awt.*;
import java.util.Scanner;

// This file is made by EmJey
// Project: JavaPractice
// FileName: Main
// Date: 2023/06/19
// Email: emjeydev@gmail.com
// Github: emjeydev


public class Main {
    public static void main(String[] args) {

//        Car Class Usage

//        Car myCar = new Car(22.5, "1BC32E", Color.blue, true);
//
//        Car sallyCar = new Car(13.9, "3D20BN", Color.black, false);
//
//        System.out.println("My Car's License Plate: " + myCar.licensePlate);
//        System.out.println("Sally's License Plate: " + sallyCar.licensePlate);
//
//        System.out.println(myCar.paintColor);
//        myCar.changePaintColor(Color.RED);
//        System.out.println(myCar.paintColor);
//
//        double myCarSpeed = 50;
//        myCarSpeed =  myCar.speedUp(myCarSpeed);
//        System.out.println(myCarSpeed);


//        Basic Challenge

//        Dog d = new Dog("Doug", 3);
//
//        d.bark();
//
//        int dogYears = d.getDogYears();
//        System.out.println(dogYears + " dog years.");
//
//        d.fetch();
//        d.fetch();
//        d.fetch();
//        d.fetch();


//        Control Flow

//        System.out.println("Enter an age");
//        Scanner in = new Scanner(System.in);
//        int age = in.nextInt();
//
//        if (age >= 0 && age <= 5) {
//            System.out.println("Baby");
//        } else if (age >= 6 && age <= 11) {
//            System.out.println("Kid");
//        } else if (age >= 12 && age <= 17) {
//            System.out.println("Teen");
//        } else if (age >= 18) {
//            System.out.println("Adult");
//        } else {
//            System.out.println("Invalid age");
//        }
//
//        System.out.println("Thanks for using this programm!");



//        Debugging With Print Statement

        Coin coin = new Coin();
        System.out.println("Initial: " + coin.getFaceUp());

        for (int i = 0; i < 10; i++) {
            coin.flip();
            System.out.println("After Flip: " + coin.getFaceUp());
        }

    }
}