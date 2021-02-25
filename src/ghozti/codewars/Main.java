package ghozti.codewars;

import ghozti.codewars.solutions.kyu5.DidYouMean;

public class Main {
    public static void main(String[] args) {
        DidYouMean didYouMean = new DidYouMean(new String[]{"cherry", "pineapple", "melon", "strawberry", "raspberry"});
        didYouMean.findMostSimilar("strawbery");
    }
}
