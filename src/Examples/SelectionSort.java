package Examples;

import java.util.Arrays;

// Selection Sort - directly swapping the largest element to its position
public class SelectionSort {

    public void selectionSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {

            int max = 0;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[max] < arr[j]) {
                    max = j;
                }
            }

            // swap
            temp = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[max];
            arr[max] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 7, 2, 4, 6};

        SelectionSort sorting = new SelectionSort();

        sorting.selectionSort(arr);
        System.out.print(Arrays.toString(arr));
    }
}
