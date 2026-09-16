import java.util.*;
public class Min_Sum_Pair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(minSumPair(arr));
    }
    public static int minSumPair(int[] arr){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<arr.length; i++){
            pq.add(arr[i]);
        }
        int sum = 0;
        while(pq.size() > 1){
            int a = pq.poll();
            int b = pq.poll();
            sum += (a+b);
        }
        return sum;
    }
}
