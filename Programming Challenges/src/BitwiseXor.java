import java.util.Scanner;

public class BitwiseXor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ur first number: ");
        int first = input.nextInt();

        System.out.print("Enter ur second number: ");
        int second = input.nextInt();

        int result = first ^ second; // same ho toh 0 otherwise 1
        System.out.println(result);
    }
}
