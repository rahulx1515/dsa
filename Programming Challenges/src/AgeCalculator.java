import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please! Enter your age: ");
        int age = input.nextInt();

        if (age <= 13) {
            System.out.println("You are a child");
        } else if (age <= 20) {
            System.out.println("You are teenager");
        } else if (age <= 65) {
            System.out.println("You are adult");
        } else {
            System.out.println(("You are senior citizen"));
        }
    }
}
