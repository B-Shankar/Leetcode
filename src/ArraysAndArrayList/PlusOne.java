package ArraysAndArrayList;

// LeetCode 66: Plus One
public class PlusOne {
    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0; // if digit is 9
        }

        // If we reach here, number was like 999 -> we need a new array
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        PlusOne obj = new PlusOne();
        int[] digits = {9, 9, 9};
        int[] result = obj.plusOne(digits);
        // Output the result
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
