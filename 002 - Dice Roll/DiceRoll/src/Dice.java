import java.util.Random;

// This file is made by EmJey
// Project: DiceRoll
// FileName: Main
// Date: 2023/07/18
// Email: emjeydev@gmail.com
// Github: emjeydev

public class Dice {
    Random random;
    int previousRoll = -1;

    public Dice() {
        this.random = new Random();
    }

    public int roll() {
        int currentRoll = this.random.nextInt(6) + 1;
        this.previousRoll = currentRoll;
        return currentRoll;
    }
}
