package Moderate.regexBinaryMod3.java;

import java.util.regex.Pattern;

/**
 * Let's start off by designing a DFA (Deterministic Finite Automaton) representing this problem.
 * <p />
 * Since (at least) every positive integer <code>i</code> may be written as <code>i = 3 * n + r</code>
 * where <code>r</code> is the remainder,
 * we can design a DFA with three states - one for each possible remainder (0, 1, 2).
 * If the remainder is 0, the integer is divisible by 3.
 * So our DFA found a valid input, if it stops in the state for remainder 0.
 * This is also the state we start in.
 * <p />
 * Btw. this is not only works for 3 - we just have to choose our remainder states accordingly.
 * <p />
 * We assume that the leftmost character in our input represents the highest bit.
 * <p />
 * Our DFA may have the following transitions (Read <code>r0 -1-> r1</code> as <code>If we are in state r0 and read a 0,
 * we go to state r1</code>):<br />
 *
 * r0 -0-> r0<br />
 * r0 -1-> r1<br />
 * r1 -0-> r2<br />
 * r1 -1-> r0<br />
 * r2 -0-> r1<br />
 * r2 -1-> r2<br />
 *
 * <pre>
 *             >        >
 *           _(1)_    _(0)_
 *         /      \ /      \
 * (0)<-> r0       r1       r2 <->(1)
 *         \__(1)_/ \__(0)_/
 *            <         <
 * </pre>
 *
 * So we only need to know the current remainder and the next place.
 * <p />
 * Why is it?
 * <p />
 * We can calculate the remainder of a binary number as the remainder of the sum of each binary place modulo 3.<br />
 * Example (1001%3):<br />
 * ((1*2^3)%3 + (0*2^2)%3 + (0*2^1)%3 + (1*2^0)%3)%3 = (2 + 0 + 0 + 1) % 3 = 0
 * <p />
 * There a several techniques to convert a DFA to a regex, but I won't go into detail here.
 */
public class RegexBinaryMod3 {

    public static Pattern multipleOf3() {
        // Regular expression that matches binary inputs that are multiple of 3
        return Pattern.compile("(1(01*0)*1|0)*");
    }

}
