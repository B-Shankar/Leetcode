package LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {10, 20,30, 40, 50, 60};
        int start = 1;
        int end = 10;
        int target = 20;
        System.out.println(searchInRange(arr, start, end, target));
        System.out.println(searchInRangeIndex(arr, start, end, target));
        System.out.println(searchInRangeElement(arr, start, end, target));
    }

    public static boolean searchInRange(int[] arr, int start, int end, int target){
        if(arr.length == 0)
            return false;

        if(end >= arr.length){
            end = arr.length - 1;
        }

        for (int i = start; i <= end; i++) {
            if(target == arr[i]){
                return true;
            }
        }

        return false;
    }

    public static int searchInRangeIndex(int[] arr, int start, int end, int target){
        if(arr.length == 0)
            return -1;

        if(end >= arr.length){
            end = arr.length - 1;
        }

        for (int i = start; i <= end; i++) {
            if(target == arr[i]){
                return i;
            }
        }

        return -1;
    }

    public static int searchInRangeElement(int[] arr, int start, int end, int target){
        if(arr.length == 0)
            return -1;

        if(end >= arr.length){
            end = arr.length - 1;
        }

        for (int i = start; i <= end; i++) {
            if(target == arr[i]){
                return arr[i];
            }
        }

        return -1;
    }
}
