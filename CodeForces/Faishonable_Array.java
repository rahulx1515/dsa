import java.util.*;

public class Faishonable_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] freq = new int[101];

            for (int i = 0; i < n; i++) {
                freq[sc.nextInt()]++;
            }

            StringBuilder ans = new StringBuilder();

            while (true) {
                boolean used = false;

                for (int x = 100; x >= 1; x--) {
                    if (freq[x] > 0) {
                        ans.append(x).append(" ");
                        freq[x]--;
                        used = true;
                    }
                }

                if (!used) {
                    break;
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}