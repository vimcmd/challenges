package com.programmr.java.Challenges.Miscellaneous.pascalTriangle;


import java.util.*;

public class PascalTriangle
{
    public static void main(String a[]) throws Exception
    {
        int num;
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter number of rows for pascal triangle:");
        num=scan.nextInt();
        System.out.print("Pascal Triangle of " + num + " is:");
        System.out.println();

        //Write your logic here
        pascalTrianglePrint(pascalTriangle(num));
        //end

    }

    /**
     *
     * @param totalTriangleLines - how many rows pascal triangle should contain
     * @return 2D List of Integers started from first row
     */
    public static List<List<Integer>> pascalTriangle(final int totalTriangleLines) {
        List<List<Integer>> triangle = new ArrayList<>();

        // initialize first line
        if (totalTriangleLines > 0) {
            triangle.add(Collections.singletonList(1));
        }

        // add lines till totalTriangleLines
        for (int i = 1; i < totalTriangleLines; i++) {
            List<Integer> prevLine = triangle.get(i - 1);
            List<Integer> currLine = new ArrayList<>();

            for (int j = 0; j < prevLine.size() + 1; j++) {
                Integer sum;

                // if previous/next element in previous row not exists (equals to 0),
                // set current element to 1
                try {
                    sum = prevLine.get(j - 1) + prevLine.get(j);
                } catch (IndexOutOfBoundsException e) {
                    sum = 1;
                }
                currLine.add(sum);
            }

            triangle.add(i, currLine);
        }

        return triangle;
    }

    public static void pascalTrianglePrint(final List<List<Integer>> triangle) {
        // code specified for current task
        Integer fullLength =  triangle.size();

        for (List row : triangle) {
            StringBuilder rowString = new StringBuilder();
            // add pre-underscores
            for (int i = fullLength - row.size(); i > 0; i--) {
                rowString.insert(0, "_");
            }
            // add after-underscores
            for (Object elem : row) {
                rowString.append(elem).append("_");
            }

            System.out.println(rowString);

        }

    }


}