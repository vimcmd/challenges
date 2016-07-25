package Simple.pascalsTriangle.java;

public class PascalsTriangle {
    public static int[][] pascal(int depth) {

        // FIXME: 25.07.2016 assert depth <= 0

        int triangle[][] = new int[depth][];

        for(int i = 0; i < depth; i++) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = 1;
            triangle[i][i] = 1;

            for(int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }

        return triangle;
    }
}