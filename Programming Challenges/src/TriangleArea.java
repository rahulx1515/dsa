import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base of triangle: ");
        double base = input.nextDouble();
        System.out.print("Enter height of triangle: ");
        double height = input.nextDouble();

        double area =  (base * height) / 2;
        System.out.println("Area is: " + area);
    }
}
