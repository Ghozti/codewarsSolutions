package ghozti.codewars.solutions.kyu6;

public class StopgninnipSMysdroW {
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
