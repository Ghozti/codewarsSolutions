package ghozti.codewars.solutions.kyu6;

import java.util.ArrayList;

public class YourOderPlease {
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
