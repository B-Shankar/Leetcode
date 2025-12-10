package StringQuestion;

// Most frequent character
public class MostFrequentCharacter {

    public static char mostFrequentChar(String s) {
        int[] freq = new int[256]; // ASCII

        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        int max = 0;
        char result = ' ';

        for (char c : s.toCharArray()) {
            if (freq[c] > max) {
                max = freq[c];
                result = c;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "successes";
        char ans = mostFrequentChar(s);
        System.out.println("Most frequent character: " + ans);
    }
}
