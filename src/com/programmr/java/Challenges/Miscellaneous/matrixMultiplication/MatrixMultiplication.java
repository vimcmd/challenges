package com.programmr.java.Challenges.Miscellaneous.matrixMultiplication;


import java.util.*;
public class MatrixMultiplication{

/*

Write a program to takes two matrix(3*3) array as inputs and calculate the multiplication of both matrix.

Example :
1. If two matrix are :
Matrix 1st :
1 2 3
4 5 6
7 8 1

Matrix 2nd:
1 2 3
3 2 1
4 5 2

then the multiplication of both matrix should be :
19 21 11
43 48 29
35 35 31

2. If two matrix are :
Matrix 1st :
4 4 4
2 2 2
3 3 3

Matrix 2nd :
1 4 3
3 2 4
1 2 4

then the multiplication of both matrix should be :
20 32 44
10 16 22
15 24 33

*/

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


