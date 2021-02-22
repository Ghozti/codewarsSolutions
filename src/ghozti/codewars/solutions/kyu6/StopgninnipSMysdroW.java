package ghozti.codewars.solutions.kyu6;

public class StopgninnipSMysdroW {

    final int KYU = 6;

    /**
     * THIS METHOD:
     * will create an array of each separate word in (sentence)
     * then loop through the array and check if the element has a length greater or equal to five
     * if so it will reverse the word and replace the element with the reversed word
     * then it will make a string out of the elements out of the array and return that string
     */

    public static String spinWords(String sentence) {
        String[] arr = sentence.split("\\W+");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() >= 5){
                String newWord = "";
                for (int j = arr[i].length()-1; j != -1 ; j--) {
                    newWord += arr[i].charAt(j);
                }
                arr[i] = newWord;
            }
        }

        sentence = "";

        for (String i : arr){
            sentence += i + " ";
        }

        return sentence.trim();
    }
}
