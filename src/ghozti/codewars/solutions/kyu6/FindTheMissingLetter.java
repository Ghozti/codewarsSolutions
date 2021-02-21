package ghozti.codewars.solutions.kyu6;

import java.util.ArrayList;

public class FindTheMissingLetter {

    public static char findMissingLetter(char[] arr){
        ArrayList<Character> alphabet = new ArrayList<>();
        ArrayList<Character> compareArr =  new ArrayList<>();
        ArrayList<Character> alp = new ArrayList<>();

        boolean upper = false;

        if (arr[0] > 64 && arr[0] < 91) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Character.toLowerCase(arr[i]);
                upper = true;
            }
        }

        for (int i = 97; i < 172; i++) {
            alphabet.add((char) i);
        }

        for (int i = 0; i < arr.length; i++) {
            compareArr.add(arr[i]);
        }
        int sind = 0;
        int eind = 0;

        for (int j = 0; j < alphabet.size(); j++) {
            if (alphabet.get(j) == compareArr.get(0)){
                sind = j;
            }
        }

        for (int i = 0; i < alphabet.size()-1; i++) {
            if (alphabet.get(i) == compareArr.get(compareArr.size()-1)){
                eind = i;
            }
        }

        for (int i = sind; i < eind; i++) {
            alp.add(alphabet.get(i));
        }


        for (int i = 0; i < compareArr.size(); i++) {
            if (!compareArr.contains(alp.get(i))){
                if (upper){
                    return (alp.get(i) + "").toUpperCase().charAt(0);
                }
                return alp.get(i);
            }
        }
        return ' ';
    }
}
