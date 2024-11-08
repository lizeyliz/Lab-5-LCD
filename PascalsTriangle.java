//https://www.geeksforgeeks.org/java-program-to-print-pascals-triangle/
//Use nCr formula
public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.println("4 factorial: " + factorial(4));

    }//end main

    public static int factorial(int i) {
        if (i == 0) { //base case
            return 1;
        }//end if
        return i * factorial (i - 1);
    }//end factorial




    public static void triangle (){
        //base case x == 1;
    }
}
