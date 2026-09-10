package Heap;

import java.util.Scanner;

public class Busyman_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pair[] arr = new Pair[n];
        for(int i = 0; i<n; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            arr[i] = new Pair(start, end);
        }
        
        Arrays.sort(arr,(a,b) -> a.end - b.end);
        int activities = 1;
        int end = arr[0].end;
        for(int i = 1; i<arr.length; i++){
            if(arr[i].start >= end){
                activities++;
                end = arr[i].end;
            }
        }
        System.out.println(activities);
    }
    
}
static class Pair {
    int start;
    int end;

    public Pair(int start, int end){
        this.start = start;
        this.end = end;
    }
}