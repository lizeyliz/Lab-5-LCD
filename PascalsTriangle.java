
import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("How many rows of Pascal's Triangle do you want to print?: ");
        int numRows = sc.nextInt();

        //put into method
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

    // Method to calculate factorial of a number using RECURSION.
    public static int factorial(int i) {
        if (i == 0) { // base case
            return 1;
        } // end if
        return i * factorial(i - 1);
    }// end factorial RECURSION

    //nCr formula
    public static int nCR(int n, int r) {
        // return factorial(n)/factorial(n-r)*factorial(r);
        return factorial(n) / (factorial(r) * factorial(n - r)); // Order of operations.
    }
}
