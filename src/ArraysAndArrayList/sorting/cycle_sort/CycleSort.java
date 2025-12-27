package ArraysAndArrayList.sorting.cycle_sort;

public class CycleSort {

    public static void cycleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            // place arr[i] at its correct position
            while (arr[i] != i + 1) {
                int correctIndex = arr[i] - 1;

                // swap arr[i] with its correct position
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        cycleSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

