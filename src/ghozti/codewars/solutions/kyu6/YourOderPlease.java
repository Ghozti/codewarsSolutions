package ghozti.codewars.solutions.kyu6;

import java.util.ArrayList;

public class YourOderPlease {

    final int KYU = 6;

    /**
     * This method-
     * will sort the string "words" into an array. (arr)
     * then create an array list called sortedString
     * then create a string called fString (final string)
     * then create an int called current which will be the current number we will look for in a string
     * the first for loop:
     * - will execute the for loop inside the for loop as many times as the arr's size is
     * - check the current value of the string at arr[i] then check if the current string at [i] contains the "current" variable value in a string (ex: if the string at that value is word1 and the current variable holds a value of 1)
     * - add that string to the sortedString array list
     * - increment the current variable value by 1
     *
     * the next for loop will:
     * add up the array list variables to fString
     */

    public static String order(String words){
        String[] arr = words.split("\\W+");
        ArrayList<String> sortedString = new ArrayList<>();
        StringBuilder fString = new StringBuilder();

        int current = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j].contains(current + "")){
                    sortedString.add(arr[j]);
                    current++;
                }
            }
        }

        for (int i = 0; i < sortedString.size(); i++) {
            fString.append(sortedString.get(i) + " ");
        }
        return fString.toString().trim();
    }
}
