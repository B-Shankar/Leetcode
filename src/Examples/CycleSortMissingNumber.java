package Examples;

// 1 - n: Unique
public class CycleSortMissingNumber {

    int missingNumber(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                // swap
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }

        for (int k = 0; k < arr.length; k++) {
            if (arr[k] != k)
                return k;
        }
        return arr.length;
    }

    public static void main(String[] args) {
        CycleSortMissingNumber missingNumber = new CycleSortMissingNumber();

        int[] arr = {4, 0, 3, 1};
        int ans = missingNumber.missingNumber(arr);

        System.out.println(ans);
    }

}
