package ghozti.codewars;

import ghozti.codewars.solutions.kyu4.EscapeTheMaze;
import ghozti.codewars.solutions.kyu5.DidYouMean;
import ghozti.codewars.solutions.kyu5.ZooDisaster;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(ZooDisaster.whoEatsWho("fox,bug,chicken,grass,sheep,lion")));
    }
}
