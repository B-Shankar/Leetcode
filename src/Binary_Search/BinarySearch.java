package Binary_Search;

public class BinarySearch {
    public static void main(String[] args) {
//        int[] arr = {-100, -20, 0, 1, 2, 3, 4, 5, 6, 7, 10, 16, 20};
        int[] arr = {100, 89, 56, 45, 25, 10, 5, -10, -52, -456};
        int target = -456;

        System.out.println(binarySearchRev(arr, target));
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {

            int mid = start + (end - start) / 2;

            if(arr[mid] > target){
                end = mid  - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int binarySearchRev(int[] arr, int target){
        //{100, 89, 56, 45, 25}
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {

            int mid = start + (end - start) / 2;

            if(arr[mid] > target){
                start = mid + 1;
            } else if (arr[mid] < target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
