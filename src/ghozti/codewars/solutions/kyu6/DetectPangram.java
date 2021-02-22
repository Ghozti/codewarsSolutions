package ghozti.codewars.solutions.kyu6;

import java.util.ArrayList;

public class DetectPangram {

    final int KYU = 6;

    /**
     * THIS METHOD:
     * will make (sentence) into a lower case string
     * create 1 array list and an array. (arr will have each letter in the alphabet) (contains will hold a string value to compare later) (more on this later)
     * the 2 for loops set values to the arrays (the second one will set "0" for each element in the array which will be used to check if this letter was detected in (sentence)
     * the other for loop will loop through the (sentence) string and check if it contains a letter from the alphabet if so it will replace that index  value with "1" in the array
     * ex: if the sentence contains 'a' it will replace the value of the array at index 0 with "1"
     * the final loop will loop through the array and check to see if every value is equals to "1" (if all 26 values are equal to "1" it means that all 26 letters have been detected)
     */

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

        for (int i = 0; i < contains.length; i++) {
            if (contains[i].equals("0")){
                return false;
            }
        }

        return true;
    }
}
