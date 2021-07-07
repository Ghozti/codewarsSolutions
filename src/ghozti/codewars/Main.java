package ghozti.codewars;

import ghozti.codewars.solutions.kyu4.EscapeTheMaze;
import ghozti.codewars.solutions.kyu5.DidYouMean;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        EscapeTheMaze.escape(new char[][] {
                "# #".toCharArray(),
                " > ".toCharArray(),
                "# #".toCharArray()
        });
        System.out.println(Arrays.deepToString(new char[][]{
                "# #".toCharArray(),
                " > ".toCharArray(),
                "# #".toCharArray()
        }));
    }
}
