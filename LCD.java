//wikihow least common denominator
public class LCD {
    public static void main (String[] args) {
        //enter numerator 1, enter denom one
        //enter numerator 2 enter denom 2
    }//end main
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