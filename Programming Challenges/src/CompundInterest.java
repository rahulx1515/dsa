import java.util.Scanner;

public class CompundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principle amount: ");
        int amount = input.nextInt();
        System.out.print("Enter rate: ");
        float rate = input.nextFloat();
        System.out.print("Enter time period: ");
        float years = input.nextFloat();

        double CI = amount * Math.pow((1 + rate / 100), years);
        System.out.println("Compund Interest is Rs: " + CI);
    }
}
