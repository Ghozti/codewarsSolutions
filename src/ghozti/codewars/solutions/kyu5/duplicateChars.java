package ghozti.codewars.solutions.kyu5;
import java.util.ArrayList;

public class duplicateChars {

        final int KYU = 5;

        /*
        The method below will:
        - create 2 array lists (one for non duplicate chars and one for duplicate characters)
        - Then i will loop through the text parameter length
        - then i create a string which will be the char of the current charAt() (i create a string because the .contains method requires an object and chars are not objects so a string is what's needed
        - then the first thing checked is if the non duplicate array list does not contain this char. If so it will add it.
        - if the non duplicate array list contains the char already then it will add the char to the duplicate array list
        - if both arrays contain the value then nothing gets added
        -once this is done for every index it will return the length of the duplicate list
     */

    public static int duplicateCount(String text) {
        ArrayList nondupes = new ArrayList();
        ArrayList dupes = new ArrayList();

        for (int i = 0; i < text.length(); i++){
            String charr = String.valueOf(text.charAt(i)).toLowerCase();
            if (!nondupes.contains(charr)){
                nondupes.add(charr);
            }else if (!dupes.contains(charr)){
                dupes.add(charr);
            }
        }
        return dupes.size();
    }
}
