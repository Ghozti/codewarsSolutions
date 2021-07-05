package ghozti.codewars.solutions.kyu5;

import java.util.Arrays;

public class DidYouMean {
    public DidYouMean(String[] words) {
        this.words = words;
    }

    private final String[] words;

    public String findMostSimilar(String to) {
        int[] simChars = new int[words.length];

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (j < to.length()){
                    if (to.charAt(j) == words[i].charAt(j)){
                        simChars[i]++;
                    }
                }
            }
        }
        
        int maxVal = Arrays.stream(simChars).max().getAsInt();
        int simWordInd = 0;

        for (int i = 0; i < simChars.length; i++) {
            if (simChars[i] == maxVal){
                simWordInd = i;
            }
        }

        return words[simWordInd];
    }
}
