package ghozti.codewars.solutions.kyu5;

import java.util.ArrayList;
import java.util.List;

public class DirectionReduct {

    final int KYU = 5;

    /**
     * @author AGoetzDev
     * THIS IS NOT MY CODE
     */

    public static String[] dirReduc(String[] arr) {
        int oldlength = arr.length;
        int newlength = 0;
        while(newlength != oldlength){
            oldlength = arr.length;
            arr = reduc(arr);
            newlength = arr.length;
        }
        return arr;
    }

    public static String[] reduc(String[] arr){
        List<String> list = new ArrayList<>();
        for(int i= 0; i<arr.length;i++){
            if(i != arr.length-1 && ((arr[i].equals("NORTH") && arr[i+1].equals("SOUTH")) || (arr[i].equals("SOUTH") && arr[i+1].equals("NORTH")))){
                i++;
            } else if(i != arr.length-1 && ((arr[i].equals("WEST") && arr[i+1].equals("EAST")) || (arr[i].equals("EAST") && arr[i+1].equals("WEST")))){
                i++;
            } else{
                list.add(arr[i]);
            }
        }
        String[] stockArr = new String[list.size()];
        stockArr = list.toArray(stockArr);
        return stockArr;
    }
}
