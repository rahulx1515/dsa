import java.util.*;
public class Good_Contest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            int a3 = sc.nextInt();

            int strong = Math.min(a1, Math.min(a2, a3));

            int weak = n-strong;
            System.out.println(weak);

        }
    }
}
