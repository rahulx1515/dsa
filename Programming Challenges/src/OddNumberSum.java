import java.util.Scanner;

public class OddNumberSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        int sum = printOddNumberSum(num);
        System.out.println("OddSum till " + num + " is: " + sum);
    }

    public static int printOddNumberSum(int num) {
        int sum = 0;
        int i = 1;
        while (i <= num) {
            sum += i;
            i += 2;
        }
        return sum;
    }
}
