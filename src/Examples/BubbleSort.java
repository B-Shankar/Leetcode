package Examples;

import java.util.Arrays;

// BubbleSort - adjacent swapping of elements
public class BubbleSort {

    public void bubbleSort(int[] arr) {

        int temp;
        boolean swapped;

        // outer loop - on each iteration ensures at least an element is sorted
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            //inner loop
            for (int j = 1; j < arr.length - i; j++) {

                // swapping
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        BubbleSort sorting = new BubbleSort();

        int[] arr = {5, 8, 3, 1, 7, 2, 6};

        sorting.bubbleSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
