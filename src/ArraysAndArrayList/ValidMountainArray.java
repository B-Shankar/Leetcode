package ArraysAndArrayList;

// 941: Valid Mountain Array
public class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {

        int n = arr.length;
        if (n < 3) return false;

        int i = 0;

        // climb up
        while (i + 1 < n && arr[i] < arr[i + 1]) {
            i++;
        }

        // peak cannot be first or last
        if (i == 0 || i == n - 1) return false;

        // climb down
        while (i + 1 < n && arr[i] > arr[i + 1]) {
            i++;
        }

        // if reached end, it's valid
        return i == n - 1;
    }

    public static void main(String[] args) {
        ValidMountainArray obj = new ValidMountainArray();
        int[] arr = {0, 3, 2, 1};
        boolean result = obj.validMountainArray(arr);
        System.out.println("Is valid mountain array: " + result);
    }
}
