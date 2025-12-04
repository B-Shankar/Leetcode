package ArraysAndArrayList;

import java.util.ArrayList;
import java.util.List;

// 17. Letter Combinations of a Phone Number
public class LetterCombinations {
    private static final String[] MAP = {
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) return result;

        backtrack(0, digits, new StringBuilder(), result);
        return result;
    }

    private void backtrack(int index, String digits, StringBuilder sb, List<String> result) {
        if (index == digits.length()) {
            result.add(sb.toString());
            return;
        }

        String letters = MAP[digits.charAt(index) - '0'];
        for (char c : letters.toCharArray()) {
            sb.append(c);
            backtrack(index + 1, digits, sb, result);
            sb.deleteCharAt(sb.length() - 1); // undo
        }
    }

    public static void main(String[] args) {
        LetterCombinations obj = new LetterCombinations();
        String digits = "23";
        List<String> combinations = obj.letterCombinations(digits);
        System.out.println(combinations); // Output: [ad, ae, af, bd, be, bf, cd, ce, cf]
    }
}
