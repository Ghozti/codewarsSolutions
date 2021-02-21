package ghozti.codewars.solutions.kyu6;

import java.util.ArrayList;

public class PersistentBugger {

    final int KYU = 6;

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
