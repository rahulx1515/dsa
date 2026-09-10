import java.util.Scanner;

public class FloatMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ur first decimal number: ");
        double first = input.nextDouble();
        System.out.print("Enter ur second decimal number: ");
        double second = input.nextDouble();

        double mul = first * second;
        System.out.println("Result is: " + mul);
    }
}
