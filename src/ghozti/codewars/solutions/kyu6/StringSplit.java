package ghozti.codewars.solutions.kyu6;

import java.util.ArrayList;
import java.util.List;

public class StringSplit {

    final int KYU = 6;

    /**
     * THIS METHOD:
     * will create a result array list
     * check to see if the length of "s" is divisible by 2. If not it will ad "_"
     * add  a substring of the index of the value of i and a i+2
     */

    public static String [] solution(String s) {
        List<String> result = new ArrayList<>();
        if(s.length() %2 == 1){
            s = s+"_";
        }
        for(int i=0;i<s.length() - 1;i+=2){
            result.add(s.substring(i, i+2));
        }
        String[] str = new String[result.size()];

        for (int i = 0; i < result.size(); i++) {
            str[i] = result.get(i);
        }
        return str;
    }
}
