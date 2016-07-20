package Simple.circleSorted.java;

import org.junit.Test;

import static org.junit.Assert.*;

public class CircleSortedTest {

    @Test
    public void testTrue() throws Exception {
        assertTrue(CircleSorted.isCircleSorted(new int[]{3,0,1,2}));
        assertTrue(CircleSorted.isCircleSorted(new int[]{2,3,4,5,0,1}));
        assertTrue(CircleSorted.isCircleSorted(new int[]{4,5,6,9,1}));
        assertTrue(CircleSorted.isCircleSorted(new int[]{10,11,6,7,9}));
        assertTrue(CircleSorted.isCircleSorted(new int[]{1,2,3,4,5}));
        assertTrue(CircleSorted.isCircleSorted(new int[]{5,7,43,987,-9,0}));

    }
    @Test
    public void testFalse() throws Exception {
        assertFalse(CircleSorted.isCircleSorted(new int[]{9,10,14,12}));
        assertFalse(CircleSorted.isCircleSorted(new int[]{4,1,2,5}));
        assertFalse(CircleSorted.isCircleSorted(new int[]{8,7,6,5,4,3}));
        assertFalse(CircleSorted.isCircleSorted(new int[]{6,7,4,8}));
        assertFalse(CircleSorted.isCircleSorted(new int[]{7,6,5,4,3,2,1}));
    }

}