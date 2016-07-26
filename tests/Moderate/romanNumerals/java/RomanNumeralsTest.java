package Moderate.romanNumerals.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumeralsTest {

    private RomanNumerals rn;

    @Before
    public void setUp() throws Exception {
        rn = new RomanNumerals();
    }

    @After
    public void tearDown() throws Exception {
        rn = null;
    }

    @Test
    public void decodeTest() throws Exception {
        assertEquals(21, rn.decode("XXI"));
        assertEquals(1990, rn.decode("MCMXC"));
        assertEquals(2008, rn.decode("MMVIII"));
        assertEquals(1954, rn.decode("MCMLIV"));
    }

    @Test
    public void encodeTest() throws Exception {
        assertEquals("XXI", rn.encode(21));
        assertEquals("MCMXC", rn.encode(1990));
        assertEquals("MMVIII", rn.encode(2008));
        assertEquals("MCMLIV", rn.encode(1954));
    }

}