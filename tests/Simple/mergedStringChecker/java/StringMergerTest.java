package Simple.mergedStringChecker.java;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringMergerTest {

    @Test
    public void normalHappyFlow() {
        assertTrue("codewars can be created from code and wars", StringMerger.isMerge("codewars", "code", "wars"));
        assertTrue("codewars can be created from cdwr and oeas", StringMerger.isMerge("codewars", "cdwr", "oeas"));
        assertFalse("Codewars are not codwars", StringMerger.isMerge("codewars", "cod", "wars"));
    }

    @Test
    public void canHandleEmptyStrings() {
        assertFalse(StringMerger.isMerge("string", "", ""));
        assertFalse(StringMerger.isMerge("string", "", "ing"));
        assertTrue(StringMerger.isMerge("string", "string", ""));
    }

    @Test
    public void someTrickyRandomCases() {
        assertTrue(StringMerger.isMerge(
                "2Z6.16b;cCN$1B@FY/kX5slo& Iv8QaCDu2Z6.16b;cCN$q,PjkA/K9jcJkNIze_dARMLHCuB^8q\\0QbA8*u",
                "2Z6.16b;cCN$q,PjkA/K9jcJkNIze_dARMLHCu",
                "2Z6.16b;cCN$1B@FY/kX5slo& Iv8QaCDuB^8q\\0QbA8*u"));
        assertTrue(StringMerger.isMerge(
                "Abcd12Abcd14",
                "Abcd12",
                "Abcd14"
        ));
    }

    @Test
    public void canHandleExtraChars() {
        // codewars is not codewarss
    }

    @Test
    public void someRandomCases() {
        assertTrue(StringMerger.isMerge(
                "Can we merge it? Yes, we can!",
                "a weerge i? wecan",
                "Cn mt Yes, !"));
    }

    @Test
    public void someMoreRandomCases() {
        assertTrue(StringMerger.isMerge(
                "cf&-C^&,eDku/04KPs38G!%I",
                "f&,Dk438I",
                "c&-C^eu/0KPsG!%"));
    }

}