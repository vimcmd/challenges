package Moderate.checkISBN.java;

import java.util.*;

// TODO: write tests

public class CheckISBN {

    public static void main(String[] args)
    {

        System.out.println("Enter ISBN Number:");
        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        //Your code here

        System.out.println("The ISBN number is:");

        if (isValidISBN10( parseISBN(input) )) {
            System.out.println("Valid");
        } else {
            System.out.println("Not Valid");
        }

    }

    /**
     * @param num as Long
     * @return int - how many digits contain given long number
     */
    public static int getNumLength(final Long num) {
        return (int)(Math.log10(num) + 1);
    }

    /**
     *
     * @param stringIsbn take ISBN as string (without formatting)
     * @return List of Integers of ISBN string
     */
    public static List<Integer> parseISBN(final String stringIsbn) {
        // remove all non-digit symbols
        String isbnDigits = stringIsbn.replaceAll("\\D+", "");

        List<Integer> isbnList = new ArrayList<>();

        try {
            for (char ch : isbnDigits.toCharArray()) {
                isbnList.add( Integer.parseInt("" + ch) );
            }
        } catch (NumberFormatException nfe) {
            // Suppress and skip exception if char is non-digit symbol
            // btw, string already replaced non-digits with ""
        }

        return isbnList;
    }

    /**
     * Validates 10-digits ISBN number
     * https://en.wikipedia.org/wiki/International_Standard_Book_Number#ISBN-10_check_digits
     * @param isbn - List of Integers (list size must be == 10, else not valid)
     * @return boolean (valid or not)
     */
    public static boolean isValidISBN10(final List<Integer> isbn) {
        boolean isValidISBN = false;

        Integer sum = 0;

        // check if isbn size equals 10 digits
        if ( isbn.size() != 10 ) {
            return false;
        }

        // algorithm
        for (int i = 0; i < 10; i++) {
            sum += isbn.get(10 - i - 1) * (i + 1);
        }
        // check if isbn multiple by 11
        if (sum % 11 == 0) {
            isValidISBN = true;
        }

        return isValidISBN;
    }



}
