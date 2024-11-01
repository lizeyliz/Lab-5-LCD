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
}//end class LCM