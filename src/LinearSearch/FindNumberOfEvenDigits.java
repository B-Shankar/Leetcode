package LinearSearch;

public class FindNumberOfEvenDigits {
    public static void main(String[] args) {
        int[] arr = {12, 344, 2, 6, 7896, 5, 12, 56, 8, -1};
        System.out.println(numberOfEvenDigits(arr));
        System.out.println(numberOfEvenDigitsWithChar(arr));
        System.out.println(numberOfEvenDigitsMathLog(arr));
    }

    //1
    static int numberOfEvenDigits(int[] arr){
        int count = 0;
        if(arr.length == 0)
            return count;

        for (int i = 0; i < arr.length; i++) {
            if(isEven(arr[i])){
                count++;
            }
        }

        return count;
    }

    static boolean isEven(int num){
        int value = 0;
        int n = num;

        if(num < 0){
            return false;
        }

        while(n > 0){
            n = n / 10;
            value++;
        }
        return (value % 2) == 0;
    }

    //2
    static int numberOfEvenDigitsWithChar(int[] arr){
        int count = 0;
        if(arr.length == 0)
            return count;

        for (int i = 0; i < arr.length; i++) {
            if(isEvenWithString(arr[i])){
                count++;
            }
        }

        return count;
    }

    private static boolean isEvenWithString(int num) {
        if(num < 0) return false;
        String str = Integer.toString(num);
        int len = str.length();
        return (len % 2 == 0);
    }

    //3
    static int numberOfEvenDigitsMathLog(int[] arr){
        int count = 0;
        if(arr.length == 0)
            return count;

        for (int i = 0; i < arr.length; i++) {
            if(isEvenWithMathLog(arr[i])){
                count++;
            }
        }

        return count;
    }

    private static boolean isEvenWithMathLog(int num) {
        if(num == 0) return false;
        if(num < 0) num = num * -1;
        return ((int) Math.log10(num) + 1) % 2 == 0;
    }


}
