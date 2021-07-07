package ghozti.codewars.solutions.kyu4;

import java.util.ArrayList;
import java.util.List;

public class EscapeTheMaze {

    public static List<Character> escape(char[][] maze) {
        ArrayList<String> charlist = new ArrayList<>();
            for (int i = 0; i < maze.length; i++) {//number of arrays in maze 2d array
                for (int ii = 0; ii < maze[i].length; ii++) {//current array in maze length
                    charlist.add(maze[i][ii] + "");
                }
                System.out.println(charlist);
            }
        System.out.println("done");
        return null;
    }
}
