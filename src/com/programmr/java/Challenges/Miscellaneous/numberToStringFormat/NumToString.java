package com.programmr.java.Challenges.Miscellaneous.numberToStringFormat;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class NumToString
{

    public static final String TENS[] = {"one","two","three","four","five","six"," seven", "eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
    public static final String SECOND_TENS[] = {"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
    public static final String HUNDRED = "hundred";

    public static String numHundredsToString(final int num) {
        String tmp = "";
        int n = num / 100;
        if (n > 0) {
            tmp += TENS[n-1] + " " + HUNDRED;
        }
        return tmp;
    }

    public static String numOtherTensToString(final int num) {
        String tmp = "";
        int n = (num / 10) % 10;
        if (n > 1) {
            tmp += SECOND_TENS[n-2];
        }
        return tmp;
    }

    public static String numTensToString(final int num) {
        String tmp = "";
        int n = (num / 10) % 10;
        if (n > 1) {
            n = num % 10;
        } else {
            n = num % 20;
        }

        if (n > 0) {
            tmp += TENS[n-1];
        }
        return tmp;
    }

    public static String numToString(int num) {
        // TODO add whitespaces
        //return String.join(" ", numHundredsToString(num), numOtherTensToString(num), numTensToString(num));
        List<String> list = new LinkedList<>();

        if (!numHundredsToString(num).isEmpty()){
           list.add(numHundredsToString(num));
        }
        if (!numOtherTensToString(num).isEmpty()){
            list.add(numOtherTensToString(num));
        }
        if (!numTensToString(num).isEmpty()){
            list.add(numTensToString(num));
        }

        // TODO fix for below Java 8 (ternary operator?)
        return String.join(" ", list);

    }

    public static void main(String a[]) throws Exception {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        num=sc.nextInt();
        System.out.println("Entered number is:");

        String t = numToString(num);
        System.out.println(t);

    }



}