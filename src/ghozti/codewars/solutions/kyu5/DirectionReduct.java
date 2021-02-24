package ghozti.codewars.solutions.kyu5;

import java.util.ArrayList;
import java.util.List;

public class DirectionReduct {

    final int KYU = 5;

    /**
     * @author AGoetzDev
     * THIS IS NOT MY CODE
     * but what it does based on my understanding is that it will loop through (arr) to see if the value of arr[i+1] is the opposite value of arr[i] if so it will not add them to the new list
     * This process will repeat until the length of arr is not equal to stockArr
     * following this:
     * if we input "NORTH","SOUTH","SOUTH", "EAST", "WEST", "NORTH", "WEST"
     * this method will firts look at north, then it will check if the next element is south. Since this is true it will not add any of these values to the List and it will skip to the next value
     * it will see that the next value is south and since east is not north it will add south to the list
     * at this point the list will be equal to {south}
     * then it will look at east and see that the next value is west so it will skip these 2 and not add them
     * then it will see that the next value is north and since the next value is west it will add north
     * at this point the list is {south,north}
     * then it will also add west so the list will be {south,north,west}
     *
     * then the method called will:
     * create 2 variables oldLength being the size of arr newlength is 0
     * while the new length is not the same as old length
     * it will set the old length to the arr length again
     * then update (arr) to be the array returned from (reduc)
     * then set the new length to be the size of the updates array
     * ehat this asserts is that these 2 arrays agree in length and values since at this point there is nothing else to reduct
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
