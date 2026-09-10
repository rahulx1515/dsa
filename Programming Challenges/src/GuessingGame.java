import java.util.Scanner;

public class GuessingGame {

    int random;
    GuessingGame() {
        random = (int) Math.ceil(Math.random() * 100);
    }

    /**
     *
     * @param guessNUmber the number that player guessed
     * @return
     * - Negative if the number is smaller.
     * - 0 if the guessed number is correct.
     * - Positive if the guessed number is higher.
     */


    int guess(int guessNUmber) {
        return guessNUmber - random;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GuessingGame game = new GuessingGame();
        System.out.println("Guess the number between 1 to 100");
        int guess;
        int result ;
        do {
            System.out.print("Guess the number: ");
            guess = input.nextInt();
            result = game.guess(guess);
            if (result == 0) {
                System.out.println("Your guess is correct");
            } else if (result < 0) {
                System.out.println("Please guess higher");
            } else {
                System.out.println("Please guess lower");
            }
        } while (result != 0);
    }
}
