package Simple.consecutiveStrings.java;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class ConsecutiveStringsTest {

    private static int randInt(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }
    private static void testing(String actual, String expected) {
        assertEquals(expected, actual);
    }
    private static String[] doEx(int k) {
        int j = 0;
        String[] a1 = new String[k];
        while (j < k) {
            String res = "";
            int n = -1;
            for (int i = 0; i < randInt(3, 10); i++) {
                n = randInt(97, 122);
                for (int u = 0; u < randInt(1, 3); u++)
                    res += (char)n;
            }
            a1[j] = res;
            //System.out.println(res);
            j++;
        }
        return a1;
    }
    private static String longestConsecSol(String[] strarr, int k) {
        int n = strarr.length;
        if ((n == 0) || (k > n) || (k <= 0)) return "";
        Object[] arr = (Object[]) Stream.of(strarr).map(String::length).toArray();
        int sm = 0;
        for (int i = 0; i < k; i++) sm += (Integer)arr[i];
        int mx_sm = sm, mx_nd = k - 1;
        for (int u = k; u < n; u++) {
            sm = sm + (Integer)arr[u] - (Integer)arr[u - k];
            if (sm > mx_sm) {
                mx_sm = sm; mx_nd = u;
            }
        }
        int start =  mx_nd - k + 1;
        String[] subArray = Arrays.copyOfRange(strarr, start, mx_nd + 1);
        return String.join("", subArray);
    }
    //.........................
    @Test
    public void test() {
        System.out.println("longestConsec Fixed Tests");
        testing(ConsecutiveStrings.longestConsec(new String[] {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2), "abigailtheta");
        testing(ConsecutiveStrings.longestConsec(new String[] {"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"}, 1), "oocccffuucccjjjkkkjyyyeehh");
        testing(ConsecutiveStrings.longestConsec(new String[] {}, 3), "");
        testing(ConsecutiveStrings.longestConsec(new String[] {"itvayloxrp","wkppqsztdkmvcuwvereiupccauycnjutlv","vweqilsfytihvrzlaodfixoyxvyuyvgpck"}, 2), "wkppqsztdkmvcuwvereiupccauycnjutlvvweqilsfytihvrzlaodfixoyxvyuyvgpck");
        testing(ConsecutiveStrings.longestConsec(new String[] {"wlwsasphmxx","owiaxujylentrklctozmymu","wpgozvxxiu"}, 2), "wlwsasphmxxowiaxujylentrklctozmymu");
        testing(ConsecutiveStrings.longestConsec(new String[] {"zone", "abigail", "theta", "form", "libe", "zas"}, -2), "");
        testing(ConsecutiveStrings.longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 3), "ixoyx3452zzzzzzzzzzzz");
        testing(ConsecutiveStrings.longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 15), "");
        testing(ConsecutiveStrings.longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 0), "");
    }
    @Test
    public void test1() {
        System.out.println("Random Tests");
        for (int i = 0; i < 200; i++) {
            String[] s1 = doEx(randInt(100, 200));
            int n = randInt(1, s1.length + 2);
            //System.out.println(s1.toString());
            //System.out.println(n);
            //System.out.println(longestConsecSol(s1, n));
            //System.out.println("****");
            testing(ConsecutiveStrings.longestConsec(s1, n), longestConsecSol(s1, n));
        }
    }

}