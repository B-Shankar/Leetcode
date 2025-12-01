package ArraysAndArrayList;

import java.util.*;

class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][0];

        // Step 1: Sort by start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();

        // Step 2: Merge intervals
        int[] current = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            int[] next = intervals[i];

            if (current[1] >= next[0]) {
                // Overlap → merge
                current[1] = Math.max(current[1], next[1]);
            } else {
                // No overlap → push current, move to next
                result.add(current);
                current = next;
            }
        }

        // Add last merged interval
        result.add(current);

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][] arr1 = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};

        MergeIntervals obj = new MergeIntervals();
        int[][] arr = obj.merge(arr1);

        System.out.println(Arrays.deepToString(arr));
    }
}
