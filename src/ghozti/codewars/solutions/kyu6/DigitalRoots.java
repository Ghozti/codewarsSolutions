package ghozti.codewars.solutions.kyu6;

import java.util.ArrayList;

public class DigitalRoots {
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