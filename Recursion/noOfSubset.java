class noOfSubset {
    static int noOfsubset(int[] arr, int i, int target, int currSum) {
        if (i == arr.length) {
            if (currSum == target) {
                return 1;
            }
            return 0;
        }

        int take = noOfsubset(arr, i + 1, target, currSum + arr[i]);
        int notTake = noOfsubset(arr, i + 1, target, currSum);

        return take + notTake;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(noOfsubset(arr, 0, 10, 0));
    }
}
