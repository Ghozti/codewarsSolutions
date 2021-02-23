package ghozti.codewars.solutions.kyu4;

import java.util.ArrayList;

public class SudokuValidator {
    public static boolean check(int[][] sudoku) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        ArrayList<ArrayList<Integer>> squares = new ArrayList<>();

        int v1a = 0,v1b = 0,v2a= 0,v2b = 0;

        for (int i = 0; i < 9; i++) {
            switch (i){
                case 0:
                    v1a = 0;
                    v1b = 3;
                    v2a = 0;
                    v2b = 3;
                    break;
                case 1:
                    v1a = 0;
                    v1b = 3;
                    v2a = 3;
                    v2b = 6;
                    break;
                case 2:
                    v1a = 0;
                    v1b = 3;
                    v2a = 6;
                    v2b = 9;
                    break;
                case 3:
                    v1a = 3;
                    v1b = 6;
                    v2a = 0;
                    v2b = 3;
                    break;
                case 4:
                    v1a = 3;
                    v1b = 6;
                    v2a = 3;
                    v2b = 6;
                    break;
                case 5:
                    v1a = 3;
                    v1b = 6;
                    v2a = 6;
                    v2b = 9;
                    break;
                case 6:
                    v1a = 6;
                    v1b = 9;
                    v2a = 0;
                    v2b = 3;
                    break;
                case 7:
                    v1a = 6;
                    v1b = 9;
                    v2a = 3;
                    v2b = 6;
                    break;
                case 8:
                    v1a = 6;
                    v1b = 9;
                    v2a = 6;
                    v2b = 9;
                    break;
            }
            squares.add(getSquare(sudoku,v1a,v1b,v2a,v2b));
        }

        for (int i = 0; i < squares.size(); i++) {
            for (int j = 0; j < arr.length; j++) {
                if (!squares.get(i).contains(arr[j])){
                    return false;
                }
            }
        }
        return true;
    }

    public static ArrayList<Integer> getSquare(int[][] sudoku,int val1a, int val1b,int val2a,int val2b){
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = val1a; i < val1b; i++) {
            for (int j = val2a; j < val2b; j++) {
                arr.add(sudoku[i][j]);
            }
        }
        return arr;
    }
}
