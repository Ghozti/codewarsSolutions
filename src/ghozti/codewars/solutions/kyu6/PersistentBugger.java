package ghozti.codewars.solutions.kyu6;

import java.util.ArrayList;

public class PersistentBugger {

    final int KYU = 6;

    /**
     * THIS METHOD:
     * create a variable called x (for x times that it takes to make the long into a single number digit)
     * create a while loop who's condition is to run the code below while (n) is greater than 9 (since 9 is the highest single digit number possible)
     * turn (n) into a string (so we can get each individual number later)
     * create an array list (arr) which will hold the individual numbers
     * add the individual numbers of (n) to (arr)
     * create a long variable (product) which will have an initial value of whatever number arr has first
     * multiply each individual number with each other
     * increment x by 1
     * update (n) to be the value of (product)
     * return x
     */

    public static int persistence(long n) {
        int x = 0;
        while (n > 9){
            String nString = n + "";
            ArrayList<Long> arr = new ArrayList<>();
            for (int i = 0; i < nString.length(); i++) {
                arr.add(Long.parseLong(nString.charAt(i) + ""));
            }

            long product = arr.get(0);

            for (int i = 1; i < arr.size(); i++) {
                product *= arr.get(i);
            }
            x++;
            n = product;
        }
        return x;
    }
}