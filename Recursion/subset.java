// package Recursion;

public class subset {
    static int subset(int[] arr, int index){
        if(index == arr.length){
            return 1;
        }
        int take = subset(arr, index+1);
        int notTake = subset(arr, index+1);
        return take + notTake;
        // return 2*take;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(subset(arr, 0));
    }
}

