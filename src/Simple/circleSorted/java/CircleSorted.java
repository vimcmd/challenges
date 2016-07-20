package Simple.circleSorted.java;

public class CircleSorted {

    public static boolean isCircleSorted(int[] a) {
        int minIndex = 0;

        for(int i = 0; i < a.length; i++) {
            if (a[i] < a[minIndex]) {
                minIndex = i;
            }
        }

        for(int i = minIndex; i < minIndex + a.length - 1; i++) {
            if (a[i % a.length] > a[(i + 1) % a.length] ) {
                return false;
            }
        }

        return true;
    }

}