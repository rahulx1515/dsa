package Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Meeting_Room_II {
    public static void main(String[] args) {
        int[][] intervals = {{0,30},{5,10},{15,20}};
    //     Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
    //     for(int i=0; i<intervals.length; i++){
    //         System.out.println(intervals[i][0] + " " + intervals[i][1]);
    //     }
    }

    public static int Meeting_Room(int[][] intervals){
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(intervals[0][1]);
        for(int i=1; i<intervals.length; i++){
            if(intervals[i][0] >= pq.peek()){
                pq.poll();
            }
            pq.add(intervals[i][1]);
        }
        return pq.size();
    }
}
