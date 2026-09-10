public class subsetSum {
    static boolean subsetSum(int[] arr, int i, int target, int currSum){
        if(i==arr.length){
            if(currSum==target){
                return true;
            }
            return false;
        }
        
        boolean take = subsetSum(arr, i+1, target, currSum+arr[i]);
        boolean notTake = subsetSum(arr, i+1, target, currSum);
        return take || notTake;
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        
        System.out.println(subsetSum(arr, 0, 10, 0));
    }
}
