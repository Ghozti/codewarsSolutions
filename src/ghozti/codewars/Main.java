package ghozti.codewars;

import ghozti.codewars.solutions.kyu6.StringSplit;

public class Main {

    public static void main(String[] args) {
        String[] arr = StringSplit.solution("dogandcat");
        for (String i : arr){
            System.out.println(i);
        }
    }
}
