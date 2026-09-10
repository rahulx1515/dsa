public class SumPositive {
    public static void main(String[] args) {
        int[] numArr = ArrayUtility.inputArray();


        int sum = 0;
        for (int num: numArr) {
            if (num < 0) {
                continue;
            }
            sum += num;
        }
        System.out.println("The sum of positive numbers is: " + sum);
    }
}

// it skips negative numbers