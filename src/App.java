//import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            String guess = scanner.nextLine();
            System.out.println(checkWord(guess) + "\n");
        }
        
        scanner.close();
    }

    // read word list
    public static String answer = "crane";

    // take user input for
    // - random seed
    // - guesses

    // return guess with correct/incorrect letters
    public static String checkWord(String guess) {
        String result = "";

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
}
