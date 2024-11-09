
//wikihow least common denominator
import java.util.Scanner;

public class LCD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userInt = 1;
        int num1;
        int denom1;
        int num2;
        int denom2;

        while (userInt != 0) {
            System.out.println("Enter numerator for first fraction:");
            num1 = scan.nextInt();
            System.out.println("Enter denominator for first fraction:");
            denom1 = scan.nextInt();
            System.out.println("Enter numerator for second fraction:");
            num2 = scan.nextInt();
            System.out.println("Enter denominator for second fraction:");
            denom2 = scan.nextInt();

            printLCD(denom1, num1, denom2, num2);
            System.out.println("Enter any number to continue, or enter 0 to quit.");
            userInt = scan.nextInt();
        }
        System.out.println("Goodbye!");
    }// end main

    // Method to find the least common denominator using GCD
    public static int leastCD(int denom1, int denom2) {
        // math absolute value https://www.turing.com/kb/java-absolute-value
        return Math.abs(denom1 * denom2) / gcd(denom1, denom2);
    }// end least CD

    // Recursive method to find the greatest common divisor
    public static int gcd(int a, int b) { // receives a and b as denom1 and denom2
        // Base case: if b is 0, gcd is a
        if (b == 0) {
            return a;
        } // end if
          // Recursive case: gcd(a, b) = gcd(b, a % b)
        return gcd(b, a % b);
    }// end gcd

    public static void printLCD(int denom1, int num1, int denom2, int num2) {
        int lcd = leastCD(denom1, denom2);
        System.out.println("The least common denominator of " + num1 + "/" + denom1 +
                " and " + num2 + "/" + denom2 + " is: " + lcd);
    }// end printLCD
}// end class LCM