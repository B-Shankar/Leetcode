package ArraysAndArrayList.sorting.bucket_sort;

import java.util.*;

public class BucketSort {

    public static void bucketSort(double[] arr) {
        int n = arr.length;
        if (n <= 0) return;

        // Create empty buckets
        List<Double>[] buckets = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }

        // Put array elements into buckets
        for (double num : arr) {
            int index = (int) (num * n);
            buckets[index].add(num);
        }

        // Sort individual buckets
        for (List<Double> bucket : buckets) {
            Collections.sort(bucket); // insertion sort internally for small lists
        }

        // Concatenate all buckets
        int idx = 0;
        for (List<Double> bucket : buckets) {
            for (double num : bucket) {
                arr[idx++] = num;
            }
        }
    }

    public static void main(String[] args) {
        double[] arr = {0.42, 0.32, 0.23, 0.52, 0.25, 0.47, 0.51};
        bucketSort(arr);

        for (double num : arr) {
            System.out.print(num + " ");
        }
    }
}

