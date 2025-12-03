package ArraysAndArrayList;

// 556. Next Greater Element III

//classic next-permutation algorithm
public class NextGreaterElement {
    public int nextGreaterElement(int n) {
        char[] digits = String.valueOf(n).toCharArray();
        int len = digits.length;

        // 1) find pivot i: rightmost index where digits[i] < digits[i+1]
        int i = len - 2;
        while (i >= 0 && digits[i] >= digits[i + 1]) {
            i--;
        }
        if (i < 0) return -1; // digits are in descending order, no greater permutation

        // 2) find rightmost j > i such that digits[j] > digits[i]
        int j = len - 1;
        while (j > i && digits[j] <= digits[i]) {
            j--;
        }

        // 3) swap
        char tmp = digits[i];
        digits[i] = digits[j];
        digits[j] = tmp;

        // 4) reverse suffix (i+1 .. end)
        reverse(digits, i + 1, len - 1);

        // 5) parse to long to check overflow
        long val = Long.parseLong(new String(digits));
        return (val <= Integer.MAX_VALUE) ? (int) val : -1;
    }

    private void reverse(char[] a, int l, int r) {
        while (l < r) {
            char t = a[l];
            a[l] = a[r];
            a[r] = t;
            l++; r--;
        }
    }

    public static void main(String[] args) {
        NextGreaterElement obj = new NextGreaterElement();
        int n = 12;
        int result = obj.nextGreaterElement(n);
        System.out.println(result); // Output: 1243
    }
}
