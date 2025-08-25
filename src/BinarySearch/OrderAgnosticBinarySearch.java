package BinarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
//        int[] arr = {1 , 2, 100, 200, 52012, 65320, 4562320};
        int[] arr = {452102, 120222, 52012, -100, -52022 };
        int target = 52012;

        System.out.println(orderAgnosticBinarySearch(arr, target));
    }

    static int orderAgnosticBinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
               return mid;
            }

            if (isAsc) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}
