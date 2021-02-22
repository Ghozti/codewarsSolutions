package ghozti.codewars.solutions.kyu6;

import java.util.ArrayList;

public class DigitalRoots {

    final int KYU = 6;

    /**
     * THIS METHOD:
     * checks to see if (n) is less than 9 (since 9 is the greatest single digit number we can have) if so it will simply return that number
     * if the number is not less than 9:
     * it creates an array list which will hold each individual number ex (n = 999) arr will have {9,9,9}
     * it converts the int to a string (so we get each individual number)
     * converts each string index back to a single int and adds it to the arr list
     * adds each element in the array list with each other
     * checks if the sum is less than or equal to 9 if so it returns the sum
     * else the method will call itself to repeat this process as many times as needed
     */

    public static int digital_root(int n){
        if(n <= 9){
            return n;
        }

        ArrayList<Integer> arr = new ArrayList<>();

        String s = n + "";

        for (int i = 0; i < s.length(); i++) {
            arr.add(Integer.parseInt(s.charAt(i) + ""));
        }

        int sum = arr.get(0);

        for (int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
        }

        if (sum > 9){
            sum = digital_root(sum);
        }
        return sum;
    }
}