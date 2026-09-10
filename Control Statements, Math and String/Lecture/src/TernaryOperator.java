import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = input.nextInt();

//        int greaterNumber;
//        if (num1 > num2) {
//            greaterNumber = num1;
//        } else {
//            greaterNumber = num2;
//        }


        int greaterNumber = num1 > num2 ? num1 : num2;
        System.out.println(greaterNumber + " is the greater number");
    }
}