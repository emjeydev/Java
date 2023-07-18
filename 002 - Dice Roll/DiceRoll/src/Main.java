
// This file is made by EmJey
// Project: DiceRoll
// FileName: Main
// Date: 2023/07/18
// Email: emjeydev@gmail.com
// Github: emjeydev

public class Main {
    public static void main(String[] args) {
        Dice dice = new Dice();

        System.out.println("Previous: " + dice.previousRoll);
        System.out.println(dice.roll());
        System.out.println("Previous: " + dice.previousRoll);
        System.out.println(dice.roll());
        System.out.println("Previous: " + dice.previousRoll);
        System.out.println(dice.roll());

    }
}