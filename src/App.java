import java.util.Random;
import java.util.Scanner;

public class App {
    private static Scanner scanner = new Scanner(System.in);

    // test word
    private static String answer = "crane";

    // take user input for
    public static Random getSeed() {
        System.out.println("Enter a 5-10 digit seed: ");
        long seed = scanner.nextLong();
        Random RNG = new Random(seed);
        scanner.nextLine();

        return RNG;
    }

    // return guess with correct/incorrect letters
    public static String checkWord(String guess) {
        String result = "";

        if (guess.length() != 5) {
            throw new IllegalArgumentException("Word must be 5 letters");
        }

        for (int i = 0; i < 5; i++) {
            if (guess.toCharArray()[i] == answer.toCharArray()[i]) {
                result += "^";
            } else if (answer.contains(String.valueOf(guess.toCharArray()[i]))) {
                result += "*";
            } else {
                result += "-";
            }
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        getSeed();

        System.out.println("\nEnter a 5-letter word to begin");
        for (int i = 0; i < 5; i++) {
            String guess = scanner.nextLine();
            System.out.println(checkWord(guess) + "\n");
        }
        
        scanner.close();
    }
}
