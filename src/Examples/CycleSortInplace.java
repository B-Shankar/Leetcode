package Examples;

import java.util.Arrays;

public class CycleSortInplace {

    void cycleSort(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            int j = arr[i] - 1;

            if (arr[i] != arr[j]) {
                arr[i] = arr[i] + arr[j];
                arr[j] = arr[i] - arr[j];
                arr[i] = arr[i] - arr[j];
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {

        CycleSortInplace cycleSortInplace = new CycleSortInplace();

        int[] arr = {7, 6, 1, 5, 3, 2, 4};
        cycleSortInplace.cycleSort(arr);

        System.out.println(Arrays.toString(arr));
    }

}
