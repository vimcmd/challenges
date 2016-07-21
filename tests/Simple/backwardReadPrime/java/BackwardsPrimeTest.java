package Simple.backwardReadPrime.java;

import org.junit.Test;

import static org.junit.Assert.*;

public class BackwardsPrimeTest {

    @Test
    public void backWardsPrime13() {
        assertEquals("13 17 31 37 71 73 79 97", BackwardsPrime.backwardsPrime(1, 100));
    }
    @Test
    public void backWardsPrime21() {
        assertEquals("9923 9931 9941 9967", BackwardsPrime.backwardsPrime(9900, 10000));
    }

}