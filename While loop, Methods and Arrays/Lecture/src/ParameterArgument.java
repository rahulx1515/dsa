public class ParameterArgument {
    public static void main(String[] args) {
        System.out.println(sumTwoNumbers(4, 7)); //arguments
        System.out.println(sumTwoNumbers(45, -9));
        System.out.println(sumTwoNumbers(-62, -62));

    }

    public static int sumTwoNumbers(int firstNum, int secondNum) { //parameters
        System.out.println("First Number Received: " + firstNum);
        System.out.println("Second Number Received: " + secondNum);
        return firstNum + secondNum;
    }
}
