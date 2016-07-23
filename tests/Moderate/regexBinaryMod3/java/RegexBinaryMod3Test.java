package Moderate.regexBinaryMod3.java;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class RegexBinaryMod3Test {

    @Test
    public void checkType() {
        // In fact Pattern and Matcher can't be extended as they are final, but let this be
        assertEquals(Pattern.class, RegexBinaryMod3.multipleOf3().getClass());
        assertEquals(Matcher.class, RegexBinaryMod3.multipleOf3().matcher("").getClass());
    }

    @Test
    public void testInvalid() {
        assertEquals(false, RegexBinaryMod3.multipleOf3().matcher(" 0").matches());
        assertEquals(false, RegexBinaryMod3.multipleOf3().matcher("abc").matches());
        assertEquals(false, RegexBinaryMod3.multipleOf3().matcher("011 110").matches());
    }

    @Test
    public void testValid() {
        assertEquals(true, RegexBinaryMod3.multipleOf3().matcher("000").matches());
        assertEquals(false, RegexBinaryMod3.multipleOf3().matcher("001").matches());
        assertEquals(true, RegexBinaryMod3.multipleOf3().matcher("011").matches());
        assertEquals(true, RegexBinaryMod3.multipleOf3().matcher("110").matches());
        assertEquals(false, RegexBinaryMod3.multipleOf3().matcher("111").matches());
        assertEquals(true, RegexBinaryMod3.multipleOf3().matcher(Integer.toBinaryString(12345678)).matches());
    }


    @Test
    public void testFalsePositives() {
        assertEquals(false, falsePositivesBetween(0, 10000));
        assertEquals(false, falsePositivesBetween(1000000, 1010000));
    }

    @Test
    public void testFalseNegatives() {
        assertEquals(false, falseNegativesBetween(0, 10000));
        assertEquals(false, falseNegativesBetween(1000000, 1010000));
    }

    private boolean falsePositivesBetween(int min, int max) {
        for (int i = min; i < max; i++)
            if (i%3 != 0 && RegexBinaryMod3.multipleOf3().matcher(Integer.toBinaryString(i)).matches())
                return true;
        return false;
    }

    private boolean falseNegativesBetween(int min, int max) {
        for (int i = min; i < max; i++)
            if (i%3 == 0 && !RegexBinaryMod3.multipleOf3().matcher(Integer.toBinaryString(i)).matches())
                return true;
        return false;
    }

}