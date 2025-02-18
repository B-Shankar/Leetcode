package Linear_Search;

public class MinNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 10, -2, 20, 2};
        System.out.println(minNum(arr));
        System.out.println(maxNum(arr));
        System.out.println(maxNumInRange(arr, 2, 5));
        System.out.println(minNumInRange(arr, 2, 5));
    }

    public static int minNum(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static int maxNum(int[] arr){
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int maxNumInRange(int[] arr, int start, int end){
        if (arr.length == 0)
            return -1;

        int max = arr[start];

        for (int i = start + 1; i <= end; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int minNumInRange(int[] arr, int start, int end){
        if (arr.length == 0)
            return -1;

        int min = arr[start];

        for (int i = start + 1; i <= end; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
