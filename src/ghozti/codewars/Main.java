package ghozti.codewars;

import ghozti.codewars.solutions.kyu6.EnoughIsEnough;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < EnoughIsEnough.deleteNth((new int[] { 1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1 }), 3).length; i++) {
            System.out.println(EnoughIsEnough.deleteNth((new int[] { 1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1 }), 3)[i]);
        }
    }
}
