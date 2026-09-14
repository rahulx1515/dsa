import java.util.*;

public class Two_Adjacent_Matrix {

    static void fill(int[][] a, int[] nums, int idx) {
        if (idx == nums.length) return;

        int n = a.length;
        a[idx / n][idx % n] = nums[idx];

        fill(a, nums, idx + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            if (n == 2) {
                System.out.println(-1);
                continue;
            }

            int[] nums = new int[n * n];
            int k = 0;

            // Odd numbers
            for (int i = 1; i <= n * n; i += 2)
                nums[k++] = i;

            // Even numbers
            for (int i = 2; i <= n * n; i += 2)
                nums[k++] = i;

            int[][] a = new int[n][n];

            fill(a, nums, 0);

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++)
                    System.out.print(a[i][j] + " ");
                System.out.println();
            }
        }
    }
}