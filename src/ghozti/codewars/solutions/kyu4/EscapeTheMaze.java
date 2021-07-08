package ghozti.codewars.solutions.kyu4;

import java.util.ArrayList;
import java.util.List;

public class EscapeTheMaze {

    //values on a 2d coordinate plane (x,y)]\

    static final int move_forward_facing_right = 1;                  // +1 on the x axis

    static final int move_forward_facing_left = -1;                  // -1 on the x axis

    static final int move_forward_facing_up = 1;                     // +1 on the y axis

    static final int move_forward_facing_down = - 1;                 // -1 on the y axis


    //"player" status values

    static final char x_axis_left = '<';                            //this will make the next forward move -1 on the x axis

    static final char x_axis_right = '>';                           // this will make the next forward move +1 on the x axis

    static final char y_axis_down = 'v';                            // this will make the next forward move -1 on the y axis

    static final char y_axis_up = '^';                              // this will make the next forward move +1 on the y axis

    static String valid_move;

    static char current_player;

    static boolean escaped = false;

    public static List<Character> escape(char[][] maze) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < maze.length; i++) {//number of arrays in maze 2d array
            for (int ii = 0; ii < maze[i].length; ii++) {//current array in maze length
                list.add(maze[i][ii] + "");
            }
            System.out.println(list);
            list = new ArrayList<>();
        }

        System.out.println(current_player);

        while(!escaped){
            switch (current_player):


        }
        return null;
    }

    public void update_player(char[][] maze){
        for (int i = 0; i < maze.length; i++) {
            for (int ii = 0; ii < maze[i].length; ii++) {
                if(maze[i][ii] == '>' || maze[i][ii] == '<' || maze[i][ii] == '^' || maze[i][ii] == 'v'){
                    current_player = maze[i][ii];
                }
            }
        }
    }

}
