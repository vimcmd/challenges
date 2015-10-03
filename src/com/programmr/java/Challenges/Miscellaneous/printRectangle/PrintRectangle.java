package com.programmr.java.Challenges.Miscellaneous.printRectangle;


import java.io.*;
import java.util.*;

public class PrintRectangle {

    public static void main(String a[]) throws Exception
    {
        int l,w;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length:");
        l=scan.nextInt();
        System.out.println("Enter the width:");
        w=scan.nextInt();

        //Write your logic here

        // pretty shitty code, btw :)
        final String SYMBOL = "*";
        final String WHITESPACE = " ";
        StringBuilder outLine = new StringBuilder();
        StringBuilder innerLine = new StringBuilder().append(SYMBOL).append(SYMBOL);

        for (int i = 0; i < l; i++) {
            outLine.append(SYMBOL);
        }

        for (int i = 0; i < l - 2; i++) {
            innerLine.insert(1, WHITESPACE);
        }

        // print result
        System.out.println(outLine);
        for (int i = 0; i < w - 2; i++) {
            System.out.println(innerLine);
        }
        System.out.println(outLine);


        //end

    }
}
