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


    public static void main(String[] args) {
        System.out.print("Enter String: ");
        Scanner input = new Scanner(System.in);
        String ip = input.nextLine();

        boolean res = isPalindrome(ip);
        if (res) {
            System.out.println(ip + "- is a palindrome string.");
        } else {
            System.out.println(ip + "- is not a palindrome string.");
        }
    }
}
