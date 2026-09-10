import java.util.*;

class NextGreater {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        int n = arr.length;

        int[] res = new int[n];
       
        for(int i = n-1; i>=0; i--){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }

            if(st.isEmpty()){
                res[i] = -1;
            } else {
                res[i] = st.peek();
            }
            st.push(arr[i]);

        }
        for(int x:res){
            ans.add(x);
        }
        return ans;

    }

    public static void main(String[] args) {
        NextGreater obj = new NextGreater();
        int[] arr = {4, 5, 2, 10};
        ArrayList<Integer> ans = obj.nextLargerElement(arr);
        System.out.println(ans);
    }
}