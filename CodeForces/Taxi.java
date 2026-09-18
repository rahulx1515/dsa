import java.util.*;

public class Taxi {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] ans = new int[n];
      for(int i=0;i<n;i++){
        ans[i] = sc.nextInt();
      }
      Arrays.sort(ans);
      int l =0;
      int r = n-1;
      int count =0;
      while(l<=r){
        count++;
        int s = 4-ans[r];
        while(l<=r && ans[l]<=s){
          s -= ans[l];
          l++;
        }
      r--;
      }
      System.out.println(count);
    }
}