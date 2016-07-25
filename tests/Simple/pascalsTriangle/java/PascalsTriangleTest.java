package Simple.pascalsTriangle.java;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertArrayEquals;

public class PascalsTriangleTest {

    @Test
    public void test1() {
        assertArrayEquals("Depth 1 should return [ [1] ]", new int[][]{{1}}, PascalsTriangle.pascal(1));
    }

    @Test
    public void test5() {
        assertArrayEquals("Depth 5 should return [ [1], [1,1], [1,2,1], [1,3,3,1], [1,4,6,4,1] ]",
                new int[][] { {1}, {1,1}, {1,2,1}, {1,3,3,1}, {1,4,6,4,1} },
                PascalsTriangle.pascal(5));
    }

    @Test
    public void test10() {
        assertArrayEquals("Depth 10 should return [ [1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1],[1,5,10,10,5,1],[1,6,15,20,15,6,1],[1,7,21,35,35,21,7,1],[1,8,28,56,70,56,28,8,1],[1,9,36,84,126,126,84,36,9,1] ]",
                new int[][]  { {1}, {1,1}, {1,2,1}, {1,3,3,1}, {1,4,6,4,1}, {1,5,10,10,5,1}, {1,6,15,20,15,6,1}, {1,7,21,35,35,21,7,1}, {1,8,28,56,70,56,28,8,1}, {1,9,36,84,126,126,84,36,9,1} },
                PascalsTriangle.pascal(10));
    }

    private static final int RANDOM_MIN_DEPTH=6, RANDOM_MAX_DEPTH=20;
    @Test
    public void testRandom() {
        int depth = RANDOM_MIN_DEPTH + new Random().nextInt(RANDOM_MAX_DEPTH-RANDOM_MIN_DEPTH+1);
        int[][] expectedPascalsTriangle = pascalSolution(depth);
        assertArrayEquals("Depth " + depth + " did not return the expected result",
                expectedPascalsTriangle,
                PascalsTriangle.pascal(depth));
    }

    private static int[][] pascalSolution(int depth) {
        int result[][] = new int[depth][];

        for(int i = 0; i < depth; i++) {
            result[i] = new int[i + 1];
            for(int j = 0; j < i + 1; j++) {
                result[i][j] = ( j == 0 || j == i ) ? 1 : result[i - 1][j - 1] + result[i - 1][j];
            }
        }

        return result;
    }

}