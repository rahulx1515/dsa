import java.util.Scanner;

public class FahrenheitToCelcius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in fahrenheit: ");
        float tempInFah = input.nextFloat();
        float cel = (tempInFah - 32) * 5.0f/9.0f;
        System.out.println("Temperature in degree celcius is: " + cel + "C");
    }
}
