/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: PascalsTriangleGenerator.java
 * Author: Java Foundation
 * Author: Duc Ta
 * Author: <First Name> <Last Name>
 * **********************************************
 */

package assignment3PartD;

public class PascalsTriangleGenerator {

    int[] pascalRow;
    int top;
    int bottom;

    public PascalsTriangleGenerator() {


    }

    // (n k) = n! / (k! * (n-k)!)
    public int[] computeRow(int rowToCompute) {

        pascalRow = new int[rowToCompute];

        top = rowToCompute - 1;
        bottom = 1;
        // This will make the first element of any row always 1. //
        pascalRow[0] = 1;


        // I am turning the current index into 1, so I get 1 when we type 0. //
        int current = 1;
        while (current < rowToCompute) {

            // The index of the previous element //
            int previousIndex = current - 1;
            // The value of the previous element //
            int previousElement = pascalRow[previousIndex];

            // Calculate next element and use the formula I found the formula in stackoverflow //
            int numerator = previousElement * top;
            int denominator = bottom;
            int currentElement = numerator / denominator;

            pascalRow[current] = currentElement;

            // Update counters so that the calculations don't get messed up //
            top--;
            bottom++;
            current++;
        }

        return pascalRow;

    }
}
