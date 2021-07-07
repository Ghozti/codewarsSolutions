package ghozti.codewars.solutions.kyu4;

import java.util.ArrayList;
import java.util.List;

public class EscapeTheMaze {

    //vals on a 2d coordinate plane (x,y)]\

    static int move_forward_facing_right = 1;                   //+1 on the x axis

    static int move_forward_facing_left = -1;                  //-1 on the x axis

    static int move_forward_facing_up = 1;                     //1 on the y axis

    static int getMove_forward_facing_down = - 1;              //-1 on the y axis

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
