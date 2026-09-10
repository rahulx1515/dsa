import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int first = input.nextInt();
        System.out.print("Enter your number: ");
        int second = input.nextInt();

        int gcd = printGCD(first, second);
        System.out.println("GCD of numbers is: " + gcd);
    }

    public static int printGCD(int first, int second) {
        int gcd = 1;
        int i = 2;
        int least = printleast(first, second);
        while (i < least) {
            if (first % i == 0 && second % i == 0) {
                gcd = i;
            }
            i++;
        }
        return gcd;
    }

    public static int printleast(int first, int second) {
        if (first < second) {
            return first;
        } else {
            return second;
        }
    }
}
