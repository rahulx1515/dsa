import java.util.*;
public class Fair_Playoff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int[] arr = new int[4];
            for(int j =0;j<4;j++){
                arr[j] = sc.nextInt();
            }
            int w1 = Math.max(arr[0],arr[1]);
            int l1 = Math.min(arr[0],arr[1]);
            int w2 = Math.max(arr[2],arr[3]);
            int l2 = Math.min(arr[2],arr[3]);
            if(w1<l2 || w2<l1){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
        
    }
}