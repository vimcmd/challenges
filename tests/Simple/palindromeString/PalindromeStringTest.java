package Simple.palindromeString;

import Simple.palindromeString.java.PalindromeString;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PalindromeStringTest
{

    @Test
    public void testMain() throws Exception
    {


    }

    @Test
    public void testReverseString() throws Exception
    {
        final String string = "world";
        final String stringReversed = "dlrow";
        assertEquals(stringReversed, PalindromeString.reverseString(string));
    }

    @Test
    public void testIsPalindrome() throws Exception
    {
        final String palindromeString = "Sum summus mus".toLowerCase();
        assertEquals(palindromeString, PalindromeString.reverseString(palindromeString));
    }

    @Test
    public void testRemoveSymbols() throws Exception
    {
        final String stringWithSymbols = ".><w,o:r;l!d/@#$%^&*()-=_+'";
        final String string = "world";
        assertEquals(string, PalindromeString.removeSymbols(stringWithSymbols));
    }

}