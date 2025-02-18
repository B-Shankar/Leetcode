package Linear_Search;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
//        int[] arr = {2,7,11,15};
//        int target = 9;

//        int[] arr = {3,2,4};
//        int[] arr = {3,2,3};
//        int target = 6;

        int[] arr = {2,5,5,11};
        int target = 10;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    private static int[] twoSum(int[] arr, int target) {
        if(arr.length == 0) return new int[]{-1, -1};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i]+arr[j] == target){
                    return new int[]{ i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }
}
