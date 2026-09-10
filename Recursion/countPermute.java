
public class countPermute {

    static int countPermute(int arr[], int start) {

        if (start == arr.length) {
            return 1;
        }

        int count = 0;

        for (int i = start; i < arr.length; i++) {

            // Swap
            int temp = arr[i];
            arr[i] = arr[start];
            arr[start] = temp;

            // Recursive call
            count += countPermute(arr, start + 1);

            // Backtrack (swap back)
            temp = arr[i];
            arr[i] = arr[start];
            arr[start] = temp;
        }

        // Return after loop finishes
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6};
        int result = countPermute(arr, 0);
        System.out.println("Total permutations: " + result);
    }
}
