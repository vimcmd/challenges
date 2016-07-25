package Simple.deltaBits.java;

import org.junit.Test;

import java.math.BigInteger;
import java.util.Random;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class DeltaBitsTest {

    private Random random = new Random(System.currentTimeMillis());

    @Test
    public void test() throws Exception {
        assertEquals(2, DeltaBits.convertBits(31, 14));
    }

    @Test
    public void testFixedValues() throws Exception {
        assertThat("convertBits(31, 14)", DeltaBits.convertBits(31, 14), is(2));
        assertThat("convertBits(7, 17)", DeltaBits.convertBits(7, 17), is(3));
        assertThat("convertBits(31, 0)", DeltaBits.convertBits(31, 0), is(5));
        assertThat("convertBits(0, 0)", DeltaBits.convertBits(0, 0), is(0));
        assertThat("convertBits(127681, 127681)", DeltaBits.convertBits(127681, 127681), is(0));
        assertThat("convertBits(312312312, 5645657)", DeltaBits.convertBits(312312312, 5645657), is(13));
        assertThat("convertBits(43, 2009989843)", DeltaBits.convertBits(43, 2009989843), is(17));
    }

    @Test
    public void testRandomValues() throws Exception {
        for (int i = 0; i < 10; i++) {
            int a = random.nextInt(Integer.MAX_VALUE);
            int b = random.nextInt(Integer.MAX_VALUE);
            assertThat(String.format("convertBits(%s, %s)", a, b), DeltaBits.convertBits(a, b), is(
                    BigInteger.valueOf(a).xor(BigInteger.valueOf(b)).bitCount()));
        }
    }

}