package Examples;

import java.util.Scanner;

public class PalindromeString {

    static boolean isPalindrome(String input) {
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end))
                return false;

            start++;
            end--;
        }
        return true;
    }

    static boolean PalindromeNumber(int num) {

        int original = num;
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        return (original == reverse);
    }

    // ip: "A man, a plan, a canal: Panama"
    static boolean isPalindromeNonCaseSensitive(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            // skip non-alphanumeric from left
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            // skip non-alphanumeric from right
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) !=
                    Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print("Enter String: ");
        Scanner input = new Scanner(System.in);
//        String ip = input.nextLine();
//        int ip = input.nextInt();
        String ip = input.nextLine();

//        boolean res = isPalindrome(ip);
//        boolean res = PalindromeNumber(ip);
        boolean res = isPalindromeNonCaseSensitive(ip);
        if (res) {
            System.out.println(ip + "- is a palindrome string.");
        } else {
            System.out.println(ip + "- is not a palindrome string.");
        }
    }
}
