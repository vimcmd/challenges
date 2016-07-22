package Simple.consecutiveStrings.java;

public class ConsecutiveStrings {

    public static String longestConsec(String[] strarr, int k) {
        if (strarr.length == 0 || k > strarr.length || k <= 0) {
            return "";
        }

        String longestConsec = "";
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < strarr.length - k + 1; i++) {
            for(int j = 0; j < k; j++) {
                sb.append(strarr[i + j]);
            }
            if (sb.length() > longestConsec.length()) {
                longestConsec = sb.toString();
            }
            sb.delete(0, sb.length());
        }

        return longestConsec;
    }

}
