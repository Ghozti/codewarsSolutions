package ghozti.codewars.solutions.kyu5;

public class DirectionReduct {

    public static String[] dirReduc(String[] arr){
        int[] arrToInt = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]){
                case "NORTH":
                    break;
                case "SOUTH":
                    break;
                case "EAST":
                    break;
                case "WEST":
                    break;
            }
        }
        return new String[]{};
    }

    /*
    public static String[] dirReduc(String[] arr) {
        ArrayList<String> north = new ArrayList<>();
        ArrayList<String> south = new ArrayList<>();
        ArrayList<String> east = new ArrayList<>();
        ArrayList<String> west = new ArrayList<>();


        ArrayList<String> nDirection = new ArrayList<>();


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

        int remainder;

        if (north.size() == south.size()){
            north.clear();
            south.clear();
        }

        if (east.size() == west.size()){
            east.clear();
            west.clear();
        }

        if (north.size() > south.size()){
            remainder = north.size() - south.size();
            for (int i = 0; i < remainder; i++) {
                nDirection.add("NORTH");
            }
        }else if (north.size() < south.size()){
            remainder = south.size() - north.size();
            for (int i = 0; i < remainder; i++) {
                nDirection.add("SOUTH");
            }
        }

        if (east.size() > west.size()){
            remainder = east.size() - west.size();
            for (int i = 0; i < remainder; i++) {
                nDirection.add("EAST");
            }
        }else if (east.size() < west.size()){
            remainder = west.size() - east.size();
            for (int i = 0; i < remainder; i++) {
                nDirection.add("WEST");
            }
        }
        return nDirection.toArray(new String[0]);
    }
     */
}
