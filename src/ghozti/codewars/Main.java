package ghozti.codewars;

import ghozti.codewars.solutions.kyu5.DirectionReduct;

public class Main {
    public static void main(String[] args) {
        for (String i : DirectionReduct.dirReduc(new String[]{"EAST", "EAST", "WEST", "NORTH", "WEST", "EAST", "EAST", "SOUTH", "NORTH", "WEST"})){
            System.out.println(i);
        }
    }
}
