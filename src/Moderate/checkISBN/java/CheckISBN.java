package Moderate.checkISBN.java;

import java.util.*;

public class CheckISBN {

    /**
     * @param num as Long
     * @return int - how many digits contain given long number
     */
    public static int getNumLength(final Long num) {
        return (int)(Math.log10(num) + 1);
    }


    /**
     * Validates 10-digits ISBN number
     * https://en.wikipedia.org/wiki/International_Standard_Book_Number#ISBN-10_check_digits
     * @param isbn - Long
     * @return boolean (valid or not)
     */
    public static boolean isValidISBN10(final Long isbn) {
        boolean isValidISBN = false;

        // check if isbn contains 10 digits
        if (getNumLength(isbn) > 10) {
            return false;
        }

        Long sum = 0L;

        Long tmpISBN = isbn;

        List<Long> reversedIsbnArray = new ArrayList<>();


        // add digits of isbn to array
        while (tmpISBN > 0) {
            reversedIsbnArray.add(tmpISBN % 10);
            tmpISBN = tmpISBN / 10;
        }

        // algorithm
        for (int i = 0; i < 10; i++) {
            sum += reversedIsbnArray.get(i) * (i+1);
        }
        // check if isbn multiple by 11
        if (sum % 11 == 0) {
            isValidISBN = true;
        }

        return isValidISBN;
    }

    public static void main(String[] args)
    {
        Long num= 0L;

        System.out.println("Enter ISBN Number:");
        Scanner sc = new Scanner(System.in);

        num = sc.nextLong();

        //Your code here

        System.out.println("The ISBN number is:");

        if (isValidISBN10(num)) {
            System.out.println("Valid");
        } else {
            System.out.println("Not Valid");
        }




    }

}
