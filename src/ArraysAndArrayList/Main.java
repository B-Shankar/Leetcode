package ArraysAndArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 4, 5};
        int[] arr1 = new int[5];

//        System.out.println("Arr" + arr[0]);
//
//        int[] array = new int[5];
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.print("Enter Index Value " + i + ": ");
//            array[i] = input.nextInt();
//            System.out.println();
//        }

//        for (int i = 0; i < array.length; i++) {
//            System.out.println("Elements at index " + i + " is " + array[i]);
//        }

        String[] str = new String[4];

        for (int i = 0; i < str.length; i++) {
//            System.out.print("Enter string for " + i+1 + " : ");
//            str[i] = input.nextLine();

//            str[i] = input.nextLine();
        }

//        for (String s : str) {
//            System.out.println(" Elements " + s);
//        }
//
//        System.out.println(Arrays.toString(str));

//        System.out.println(str[5]);

        String[] array = new String[6];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.next();
        }

        for ( String a : array){
            System.out.println(a + " ");
        }

        System.out.println();
        System.out.println(Arrays.toString(array));

        int[] kk = {1 , 5 , 5, 6 , 8};

        System.out.println(Arrays.toString(kk) + " " + kk.length);
    }

}
