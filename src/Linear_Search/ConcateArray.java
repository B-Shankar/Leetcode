package Linear_Search;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Arrays;

class ConcateArray {
    public static void main(String[] args){
        int[] nums = {1, 2, 3};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }

    public static int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int concat = 2;
        int[] arr = new int[concat*len];
        while( concat > 0){
            for(int i = 0; i < nums.length; i++){
                arr[i] = nums[i];
                arr[i + len] = nums[i];
            }
            concat--;
        }
        return arr;
    }
}
