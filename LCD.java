//wikihow least common denominator
public class LCD {
    public static void main (String[] args) {
        int denom1 = 36; // Hard coded - will need to change to user input later.
        int denom2 = 48;

        int lcd = leastCD(denom1, denom2);
        System.out.println("The least common denominator of " + denom1 + " and " + denom2 + " is: " + lcd);
    }//end main
    
// Method to find the least common denominator using GCD
public static int leastCD(int denom1, int denom2) {
    return Math.abs(denom1 * denom2) / gcd(denom1, denom2);  // math absolute value https://www.turing.com/kb/java-absolute-value
}

// Recursive method to find the greatest common divisor
public static int gcd(int a, int b) {  // receives a and b as denom1 and denom2
    // Base case: if b is 0, gcd is a 
    if (b == 0) {
        return a;
    }
    // Recursive case: gcd(a, b) = gcd(b, a % b)
    return gcd(b, a % b);
}

    public static int leastCommonDenom(int denom1, int denom2) {
        int lcd = 0;
        //limit is denom1*denom2
        int[] denom1Mults = new int[denom1 * denom2];
        int[] denom2Mults = new int[denom1 * denom2];
        //populate denom1Mults array with multiples
        int multiple = 1;
        for (int i = 0; i < denom1Mults.length - 1; i++) {
            denom1Mults[i] = denom1 * multiple;
            multiple++;
        }//end for loop

        multiple = 1;
        //traverse denom1Mults
        for (int i = 0; i < denom1Mults.length - 1; i++) {
            if (denom2 = denom1Mults[i]) {
                denom2 = lcd;
            } else {
                
            }
        }//end for loop
        return lcd;
    }

    //lease common denominator
    //enter denominator of first and second fraction
    public static int lCD(int denom1, int denom2) {
        //base case denom1 = denom2
        if (denom1 == denom2) {
            return denom1;
        }
        else {
            int highestNum = denom1 * denom2; //48
            int multipleDenom1[];
            multipleDenom1 = new int[(highestNum/denom1 + 1)]; //array of 12
            //put multiples of denom1 to highestNum into array
            for (int i = 0; i < multipleDenom1.length; i++) {
                multipleDenom1[i] = denom1 * i;
                System.out.print(multipleDenom1[i] + " ");
            }
            System.out.println();
            //compare multiples of denom2 with array of denom1
            for (int i = 0; i < (highestNum/denom2); i++) {
                int multipleDenom2 = denom2 * i;
                System.out.print(multipleDenom2 + " ");
                for (int j = 0; j < multipleDenom1.length; j++) {
                    //multipleDenom1[i] = denom1 * i;
                    if (multipleDenom1[j] == multipleDenom2 && multipleDenom2 != 0) {
                        System.out.println("Found");
                        return multipleDenom2;
                    }
                }
            }//end outside for loop
            System.out.println();
            return highestNum; //if none of them match, returnt the highest multiple
        }//end if else
    }//end leastCommonDenom method



}//end class LCM