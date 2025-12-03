package ArraysAndArrayList;

// 556. Next Greater Element III
// Pure arithmetic (digit-by-digit): No String Parse
public class NextGreaterElementWithoutStringParse {
    public int nextGreaterElement(int n) {
        // collect digits (most significant first)
        int temp = n;
        int len = 0;
        int[] digits = new int[10]; // at most 10 digits for int
        // fill from end
        while (temp > 0) {
            digits[++len] = temp % 10; // store reversed
            temp /= 10;
        }
        if (len == 0) digits[++len] = 0; // edge case n == 0

        // reverse to get most-significant-first in indices 0..len-1
        for (int i = 0; i < len/2; i++) {
            int t = digits[i+1];
            digits[i+1] = digits[len-i];
            digits[len-i] = t;
        }

        // now use next-permutation on digits[1..len] (1-based in this array)
        int i = len - 1;
        while (i >= 1 && digits[i] >= digits[i+1]) i--;
        if (i < 1) return -1;

        int j = len;
        while (digits[j] <= digits[i]) j--;
        // swap
        int tmp = digits[i]; digits[i] = digits[j]; digits[j] = tmp;
        // reverse suffix i+1..len
        int l = i+1, r = len;
        while (l < r) {
            int t = digits[l]; digits[l] = digits[r]; digits[r] = t;
            l++; r--;
        }

        // rebuild number and check overflow
        long res = 0;
        for (int k = 1; k <= len; k++) {
            res = res * 10 + digits[k];
            if (res > Integer.MAX_VALUE) return -1;
        }
        return (int) res;
    }

    public static void main(String[] args) {
        NextGreaterElementWithoutStringParse obj = new NextGreaterElementWithoutStringParse();
        int n = 12;
        int result = obj.nextGreaterElement(n);
        System.out.println(result); // Output: 21
    }
}
