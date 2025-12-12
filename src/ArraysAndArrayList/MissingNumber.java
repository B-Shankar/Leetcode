package ArraysAndArrayList;

// 268 — Missing Number
public class MissingNumber {

    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expected = n * (n + 1) / 2;
        int actual = 0;

        for (int num : nums) {
            actual += num;
        }

        return expected - actual;
    }

    public static void main(String[] args) {
        MissingNumber obj = new MissingNumber();
        int[] nums = {3, 0, 1};
        int missing = obj.missingNumber(nums);
        System.out.println("Missing Number: " + missing);
    }
}
