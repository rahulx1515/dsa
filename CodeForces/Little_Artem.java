import java.util.*;

public class Little_Artem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();

            for(int i=0; i<n; i++){
                for(int j =0; j<m; j++){
                    if(i==0 && j==0){
                        System.out.print("W");
                    } else {
                        System.out.print("B");
                    }
                }
                System.out.println();
            }

        }
    }
    
}
