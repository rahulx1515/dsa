import java.util.Scanner;

public class BitwiseAnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ur first number: ");
        int first = input.nextInt();

        System.out.print("Enter ur second number: ");
        int second = input.nextInt();

        int result = first & second;
        System.out.println(result);
    }
}
