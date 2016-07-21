package Simple.twoCubeSums.java;

public class TwoCubeSums {

    public static boolean hasTwoCubeSums(int n) {
        int cubeSumCount = 0;
        for(int i = 1; i <= n / 2; i++) {
            final int cube1 = (int) Math.cbrt((double) i);
            final int cube2 = (int) Math.cbrt((double) n - i);
            if (( (int) Math.pow(cube1, 3) + (int) Math.pow(cube2, 3) ) == n) {
                cubeSumCount++;
            }
        }
        return cubeSumCount >= 2;
    }

}
