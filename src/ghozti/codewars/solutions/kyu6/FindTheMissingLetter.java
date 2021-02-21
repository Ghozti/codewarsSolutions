package ghozti.codewars.solutions.kyu6;

import java.util.ArrayList;

public class FindTheMissingLetter {

    final int KYU = 6;

    /**
     * THIS METHOD:
     * will create 3 array lists (alphabet) which will hold all letters in the alphabet (compareArr) which will hold the char array's values in an array list (alp) which will get the chars in range (more on that later)
     * create a boolean called "upper" which will be used if the char array has upper case letters
     * the if condition will check to see if the char at arr[0] is upper case. if so it will turn all arr values to lower case and set upper to true
     * the second for loop will put all characters in the alphabet array list (using their numeric value)
     * the 3rd for loop will pass the values at arr to the compareArr array list
     * then it will create 2 ints (sind for (start index) and eind for (end index)) these variables will be used to search for a specific range in characters in ASCII values)
     * the 4th loop will check to see what character the 1st value in compareArr is and set it's ASCII value to (sind)
     * the 5th one will do the same except with the last value of comapreArr and that ASCII value will be used for (eind)
     * the 6th for loop will take the correct character sequence and put it in the alp) array list (ex if the correct sequence for {a,b,c,e} is {a,b,c,d,e} <-- this will be added to alp
     * the final for loop will iterate through compareArr values then check to see if the chars in those lists are matching to the alp array list. If a character does not match it returns that since that's the missing char
     * ex: arr = {a,b,c,e}
     * then the method will do it's thing and create an array list with the values of {a,b,c,d,e} for (alp)
     * then it will compare these 2 array lists and check for the missing value
     * then it will return d since that's the missing value
     */

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
