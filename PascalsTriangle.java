//https://www.geeksforgeeks.org/java-program-to-print-pascals-triangle/
//Use nCr formula
public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.println("4 factorial: " + factorial(4));
        System.out.println("Row one: " + nCR(0, 0));

    }//end main

    public static int factorial(int i) {
        if (i == 0) { //base case
            return 1;
        }//end if
        return i * factorial (i - 1);
    }//end factorial




    public static int nCR (int n, int r){
        return factorial(n)/factorial(n-r)*factorial(r);
    }
}
