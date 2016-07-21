package Simple.backwardReadPrime.java;

import org.junit.Test;

import static org.junit.Assert.*;

public class BackwardsPrimeTest {

    @Test
    public void backWardsPrime1() {
        assertEquals("7027 7043 7057", BackwardsPrime.backwardsPrime(7000, 7100));
    }
    @Test
    public void backWardsPrime2() {
        assertEquals("70001 70009 70061 70079 70121 70141 70163 70241", BackwardsPrime.backwardsPrime(70000, 70245));
    }
    @Test
    public void backWardsPrime3() {
        assertEquals("70489 70529 70573 70589", BackwardsPrime.backwardsPrime(70485, 70600));
    }
    @Test
    public void backWardsPrime4() {
        assertEquals("", BackwardsPrime.backwardsPrime(60000, 70000));
    }
    @Test
    public void backWardsPrime5() {
        assertEquals("109537 109579 109583 109609 109663", BackwardsPrime.backwardsPrime(109500, 109700));
    }
    @Test
    public void backWardsPrime6() {
        assertEquals("1095047 1095209 1095319 1095403", BackwardsPrime.backwardsPrime(1095000, 1095403));
    }
    @Test
    public void backWardsPrime7() {
        assertEquals("107 113 149 157 167 179 199 311 337 347 359 389", BackwardsPrime.backwardsPrime(100, 403));
    }
    @Test
    public void backWardsPrime8() {
        assertEquals("", BackwardsPrime.backwardsPrime(400, 503));
    }
    @Test
    public void backWardsPrime9() {
        assertEquals("7048519 7048579", BackwardsPrime.backwardsPrime(7048500, 7048600));
    }
    @Test
    public void backWardsPrime10() {
        assertEquals("1048571 1048583", BackwardsPrime.backwardsPrime(1048500, 1048600));
    }
    @Test
    public void backWardsPrime11() {
        assertEquals("1000033 1000037 1000039", BackwardsPrime.backwardsPrime(1000001, 1000100));
    }
    @Test
    public void backWardsPrime12() {
        assertEquals("700000031", BackwardsPrime.backwardsPrime(700000008, 700000050));
    }
    @Test
    public void backWardsPrime13() {
        assertEquals("13 17 31 37 71 73 79 97", BackwardsPrime.backwardsPrime(1, 100));
    }
    @Test
    public void backWardsPrime14() {
        assertEquals("13 17 31", BackwardsPrime.backwardsPrime(1, 31));
    }
    @Test
    public void backWardsPrime15() {
        assertEquals("107 113 149 157 167 179 199", BackwardsPrime.backwardsPrime(101, 199));
    }
    @Test
    public void backWardsPrime16() {
        assertEquals("311 337 347 359 389", BackwardsPrime.backwardsPrime(301, 399));
    }
    @Test
    public void backWardsPrime17() {
        assertEquals("", BackwardsPrime.backwardsPrime(501, 599));
    }
    @Test
    public void backWardsPrime18() {
        assertEquals("701 709 733 739 743 751 761 769", BackwardsPrime.backwardsPrime(701, 799));
    }
    @Test
    public void backWardsPrime19() {
        assertEquals("1009 1021 1031 1033 1061 1069 1091 1097", BackwardsPrime.backwardsPrime(1001, 1099));
    }
    @Test
    public void backWardsPrime20() {
        assertEquals("1103 1109 1151 1153 1181 1193 1201 1213 1217 1223 1229 1231 1237 1249 1259 1279 1283", BackwardsPrime.backwardsPrime(1099, 1299));
    }
    @Test
    public void backWardsPrime21() {
        assertEquals("9923 9931 9941 9967", BackwardsPrime.backwardsPrime(9900, 10000));
    }

}