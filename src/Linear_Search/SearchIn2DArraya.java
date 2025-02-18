package Linear_Search;

import java.util.Arrays;

public class SearchIn2DArraya {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3,},
                {45, 65, 1, 0},
                {21, 5, 8, 3},
                {89, 56, 11, -10, -1}
        };
        int target = -1;
        System.out.println(search(arr, target));
        System.out.println(searchMax(arr));
        System.out.println(searchMin(arr));
        System.out.println(Arrays.toString(searchIndexRowCol(arr, target)));
    }

    static int search(int[][] arr, int target){
        if(arr.length == 0)
            return -1;

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    return target;
                }
            }
        }

        return -1;
    };

    static int searchMax(int[][] arr){
        if(arr.length == 0)
            return Integer.MAX_VALUE;

        int max = arr[0][0];
        for (int row = 1; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }

        return max;
    };

    static int searchMin(int[][] arr){
        if(arr.length == 0)
            return Integer.MAX_VALUE;

        int min = arr[0][0];
        for (int row = 1; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(min > arr[row][col]){
                    min = arr[row][col];
                }
            }
        }

        return min;
    };

    static int[] searchIndexRowCol(int[][] arr, int target){
        if(arr.length == 0)
            return new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE};

        int min = arr[0][0];
        for (int row = 1; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }

        return new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE};
    };
}
