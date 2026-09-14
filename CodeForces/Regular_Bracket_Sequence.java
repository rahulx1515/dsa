import java.util.*;
public class Regular_Bracket_Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String s = sc.next();
            int sz = s.length();
            int qm = 0;
            int open =0;
            int close=0;
            
            for(int j=0;j<sz;j++){
                if(s.charAt(j)=='('){
                    open++;
                }
                else if(s.charAt(j)==')'){
                    close++;
                }
                else{
                    qm++;
                }
            }
            int diff = Math.abs(open-close);
            if(sz==0){
                System.out.println("yes");
            }
            else if(s.charAt(0)==')' || s.charAt(sz-1)=='('){
                System.out.println("no");
            }
            else{
                if(diff%2==0 && qm%2==0){
                    System.out.println("yes");
                }
                else{
                    System.out.println("no");
                }
            }
            
        }
    }
}