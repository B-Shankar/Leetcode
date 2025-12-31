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


    public static void main(String[] args) {
        System.out.print("Enter String: ");
        Scanner input = new Scanner(System.in);
//        String ip = input.nextLine();
        int ip = input.nextInt();

//        boolean res = isPalindrome(ip);
        boolean res = PalindromeNumber(ip);
        if (res) {
            System.out.println(ip + "- is a palindrome string.");
        } else {
            System.out.println(ip + "- is not a palindrome string.");
        }
    }
}
