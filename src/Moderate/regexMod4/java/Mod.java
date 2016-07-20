package Moderate.regexMod4.java;

import java.util.regex.Pattern;

public class Mod {
    /* Divisibility by 4 is determined by the two least significant digits. If they (as a number) are divisible
     by 4, the whole number is, due to the fact that 100 is a multiple of 4.

     To solve the problem, I have written down the first ten multiple of four and searched for a pattern.
     And I found one. If the digit second from right is even, then the least significant digit is always [048].
     If it is odd, then the first from right is [26]. This pattern stretches from 0 to 16 and repeates thereafter.
  */
    public static Pattern mod4 = Pattern.compile("\\[[+-]?(?:(?:\\d*(?:[02468][048]|[13579][26]))|[048])\\]");
}
