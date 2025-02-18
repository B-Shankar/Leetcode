package ArraysAndArrayList;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArrays {
    public static void main(String[] Args){
        Scanner input = new Scanner(System.in);

        int[][] arr = new int[2][3];

        int[][] arr1 = {
                {1, 2, 3},
                {1, 2},
                {1, 2, 3, 4}
        };

        for(int[] i : arr1){
            System.out.println(Arrays.toString(i));
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j]+ " ");
            }
            System.out.println();
        }

        for(int[] i : arr1){
            for(int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Enter Value :");
                arr[i][j] = input.nextInt();
//                System.out.println();
            }
        }

        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int[] i : arr1) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        change(arr1);
        for (int[] i : arr1) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static void change(int[][] arr){
//        for (int[] i : arr ) {
//            for (int j : i) {
//                i[j] =  j + 1;
//            }
//        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i + j;
            }
        }
    }
}
