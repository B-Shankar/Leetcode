package ArraysAndArrayList;

public class MissingNumberInSortedArray {

    public int missingNumberSimple(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {

            if  (arr[i] + 1 != arr[i + 1]) {
                return arr[i] + 1;
            }
        }

        return arr[arr.length - 1] + 1;
    }

    public static void main(String[] args) {
        MissingNumberInSortedArray number = new MissingNumberInSortedArray();

        int[] arr = {4, 6, 7, 8};
        System.out.println(number.missingNumberSimple(arr));
    }
}
