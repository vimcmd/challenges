package com.programmr.java.Challenges.Miscellaneous.numberToStringFormat;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumToStringTest {

    @Test
    public void testNumToStringOne() throws Exception {
        final String caseString = "one";
        final int caseNum = 1;

        assertEquals(caseString, NumToString.numToString(caseNum));

    }

    @Test
    public void testNumToStringTwenty() throws Exception {
        final String caseString = "twenty";
        final int caseNum = 20;

        assertEquals(caseString, NumToString.numToString(caseNum));
    }

    @Test
    public void testNumToStringTwentyTwo() throws Exception {
        final String caseString = "twenty two";
        final int caseNum = 22;

        assertEquals(caseString, NumToString.numToString(caseNum));
    }

    @Test
    public void testNumToStringThirty() throws Exception {
        final String caseString = "thirty";
        final int caseNum = 30;

        assertEquals(caseString, NumToString.numToString(caseNum));
    }

    @Test
    public void testNumToStringThirtyNine() throws Exception {
        final String caseString = "thirty nine";
        final int caseNum = 39;

        assertEquals(caseString, NumToString.numToString(caseNum));
    }

    @Test
    public void testNumToStringTwoHundred() throws Exception {
        final String caseString = "two hundred";
        final int caseNum = 200;

        assertEquals(caseString, NumToString.numToString(caseNum));
    }

    @Test
    public void testNumToStringTwoHundredNineteen() throws Exception {
        final String caseString = "two hundred nineteen";
        final int caseNum = 219;

        assertEquals(caseString, NumToString.numToString(caseNum));
    }

    @Test
    public void testNumToStringTwoHundredFifty() throws Exception {
        final String caseString = "two hundred fifty";
        final int caseNum = 250;

        assertEquals(caseString, NumToString.numToString(caseNum));
    }

    @Test
    public void testNumToStringTwoHundredFiftyEight() throws Exception {
        final String caseString = "two hundred fifty eight";
        final int caseNum = 258;

        assertEquals(caseString, NumToString.numToString(caseNum));
    }

    @Test
    public void testMain() throws Exception {

    }
}