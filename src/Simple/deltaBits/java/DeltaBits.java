package Simple.deltaBits.java;

public class DeltaBits {

    public static int convertBits(int a, int b) {
        return Integer.bitCount(a ^ b);
    }

    // public static int convertBits(int a, int b) {
    //     int delta = a ^ b;
    //     String binaryString = Integer.toBinaryString(delta);
    //     return (binaryString.length() - binaryString.replace("1", "").length());
    // }
}
