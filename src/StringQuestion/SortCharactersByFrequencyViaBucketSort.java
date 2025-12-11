package StringQuestion;

import java.util.*;

// LeetCode 451: Sort Characters By Frequency
// Bucket Sort (Faster)
public class SortCharactersByFrequencyViaBucketSort {

    public String frequencySort(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // bucket array index = frequency
        List<Character>[] bucket = new ArrayList[s.length() + 1];

        for (char c : freq.keySet()) {
            int f = freq.get(c);
            if (bucket[f] == null)
                bucket[f] = new ArrayList<>();
            bucket[f].add(c);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = bucket.length - 1; i >= 0; i--) {
            if (bucket[i] != null) {
                for (char c : bucket[i]) {
                    sb.append(String.valueOf(c).repeat(i));
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        SortCharactersByFrequencyViaBucketSort obj = new SortCharactersByFrequencyViaBucketSort();
        String s = "tree";
        String result = obj.frequencySort(s);
        System.out.println("Sorted by frequency: " + result);
    }
}
