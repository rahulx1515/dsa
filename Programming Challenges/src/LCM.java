import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int first = input.nextInt();
        System.out.print("Enter your number: ");
        int second = input.nextInt();

        int lcm = printLCM(first, second);
        System.out.println("LCM of two numbers is: " + lcm);
    }

    public static int printLCM(int first, int second) {
        int i = 1;
        while (i <= second) {
            int factor = first * i;
            if (factor % second == 0) {
                return factor;
            }
            i++;
        }
        return 0; //yaha tak loop kabhi pahuchega bhi nhi
    }
}
