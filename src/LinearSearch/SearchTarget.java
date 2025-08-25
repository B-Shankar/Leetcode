package LinearSearch;
/*
* Linear Search: Find an element in an array; Value or Index
* */
public class SearchTarget {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 4;
        System.out.println(searchAndReturnIndex(arr, target));
        System.out.println(searchAndReturnElement(arr, target));
    }

    public static int searchAndReturnIndex(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static int searchAndReturnElement(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i : arr){
            if(i == target){
                return i;
            }
        }
        return -1;
    }
}
