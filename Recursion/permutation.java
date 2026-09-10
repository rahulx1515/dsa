import java.util.Arrays;

public class permutation {

    static void permute(int arr[], int start) {
        if (start == arr.length) {
            System.out.println(Arrays.toString(arr));
            return;
        }

        for (int i = start; i < arr.length; i++) {

            // Swap
            int temp = arr[i];
            arr[i] = arr[start];
            arr[start] = temp;

            // Recursive call
            permute(arr, start + 1);

            // Backtrack (swap back)
            temp = arr[i];
            arr[i] = arr[start];
            arr[start] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6};
        permute(arr, 0);   // calling the function
    }
}


// time complexity is n!

