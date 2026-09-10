import java.util.Scanner;

public class MinimumOfNumTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = input.nextInt();
        MinimumOfNumTernary ternary = new MinimumOfNumTernary();
        int min = ternary.min(num1, num2);
        System.out.println("Minimum number is: " + min);
    }

    public int min(int num1, int num2) {
        return num1 < num2 ? num1: num2;

//        if (num1 < num2) {
//            return num1;
//        } else {
//            return num2;
//        }
    }
}
