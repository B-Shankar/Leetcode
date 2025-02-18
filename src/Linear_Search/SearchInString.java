package Linear_Search;

import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Kunal";
        char target = 'n';

        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(charterExistInString(name, target));
        System.out.println(charterExistInStringIndex(name, target));
        System.out.println(charterExistInStringChar(name, target));
        System.out.println(charterExistInStringCharArrayEForLoop(name, target));
    }

    private static boolean charterExistInString(String name, char target) {
        if(name.isEmpty())
            return false;

        for (int i = 0; i < name.length(); i++) {
            if(target == name.charAt(i)){
                return true;
            }
        }

        return false;
    }

    private static int charterExistInStringIndex(String name, char target) {
        if(name.isEmpty())
            return -1;

        for (int i = 0; i < name.length(); i++) {
            if(target == name.charAt(i)){
                return i;
            }
        }

        return -1;
    }

    private static char charterExistInStringChar(String name, char target) {
        if(name.isEmpty())
            return '\0';

        for (int i = 0; i < name.length(); i++) {
            if(target == name.charAt(i)){
                return target;
            }
        }

        return '\0';
    }

    private static boolean charterExistInStringCharArrayEForLoop(String name, char target) {
        if(name.isEmpty())
            return false;

        for(char e : name.toCharArray()){
            if(e == target)
                return true;
        }

        return false;
    }
}
