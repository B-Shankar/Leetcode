package Examples;

import java.util.ArrayList;
import java.util.Arrays;

// Find all Missing Numbers: 448
public class FindAllMissingNumbers {

    Object[] findAllMissingNums(int[] arr) {

        int i = 0;

        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                list.add(j+1);
            }
        }

        return list.toArray();
    }

    public static void main(String[] args) {
        FindAllMissingNumbers findAllMissingNumbers = new FindAllMissingNumbers();

        int[] arr = {4,3,2,7,8,2,3,1};

        Object[] res = findAllMissingNumbers.findAllMissingNums(arr);

        System.out.println(Arrays.toString(res));
    }
}
