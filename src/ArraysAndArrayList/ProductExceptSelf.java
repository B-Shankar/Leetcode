package ArraysAndArrayList;

// 238. Product of Array Except Self
public class ProductExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        // Step 1: Left products
        answer[0] = 1;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        // Step 2: Right products (using one variable)
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * right;
            right *= nums[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        ProductExceptSelf obj = new ProductExceptSelf();
        int[] nums = {1, 2, 3, 4};
        int[] result = obj.productExceptSelf(nums);
        // Output the result
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
