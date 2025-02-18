package ArraysAndArrayList;

import java.util.Arrays;

public class SwapInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 4, 6};
        int index1 = 2;
        int index2 = 4;
//        swapInArray(arr, index1, index2);
        reverseOrSwapArrayElements(arr);

        System.out.println(Arrays.toString(arr));
    }

    private static void reverseOrSwapArrayElements(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            swapInArray(arr, start, end);
            start++;
            end--;
        }
    }

    private static void swapInArray(int[] arr, int index1, int index2) {
//        System.out.println(Arrays.toString(arr));
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

//        arr[index1] = arr[index2] + arr[index1];
//        arr[index2] = arr[index1] - arr[index2];
//        arr[index1] = arr[index1] - arr[index2];

//        arr[index1] = arr[index2] ^ arr[index1];
//        arr[index2] = arr[index1] ^ arr[index2];
//        arr[index1] = arr[index1] ^ arr[index2];
    }


}
