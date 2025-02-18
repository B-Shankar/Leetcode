package ArraysAndArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(10);
        list.add(20);
        list.add(1730);
        list.add(1055);
        list.add(104);
        list.add(1052);

        for (int i = 0; i < 5; i++) {
//            list.add(i + 1);
            list.add(input.nextInt());
        }


//        ArrayList<Integer> list1 = new ArrayList<>{1111, 2222, 3333};

        System.out.println(list);
        System.out.println(list.get(0));
        list.set(0, 99);
        list.remove(1);
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10000000);
        list.addAll(list1);
        System.out.println(list.contains(10));
//        System.out.println(list.addAll(arr));
        System.out.println(list.toString());

    }
}
