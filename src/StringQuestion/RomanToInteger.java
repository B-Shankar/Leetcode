package StringQuestion;

// Roman to Integer Conversion
public class RomanToInteger {
    public int romanToInt(String s) {
        int result = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int curr = getValue(s.charAt(i));

            if (curr < prev) {
                result -= curr; // subtract
            } else {
                result += curr; // add
            }

            prev = curr;
        }
        return result;
    }

    private int getValue(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }

    public static void main(String[] args) {
        RomanToInteger obj = new RomanToInteger();
        String romanNumeral = "MCMXCIV";
        int result = obj.romanToInt(romanNumeral);
        System.out.println("The integer value of the Roman numeral " + romanNumeral + " is: " + result);
    }
}
