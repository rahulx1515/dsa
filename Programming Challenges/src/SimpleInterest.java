import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principle amount: ");
        int principle = input.nextInt();
        System.out.print("Enter rate of interest: ");
        float rate = input.nextFloat();
        System.out.print("Enter time of borrowing money: ");
        float years = input.nextFloat();

        float SI = (principle * rate * years) / 100;
        System.out.println("Simple Interest is Rs: " + SI);
    }
}
