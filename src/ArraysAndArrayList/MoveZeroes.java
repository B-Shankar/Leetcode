package ArraysAndArrayList;

// LeetCode 283: Move Zeroes
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int pos = 0;

        // Move non-zero elements forward
        for (int num : nums) {
            if (num != 0) {
                nums[pos++] = num;
            }
        }

        // Fill remaining with zeroes
        while (pos < nums.length) {
            nums[pos++] = 0;
        }
    }

    public static void main(String[] args) {
        MoveZeroes mover = new MoveZeroes();
        int[] arr = {0, 1, 0, 3, 12};
        mover.moveZeroes(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
