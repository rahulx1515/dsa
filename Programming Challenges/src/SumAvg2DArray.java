public class SumAvg2DArray {
    public static void main(String[] args) {
        int[][] numArr = ArrayUtility.input2DArray();
        long sum = sum(numArr);
        double avg = average(numArr);
        System.out.println("Your sum of array is: " + sum);
        System.out.println("Your average of array is: " + avg);
    }

    public static long sum(int[][] numArr) {
        long sum = 0;
        int i = 0;
        while (i < numArr.length) {
            int j = 0;
            while (j < numArr.length) {
                sum += numArr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }

    public static double average(int[][] numArr) {
        if (numArr.length == 0) {
            return 0;
        }
        int rows = numArr.length;
        int cols = numArr[0].length;
        double size = rows * cols;
        return sum(numArr) / size;
    }
}
