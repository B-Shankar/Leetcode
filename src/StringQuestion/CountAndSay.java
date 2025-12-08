package StringQuestion;

// LeetCode 38: Count and Say
public class CountAndSay {
    public String countAndSay(int n) {
        String s = "1";
        for (int i = 2; i <= n; i++) {
            s = buildNext(s);
        }
        return s;
    }

    private String buildNext(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                sb.append(count).append(s.charAt(i - 1));
                count = 1;
            }
        }
        sb.append(count).append(s.charAt(s.length() - 1)); // append last group

        return sb.toString();
    }

    public static void main(String[] args) {
        CountAndSay obj = new CountAndSay();
        int n = 5;
        String result = obj.countAndSay(n);
        System.out.println("The " + n + "th term in the Count and Say sequence is: " + result);
    }
}
