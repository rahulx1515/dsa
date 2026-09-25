import java.util.Scanner;

public class Turn_Into_a_Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while(t-- >0){
            int n = sc.nextInt();
            char c = sc.next().charAt(0);

            char[] s = sc.next().toCharArray(); 
            int coins=0;
            for (int i = 0, j = n - 1; i < j; i++, j--){
                if(s[i] == s[j]) continue;
                if(s[i] == c || s[j] == c) coins++;
                else coins+=2;
            }
            sb.append(coins).append('\n');


        }
        System.out.print(sb);
    }
}