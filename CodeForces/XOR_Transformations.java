import java.util.*;
 
public class XOR_Transformations{
 
    static long getAnswer(int[] a) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
 
        for (int x : a) {
            min = Math.min(min, x);
            max = Math.max(max, x);
        }
 
        return (long) max - min;
    }
 
    static int[] transform(int[] a) {
        int n = a.length;
 
        int size = n * (n - 1) / 2;
        int[] xors = new int[size];
 
        int k = 0;
 
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                xors[k++] = a[i] ^ a[j];
            }
        }
 
        Arrays.sort(xors);
 
        return Arrays.copyOf(xors, n);
    }
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
 
            int n = sc.nextInt();
            int q = sc.nextInt();
 
            int[] a = new int[n];
 
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
 
            int[] queries = new int[q];
            int maxQuery = 0;
 
            for (int i = 0; i < q; i++) {
                queries[i] = sc.nextInt();
                maxQuery = Math.max(maxQuery, queries[i]);
            }
 
            HashMap<Integer, Long> answers = new HashMap<>();
 
            int[] current = a.clone();
 
            long currentAnswer = getAnswer(current);
 
            answers.put(0, currentAnswer);
 
            int step = 0;
 
            while (step < maxQuery) {
 
                int[] next = transform(current);
 
                step++;
 
                currentAnswer = getAnswer(next);
 
                answers.put(step, currentAnswer);
 
                if (Arrays.equals(current, next)) {
                    break;
                }
 
                current = next;
            }
 
            long finalAnswer = currentAnswer;
 
            for (int query : queries) {
 
                if (answers.containsKey(query)) {
                    System.out.println(answers.get(query));
                } else {
                    System.out.println(finalAnswer);
                }
            }
        }
 
        sc.close();
    }
}