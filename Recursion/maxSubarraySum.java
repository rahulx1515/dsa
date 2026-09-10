public class maxSubarraySum {
    static int maxSubarraySum(int[] arr, int i, int currSum){
        if(i==arr.length){
            return currSum;
        }
        int take = maxSubarraySum(arr, i+1, currSum+arr[i]);           
        int notTake = maxSubarraySum(arr, i+1, currSum);
        return Math.max(take, notTake);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2,3,-1,4,6};
        System.out.println(maxSubarraySum(arr, 0, 0));
    }
}
