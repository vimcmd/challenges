package Simple.backwardReadPrime.java;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class BackwardsPrime {

    public static String backwardsPrime(long start, long end) {
        List<Long> backwardPrimes = new ArrayList<>();

        for(long i = start; i <= end; i++) {
            if (isPrime(i) && i != reverseNumber(i) && isPrime(reverseNumber(i))) {
                backwardPrimes.add(i);
            }
        }

        StringJoiner joiner = new StringJoiner(" ");
        for(Long backwardPrime : backwardPrimes) {
            joiner.add(String.valueOf(backwardPrime));
        }

        return joiner.toString();
    }

    private static boolean isPrime(long n) {
        //check if n is a multiple of 2
        if (n%2==0) return false;
        //if not, then just check the odds till square root of n
        for(long i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static long reverseNumber(long n) {
        long reverse = 0;

        while( n != 0 ) {
            reverse = reverse * 10;
            reverse = reverse + n%10;
            n = n/10;
        }

        return reverse;
    }

}
