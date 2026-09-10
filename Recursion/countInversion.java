class countInversion {
    
    static int mergeSort(int arr[], int l, int r) {
      
        int count =0;
        if(l<r){
            int mid = (l+r)/2;
            count = count + mergeSort(arr,l,mid);
            count = count + mergeSort(arr,mid+1, r);
            count = count + merge(arr,l,mid,r);
        }
        return count;
    }
    
    static int merge(int[] arr, int l, int mid, int r){
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
        
        int res = 0;
        int i=0; 
        int j=0;
        int k = l;
        
        while(i<m && j<n){
            if(a[i]<=b[j]){
                arr[k++] = a[i++];
            }
            else{
                arr[k++] = b[j++];
                res = res+(m-i);
            }
        }
        
        while(i<m){
            arr[k++] = a[i++];
        }
        while(j<n){
            arr[k++] = b[j++];
        }
        return res;
    }
    
    static int inversionCount(int arr[]) {
        
        return mergeSort(arr, 0, arr.length-1);
    }

    public static void main(String[] args) {

    int[] arr = {2, 4, 1, 3, 5};  
    int result = inversionCount(arr);

    System.out.println("Inversion Count = " + result);
    }

}



