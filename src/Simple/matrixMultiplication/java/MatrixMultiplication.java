package Simple.matrixMultiplication.java;


import java.util.*;
public class MatrixMultiplication{

    public static int[][] matrixMultiplication(final int[][] arr1, final int[][] arr2) {
        int result[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                for (int k = 0; k < 3; k++) {
                    result[i][j] += arr1[i][k] * arr2[k][j];
                }

            }

        }

        return result;
    }

    public static void main(String[] args)  {

        int array[][] = new int[3][3];
        int array1[][] =new int[3][3];
        int array2[][];

        Scanner scan=new Scanner(System.in);

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j <3; j++) {
                System.out.println("Matrix 1st ["+i+"]["+j+"]:");
                array[i][j]=scan.nextInt();
            }
        }

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.println("Matrix 2nd ["+i+"]["+j+"]:");
                array1[i][j]=scan.nextInt();
            }
        }

        //write your logic here


        array2 = matrixMultiplication(array, array1);


        //end


        System.out.println("Multiply of both matrix:");

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print(array2[i][j]+" ");
            }
            System.out.println();
        }

    }

}


