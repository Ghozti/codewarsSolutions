package ghozti.codewars;

import ghozti.codewars.solutions.kyu5.DirectionReduct;

public class Main {
    public static void main(String[] args) {
        for (String i : DirectionReduct.dirReduc(new String[]{"NORTH","SOUTH","SOUTH", "EAST", "WEST", "NORTH", "WEST"})){
            System.out.println(i);
        }
    }
}
