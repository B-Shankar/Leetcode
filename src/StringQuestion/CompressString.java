package StringQuestion;

// String Compression Problem (common in interviews + LeetCode 443 variant).
public class CompressString {
    public static String compress(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                sb.append(s.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        // append last character count
        sb.append(s.charAt(s.length() - 1)).append(count);

        // Return smaller string (optional based on interview ask)
        return sb.length() < s.length() ? sb.toString() : s;
    }

    public static void main(String[] args) {
        System.out.println(compress("aabcccccaaa")); // Output: a2b1c5a3
        System.out.println(compress("abc"));         // Output: abc
    }
}
