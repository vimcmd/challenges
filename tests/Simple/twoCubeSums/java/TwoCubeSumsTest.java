package Simple.twoCubeSums.java;

import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.*;

public class TwoCubeSumsTest {

    @Test
    public void test1(){
        assertFalse(TwoCubeSums.hasTwoCubeSums(1));
    }

    @Test
    public void test2(){
        assertTrue(TwoCubeSums.hasTwoCubeSums(1729));
    }

    @Test
    public void test3(){
        assertFalse(TwoCubeSums.hasTwoCubeSums(42));
    }

    @Test
    public void test4(){
        assertTrue(TwoCubeSums.hasTwoCubeSums(4104));
    }

    @Test
    public void test5(){
        assertFalse(TwoCubeSums.hasTwoCubeSums(4105));
    }

    @Test
    public void test6(){
        assertEquals(true, TwoCubeSums.hasTwoCubeSums(4104));
    }

    @Test
    public void test7(){
        assertEquals(false, TwoCubeSums.hasTwoCubeSums(4105));
    }

    @Test
    public void test8(){
        assertEquals(false, TwoCubeSums.hasTwoCubeSums(4106));
    }

    @Test
    public void test9(){
        assertEquals(false, TwoCubeSums.hasTwoCubeSums(0));
    }

    @Test
    public void test10(){
        assertEquals(false, TwoCubeSums.hasTwoCubeSums(46163));
    }

    @Test
    @Ignore(value = "takes too long time")
    public void RandomTest(){
        Random r=new Random();
        int[] solutions={1729, 4104, 13832, 20683, 32832, 39312, 40033, 46683, 64232, 65728, 110656, 110808, 134379, 149389, 165464, 171288, 195841, 216027, 216125, 262656, 314496, 320264, 327763, 373464, 402597, 439101, 443889, 513000, 513856, 515375, 525824, 558441, 593047, 684019, 704977, 805688, 842751, 885248, 886464, 920673, 955016, 984067, 994688, 1009736, 1016496, 1061424, 1073375, 1075032, 1080891, 1092728, 1195112, 1260441, 1323712, 1331064, 1370304, 1407672, 1533357, 1566728, 1609272, 1728216, 1729000, 1734264, 1774656, 1845649, 2048391, 2101248, 2301299, 2418271, 2515968, 2562112, 2585375, 2622104, 2691451, 2864288, 2987712, 2991816, 3220776, 3242197, 3375001, 3375008, 3511872, 3512808, 3551112, 3587409, 3628233, 3798613, 3813992, 4033503, 4104000, 4110848, 4123000, 4174281, 4206592, 4342914, 4467528, 4505949, 4511808, 4607064, 4624776, 4673088, 4744376, 4914000, 4931101, 5004125, 5135104, 5287707, 5318677, 5446359, 5462424, 5472152, 5639816, 5772403, 5799339, 5832729, 5835375, 6013000, 6017193, 6058747, 6230504, 6434883, 6445504, 6517000, 6742008, 7081984, 7091712, 7094269, 7365384, 7620661, 7640128, 7872536, 7882245, 7957504, 8029000, 8077888, 8131968, 8216000, 8275176, 8491392, 8493039, 8494577, 8587000, 8600256, 8647128, 8741824, 8849601, 8872487, 9016488, 9261729, 9443761, 9560896, 10036845, 10083528, 10202696, 10469816, 10589696, 10702783, 10821896, 10870119};
        int n;
        for(int k=0;k<40;k++){
            if(r.nextInt(1)==0)
                n = 1+r.nextInt(10870120);
            else
                n = solutions[2+r.nextInt(solutions.length-3)];
            assertEquals("It should work for random inputs too", Arrays.asList(solutions).contains(n), TwoCubeSums.hasTwoCubeSums(n));
        }
    }

}