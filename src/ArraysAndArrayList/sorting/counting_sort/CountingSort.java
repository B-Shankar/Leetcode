package ArraysAndArrayList.sorting.counting_sort;

public class CountingSort {

    public static void countingSort(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }

        // Count array
        int[] count = new int[max + 1];

        for (int num : arr) {
            count[num]++;
        }

        // Rebuild sorted array
        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (count[i]-- > 0) {
                arr[index++] = i;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        countingSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
