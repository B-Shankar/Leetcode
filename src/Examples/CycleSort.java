package Examples;

import java.util.Arrays;

public class CycleSort {

    void cycleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] != i + 1) {
                int correct_index = arr[i] - 1;

                int temp = arr[correct_index];
                arr[correct_index] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 5, 4};

        CycleSort cycleSort = new CycleSort();
        cycleSort.cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
