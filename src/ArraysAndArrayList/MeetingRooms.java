package ArraysAndArrayList;

import java.util.*;

class MeetingRooms {
    public int minMeetingRooms(int[][] intervals) {
        if (intervals.length == 0) return 0;

        // Sort meetings by start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // Min-heap for earliest finishing meeting
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Add the end time of the first meeting
        minHeap.add(intervals[0][1]);

        for (int i = 1; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            // If current meeting starts after earliest ended meeting frees a room
            if (start >= minHeap.peek()) {
                minHeap.poll(); // free room
            }

            // Assign current meeting's end time to a room
            minHeap.add(end);
        }

        // The size of heap = number of rooms used
        return minHeap.size();
    }

    public static void main(String[] args) {
        int[][] arr1 = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};

        MeetingRooms obj = new MeetingRooms();
        int ans = obj.minMeetingRooms(arr1);

        System.out.println(ans);
    }
}

