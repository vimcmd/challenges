package com.programmr.java.Challenges.Miscellaneous.PalindromeString;

import java.io.*;

public class PalindromeString
{

    private static String inputString;
    private static String reversedString;

    public static String reverseString(String input) {
        input = removeSymbols(input);
        return new StringBuilder(input).reverse().toString().toLowerCase();
    }

    public static boolean isPalindrome(String input) {
        input = removeSymbols(input);
        return (input.toLowerCase().equals(reversedString));
    }

    public static String removeSymbols(String str) {
        return str.replaceAll("[.><,:;!/@#$%^&*()-=_+']","");
    }

    public static void main(String a[]) throws Exception
    {
        System.out.println("Enter the string:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        inputString = br.readLine();
        System.out.println("Result string is:");
        reversedString = reverseString(inputString);
        System.out.println(reversedString);

        if(isPalindrome(inputString)) {
            System.out.print("palindrome");
        }
        else {
            System.out.print("not a palindrome");
        }
    }
}