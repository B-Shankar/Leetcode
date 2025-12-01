package StacksQueues;
import java.util.*;

public class AnagramMappings {

    public int[] anagramMappings(int[] arr1, int[] arr2) {
        Map<Integer, Deque<Integer>> indexMap = new HashMap<>();

        // Store indices of arr2 values in descending order
        for (int i = 0; i < arr2.length; i++) {
            indexMap
                    .computeIfAbsent(arr2[i], x -> new ArrayDeque<>())
                    .addFirst(i);     // add in descending order
        }

        int[] result = new int[arr1.length];

        // For each element in arr1, take the largest available index
        for (int i = 0; i < arr1.length; i++) {
            result[i] = indexMap.get(arr1[i]).pollFirst();
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {7, 5, 8};
        int[] arr2 = {8, 7, 5};

        AnagramMappings obj = new AnagramMappings();
        int[] arr3 = obj.anagramMappings(arr1, arr2);

        System.out.println(Arrays.toString(arr3));
    }
}
