package ghozti.codewars.solutions.kyu5;

import java.util.ArrayList;

public class DirectionReduct {
    public static String[] dirReduc(String[] arr) {
        ArrayList<String> north = new ArrayList<>();
        ArrayList<String> south = new ArrayList<>();
        ArrayList<String> east = new ArrayList<>();
        ArrayList<String> west = new ArrayList<>();


        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("NORTH")){
                north.add(arr[i]);
            }else if (arr[i].equals("SOUTH")){
                south.add(arr[i]);
            } else if (arr[i].equals("EAST")){
                east.add(arr[i]);
            } else if (arr[i].equals("WEST")){
                west.add(arr[i]);
            }
        }

        int remainder = 0;

        if (north.size() == south.size()){
            north.clear();
            south.clear();
        }

        if (east.size() == west.size()){
            east.clear();
            west.clear();
        }

        System.out.println("");
        System.out.println(north);
        System.out.println(south);
        System.out.println(east);
        System.out.println(west);


        return new String[] {};
    }
}
