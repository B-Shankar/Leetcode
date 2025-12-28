package Examples;

import java.util.Scanner;

public class FindElement {

    // Linear Search
    public static int findElement(int[] arr, int k) {
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == k)
                return i;
        }

        return -1;
    }

    public static boolean elementExits(int[] arr, int k) {
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == k)
                return true;
        }

        return false;
    }

    //Binary Search: Sorted Array
    public static int findElementBS (int[] arr, int k) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == k)
                return mid;

            if (k > arr[mid])
                start = mid + 1;

            if (k < arr[mid])
                end = mid - 1;

        }

        return -1;
    }

    public static boolean ElementExitsBS (int[] arr, int k) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == k)
                return true;

            if (k > arr[mid])
                start = mid + 1;

            if (k < arr[mid])
                end = mid - 1;

        }

        return false;
    }

    // Count occurrences of a number
    public static int occurrenceNumber(int[] arr, int k) {
        int counter = 0;

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == k)
                counter++;
        }

        return counter;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6};

        Scanner input = new Scanner(System.in);
        System.out.print("Element to be found : ");
        int k = input.nextInt();

//        int index = findElement(arr, k);
//        int index = findElementBS(arr, k);
//        System.out.print("Index: " + index);

//        boolean exits = elementExits(arr, k);
//        boolean exits = ElementExitsBS(arr, k);
//        System.out.println("exits: " + exits);

        int arr1[] = {1, 5, 6, 8, 8, 8, 9};
        int occurrence = occurrenceNumber(arr1, k);
        System.out.println("Occurrence: " + occurrence);
    }
}
