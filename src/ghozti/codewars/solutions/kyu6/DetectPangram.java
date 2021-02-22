package ghozti.codewars.solutions.kyu6;

import java.util.ArrayList;

public class DetectPangram {
    public static boolean check(String sentence){
        sentence = sentence.toLowerCase();

        ArrayList<Character> arr = new ArrayList<>();
        String[] contains = new String[26];

        for (int i = 97; i < (97+26); i++) {
            arr.add((char) i);
        }

        for (int i = 0; i < 26; i++){
            contains[i]= "0";
        }


        for (int i = 0; i < sentence.length(); i++){
            for (int j = 0; j < arr.size(); j++) {
                if (sentence.charAt(i) == arr.get(j)){
                    contains[j] = "1";
                    break;
                }
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(contains[i]);
        }

        for (int i = 0; i < contains.length; i++) {
            if (contains[i].equals("0")){
                return false;
            }
        }

        return true;
    }
}
