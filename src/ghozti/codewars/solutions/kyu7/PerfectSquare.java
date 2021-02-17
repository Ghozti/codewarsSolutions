package ghozti.codewars.solutions.kyu7;

public class PerfectSquare {

    final int KYU = 7;

    /*
    The method does:
    - get the square root of (n) and stores it in an int
    - checks to see if the sqrt is a double or int
    - if it is an int it returns true
     */
    public static boolean isSquare(int n) {
        double sqrt = Math.sqrt(n);

        if(sqrt % 1 == 0) return true;
        return false;
    }
}
