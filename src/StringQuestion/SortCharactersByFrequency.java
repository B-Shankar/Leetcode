package StringQuestion;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

// LeetCode 451: Sort Characters By Frequency
// frequently asked HashMap + PriorityQueue problem.
public class SortCharactersByFrequency {

    public String frequencySort(String s) {
        // Step 1: count frequency
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // Step 2: max heap by frequency
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap =
                new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        maxHeap.addAll(freq.entrySet());

        // Step 3: build result
        StringBuilder sb = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            Map.Entry<Character, Integer> entry = maxHeap.poll();
            char ch = entry.getKey();
            int count = entry.getValue();

            for (int i = 0; i < count; i++) {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        SortCharactersByFrequency obj = new SortCharactersByFrequency();
        String s = "tree";
        String result = obj.frequencySort(s);
        System.out.println("Sorted by frequency: " + result);
    }
}
