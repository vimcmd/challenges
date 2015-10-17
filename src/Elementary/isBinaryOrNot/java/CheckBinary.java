package Elementary.isBinaryOrNot.java;

import java.util.Scanner;

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
