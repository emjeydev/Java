import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void findNumberOfVowelsAndConsonants(String input) {
        int vowelsCount = 0;
        int consonantsCount = 0;
        String vowels = "aeoiuy";
        String normalized = (input.toLowerCase()).trim();
        char[] charArray = normalized.toCharArray();

        for (char c : charArray) {
            if (vowels.indexOf(c) != -1) {
                vowelsCount++;
            } else if (c != ' ') {
                consonantsCount++;
            }
        }

        System.out.println("The String \"" + input.trim() + "\" has " + vowelsCount + " vowels.");
        System.out.println("The String \"" + input.trim() + "\" has " + consonantsCount + " consonants.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String string = sc.nextLine();
        sc.close();

        findNumberOfVowelsAndConsonants(string);


    }
}