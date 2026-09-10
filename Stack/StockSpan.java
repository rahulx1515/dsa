import java.util.*;

class StockSpan {
    public ArrayList<Integer> calculateSpan(int[] arr) {

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        ArrayList<Integer> res = new ArrayList<>();

        int n = arr.length;
        for(int i=0;i<n; i++){
            int span = 1;
            
            while(!stack.isEmpty() && arr[i] >= arr[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                span = i+1;
            } else {
                span = i-stack.peek();
            }
            res.add(span);
            stack.push(i);
        }
        return res;
    }
    public static void main(String[] args) {
        StockSpan obj = new StockSpan();
        int[] arr = {100, 80, 60, 70, 60, 75, 85};
        ArrayList<Integer> ans = obj.calculateSpan(arr);
        System.out.println(ans);
    }
}
