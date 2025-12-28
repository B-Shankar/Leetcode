package Examples;

import java.util.Arrays;

// Find second-largest element without sorting the array
public class SecondLargestNumber {

    public int[] secondLargestNum(int[] arr) {
        int max1 = arr[0];
        int max2 = arr[0];
        int temp;

        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];

            if (temp > max1) {
                max2 = max1;
                max1 = temp;
            }

            if (temp > max2 && temp != max1) {
                max2 = temp;
            }
        }

        return new int[] {max1, max2};
    }

    public static void main(String[] args) {

        SecondLargestNumber secondLargestNumber = new SecondLargestNumber();

//        int[] arr = {4, 8, 5, 6, 7, -9, 3, 5};
        int[] arr = {3, 7, 2, -9, 5, 4, 8};

        int[] res = secondLargestNumber.secondLargestNum(arr);

        System.out.println("Max1: " + res[0] + " | Max2: " + res[1]);
    }
}
