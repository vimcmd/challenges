package Simple.numberToStringFormat.java;

import java.util.Scanner;

public class NumToString
{

    public static final String TENS[] = {"one", "two", "three", "four", "five", "six", " seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    public static final String SECOND_TENS[] = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    public static final String HUNDRED = "hundred";

    public static String numToString(int num)
    {
        StringBuilder str = new StringBuilder(" ");
        // Hundreds
        int n = num / 100;
        if (n > 0)
        {
            str.append(TENS[n - 1]).append(" ").append(HUNDRED).append(" ");
        }

        // Tens
        n = (num / 10) % 10;
        if (n > 1)
        {
            str.append(SECOND_TENS[n - 2]).append(" ");
        }

        // Under tens
        n = (num / 10) % 10;
        if (n > 1)
        {
            n = num % 10;
        } else
        {
            n = num % 20;
        }

        if (n > 0)
        {
            str.append(TENS[n - 1]).append(" ");
        }

        return str.toString().trim();

    }

    public static void main(String a[]) throws Exception
    {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        num = sc.nextInt();
        System.out.println("Entered number is:");

        String t = numToString(num);
        System.out.println(t);

    }

}
