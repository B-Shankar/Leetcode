package ArraysAndArrayList;

// 268 — Missing Number
public class MissingNumber {

    // Math Formula
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expected = n * (n + 1) / 2;
        int actual = 0;

        for (int num : nums) {
            actual += num;
        }

        return expected - actual;
    }

    // XOR Solution
    public int missingNumberUsingXOR(int[] nums) {
        int xor = 0;
        int n = nums.length;

        for (int i = 0; i <= n; i++) {
            xor ^= i;
        }
        for (int num : nums) {
            xor ^= num;
        }

        return xor;
    }

    public static void main(String[] args) {
        MissingNumber obj = new MissingNumber();
        int[] nums = {3, 0, 1};
        int missing = obj.missingNumber(nums);
        int missingXOR = obj.missingNumberUsingXOR(nums);
        System.out.println("Missing Number: " + missing + " | " + missingXOR);
    }
}
