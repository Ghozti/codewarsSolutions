package ghozti.codewars;

import ghozti.codewars.solutions.kyu6.EnoughIsEnough;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < EnoughIsEnough.deleteNth( new int[] { 20, 37, 20, 21 }, 1 ).length; i++) {
            System.out.println(EnoughIsEnough.deleteNth( new int[] { 20, 37, 20, 21 }, 1 )[i]);
        }
    }
}
