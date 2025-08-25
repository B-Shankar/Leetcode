package LinearSearch;

import java.util.Scanner;

public class ElementExist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        arr = new int[]{18, 12, 9, 14, 77, 50};
        System.out.print("Enter element to be found: " );
        int k = input.nextInt();

//        ElementExistInArray(arr);
        int i = ElementExistInArrayIndex(arr, k);
        if(ElementExistInArray(arr, k)){
            System.out.println("element exit!");
            System.out.println("At index : " + i);
        } else {
            System.out.println("element not exit");
            System.out.println("At index : " + i);
        }

    }

    public static boolean ElementExistInArray(int[] arr, int k){
        if(arr.length == 0)
            return false;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == k){
                return true;
            }
        }
        return false;

    }

    public static int ElementExistInArrayIndex(int[] arr, int k){
        if(arr.length == 0)
            return -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == k){
                return i;
            }
        }
        return -1;

    }
}
