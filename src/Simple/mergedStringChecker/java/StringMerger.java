package Simple.mergedStringChecker.java;

public class StringMerger {

    public static boolean isMerge(String s, String part1, String part2) {
        if (part1.isEmpty()) {
            return s.equals(part2);
        }
        if (part2.isEmpty()) {
            return s.equals(part1);
        }
        if (s.isEmpty()){
            return false;
        }

        final char[] sArr = s.toCharArray();
        final char[] p1 = part1.toCharArray();
        final char[] p2 = part2.toCharArray();
        int n = 0;
        int m = 0;

        for(char ch : sArr) {
            if (n < p1.length && ch == p1[n]) {
                n++;
            }
            if (m < p2.length && ch == p2[m]) {
                m++;
            }
        }

        return s.length() == n + m;
    }
}
