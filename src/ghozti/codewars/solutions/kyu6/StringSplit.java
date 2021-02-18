package ghozti.codewars.solutions.kyu6;

public class StringSplit {
    public static String[] solution(String s) {
        if((s.length()%2) != 0) s += "_";

        String[] arr = new String[s.length()];

        for(int i = 0; i < s.length(); i++){
            arr[i] = s.charAt(i) + "" + s.charAt(i);
        }
        return arr;
    }
}
