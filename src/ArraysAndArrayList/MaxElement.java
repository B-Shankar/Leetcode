package ArraysAndArrayList;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 85, 12, 56, 10, 2, 0};

        System.out.println(maxElement(arr));
        System.out.println(maxElementIndex(arr));
        System.out.println(maxElementRangeIndex(arr, 0, 3));
    }

    private static int maxElement(int[] arr) {
        int max = 0;
        for(int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    private static int maxElementIndex(int[] arr) {
        int max = 0;
        int index = -1;
        for(int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
                index = i;
            }
        }
        return index;
    }

    private static int maxElementRangeIndex(int[] arr, int start, int end) {
        int max = 0;
        int index = -1;
        for(int i = start; i <= end; i++) {
            if(max < arr[i]){
                max = arr[i];
                index = i;
            }
        }
        return arr[index];
    }
}
