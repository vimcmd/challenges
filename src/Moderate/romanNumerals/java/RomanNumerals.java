package Moderate.romanNumerals.java;

import java.util.HashMap;

public class RomanNumerals {

    private static final HashMap<Character, Integer> numerals = new HashMap<Character, Integer>() {
        {
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }
    };

    public int decode(String romanNumeral) {
        // no roman numeral validation here
        // NOTE: can't be more than 3 identical symbols in a row
        int result = 0;
        int previous = 0;

        for(int i = romanNumeral.length() - 1; i >= 0; i--) {
            int current = numerals.get(romanNumeral.charAt(i));
            if (current < previous) {
                result -= current;
            } else {
                result += current;
            }
            previous = current;
        }

        return result;
    }

    public String encode(int decimal) {
        // TODO: 26.07.2016 implement method
        return "";
    }
}
