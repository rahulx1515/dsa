import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 5, guess;

        do {
            System.out.print("Please guess the number between 0 to 10: ");
            guess = input.nextInt();
        } while (num != guess);
        System.out.println("You have successfully guessed the number");
    }
}


// 5
