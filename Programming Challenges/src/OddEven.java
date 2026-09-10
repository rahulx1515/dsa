import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = input.nextInt();

        if (num%2==0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}
