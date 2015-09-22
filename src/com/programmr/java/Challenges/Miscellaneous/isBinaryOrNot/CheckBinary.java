package com.programmr.java.Challenges.Miscellaneous.isBinaryOrNot;

import java.io.*;
import java.util.Scanner;

/*
A binary number is written as combination of 1's and 0's.
Binary number 100 indicates 4.

Write a program which accepts a number and prints whether it is binary or not.

For Ex:

1) if user inputs 1040400
then it should print "Not Binary".

2) if user inputs 1000100
then it should print "Binary".
*/

public class CheckBinary {

    public static void checkBinary(final int num) {
        try {
            Integer tmp = Integer.parseInt(num+"", 2);
            System.out.println("Binary");
        } catch (Exception e) {
            System.out.println("Not Binary");
        }
    }
    public static void main(String[] args)
    {
        int num;
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        // starting conditions
        num = sc.nextInt();

        checkBinary(num);

    }

}
