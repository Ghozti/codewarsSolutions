package ghozti.codewars.solutions.kyu5;

import java.util.ArrayList;

public class DidYouMean {
    public DidYouMean(String[] words) {
        this.words = words;
    }

    private final String[] words;

    public String findMostSimilar(String to) {
        int[] simCount = new int[words.length];

        for(int i = 0; i < words[i].length() && i < to.length(); i++) {
            if(words[i].charAt(i) == to.charAt(i)){
                simCount[i]++;
            }
        }

        for (int j : simCount) {
            System.out.println(j);
        }
        return null;
    }
}
