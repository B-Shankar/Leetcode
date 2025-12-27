package StringQuestion;

public class PrintCharacters {

    public static String printStringRange(char start, char end) {
        StringBuilder stringBuilder = new StringBuilder();

        for (char i = start; i <= end; i++) {
            stringBuilder.append(i);
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {

        char ch1 = 'a';
        char ch2 = 'g';

        String ans =  printStringRange(ch1, ch2);
        System.out.println(ans);
    }
}
