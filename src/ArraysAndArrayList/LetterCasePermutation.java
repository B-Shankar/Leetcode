package ArraysAndArrayList;

import java.util.ArrayList;
import java.util.List;

// 784. Letter Case Permutation
public class LetterCasePermutation {
    public List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s.toCharArray(), 0, result);
        return result;
    }

    private void backtrack(char[] arr, int index, List<String> result) {
        if (index == arr.length) {
            result.add(new String(arr));
            return;
        }

        if (Character.isDigit(arr[index])) {
            backtrack(arr, index + 1, result);
        } else {
            // keep original
            backtrack(arr, index + 1, result);

            // change case
            arr[index] ^= 32; // flip case
            backtrack(arr, index + 1, result);

            // restore state
            arr[index] ^= 32;
        }
    }

    public static void main(String[] args) {
        LetterCasePermutation obj = new LetterCasePermutation();

        String input = "a1b2";

        List<String> permutations = obj.letterCasePermutation(input);
        System.out.println(permutations); // Output: ["a1b2","a1B2","A1b2","A1B2"]
    }
}
