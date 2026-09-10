public class mergeSort {

    void mergeSort(int arr[], int l, int r) {
        if(l<r){
            int mid = (l+r)/2;
            mergeSort( arr, l, mid);
            mergeSort( arr,  mid+1, r);
            
            merge(arr,  l,  mid,  r);
        }
    }
    
    void merge(int[] arr, int l, int mid, int r){
        int m = mid-l+1;
        int n = r-mid;
        
        int[] a = new int[m];
        int[] b = new int[n];
        
        for(int i=0; i<m; i++){
            a[i] = arr[l+i];
        }
        
        for(int i=0;i<n;i++){
            b[i] = arr[mid+1+i];
        }
        
        int i=0; 
        int j=0;
        int k = l;
        
        while(i<m && j<n){
            if(a[i]<b[j]){
                arr[k++] = a[i++];
            }
            else{
                arr[k++] = b[j++];
            }
        }
        
        while(i<m){
            arr[k++] = a[i++];
        }
        while(j<n){
            arr[k++] = b[j++];
        }
    }

    public static void main(String[] args) {

        int[] arr = {4, 1, 3, 9, 7};

        mergeSort obj = new mergeSort();
        obj.mergeSort(arr, 0, arr.length - 1);

        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
