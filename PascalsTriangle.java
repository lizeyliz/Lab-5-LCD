
//https://www.geeksforgeeks.org/java-program-to-print-pascals-triangle/
//Use nCr formula
import java.util.Arrays;

public class PascalsTriangle {
    public static void main(String[] args) {

        // Printing Pascal's Triangle
        System.out.println("4 factorial: " + factorial(4));
        System.out.println("Row one: " + nCR(0, 0));
        System.out.println("Row two: " + nCR(1, 0) + ", " + nCR(1, 1));
        System.out.println(nCR(3, 3));
        pascalVals();
        // Pascal's Triangle number of rows we want to print
        // Hardcoding to 5 for now.
        int numRows = 5;

        for (int n = 0; n < numRows; n++) {
            // printing spaces
            for (int spaces = 0; spaces < numRows - n - 1; spaces++) {
                System.out.print(" ");
            } // end of for loop

            // printing values
            for (int r = 0; r <= n; r++) {
                System.out.print(nCR(n, r) + " ");
            } // end of for loop
            System.out.println(); // newline

        } // end of for loop

    }// end main

    // one method for calculating values, one method for displaying value

    // find Pascal values using iteration
    public static void pascalVals() {
        // 4 rows of values, put in array
        int[] pascalVals = new int[10];
        int index = 0;
        for (int n = 0; n <= 3; n++) {
            for (int r = 0; r <= n; r++) {
                System.out.println("Row " + (n + 1) + ": " + nCR(n, r));
            }
        }
    }

    // Method to calculate factorial of a number using RECURSION.
    public static int factorial(int i) {
        if (i == 0) { // base case
            return 1;
        } // end if
        return i * factorial(i - 1);
    }// end factorial RECURSION

    // broken (3C3) fix
    public static int nCR(int n, int r) {
        // return factorial(n)/factorial(n-r)*factorial(r);
        return factorial(n) / (factorial(r) * factorial(n - r)); // Order of operations.
    }
}
