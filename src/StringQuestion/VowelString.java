package StringQuestion;

import java.util.Arrays;

// input : abcdefghijklmnopqrstuvxyz
// output :abcdeffgghhiijjjkkklllmmmnnnoooppppqqqqrrrrssssttttuuuuvvvvvwwwwwxxxxxyyyyyzzzzz
public class VowelString {

    public String incrementVowelString(String str) {
        char[] input = str.toCharArray();
        System.out.println("input: " + Arrays.toString(input));

        int counter = 1;
        StringBuilder ans = new StringBuilder();

        for (char ch : str.toCharArray()) {
            // append current character counter times
            for (int i = 0; i < counter; i++) {
                ans.append(ch);
            }

            // if vowel → increase counter for next characters
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                counter++;
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        VowelString vowelString = new VowelString();

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        String input = "abcdefghijklmnopqrstuvxyz";
        String value = vowelString.incrementVowelString(input);

        System.out.println("value: " + value);
    }
}
