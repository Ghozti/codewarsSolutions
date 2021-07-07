package ghozti.codewars.solutions.kyu4;

import java.util.List;

public class EscapeTheMaze {

    public static List<Character> escape(char[][] maze) {
        for( int i = 0; i < maze.length-1; i++){//number of arrays in maze 2d array
            System.out.println('*');
            for(int ii = 0; i < maze[i].length-1; i++) {//current array in maze length
                System.out.println(maze[i][ii]);
            }
        }
        System.out.println("done");
        return null;
    }
}
