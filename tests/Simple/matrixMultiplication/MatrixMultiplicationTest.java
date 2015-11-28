package Simple.matrixMultiplication;

import Simple.matrixMultiplication.java.MatrixMultiplication;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MatrixMultiplicationTest
{

    @Test
    public void testMatrixMultiplication() throws Exception
    {
        final int[][] matrix1 = new int[][]{{1, 2, 3},
                {4, 5, 6},
                {7, 8, 1}};

        final int[][] matrix2 = new int[][]{{1, 2, 3},
                {3, 2, 1},
                {4, 5, 2}};

        final int result[][] = new int[][]{{19, 21, 11},
                {43, 48, 29},
                {35, 35, 31}};

        assertArrayEquals(result, MatrixMultiplication.matrixMultiplication(matrix1, matrix2));
    }

    @Test
    public void testMatrixMultiplication2() throws Exception
    {
        final int[][] matrix1 = new int[][]{{4, 4, 4},
                {2, 2, 2},
                {3, 3, 3}};

        final int[][] matrix2 = new int[][]{{1, 4, 3},
                {3, 2, 4},
                {1, 2, 4}};

        final int result[][] = new int[][]{{20, 32, 44},
                {10, 16, 22},
                {15, 24, 33}};

        assertArrayEquals(result, MatrixMultiplication.matrixMultiplication(matrix1, matrix2));
    }
}