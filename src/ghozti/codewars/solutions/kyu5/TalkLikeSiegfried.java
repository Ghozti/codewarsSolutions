package ghozti.codewars.solutions.kyu5;

import java.util.Arrays;

public class TalkLikeSiegfried {

    public static String siegfried(final int week, final String str) {
        String output = "";
        return week1(str);
    }

    private static String week1(String str){
        String output = "";
        char[] string_chars = str.toCharArray();

        for(int i = 0; i < string_chars.length; i++){
            if(i  < str.length()-1){
                if(string_chars[i] == 'c'){
                    if(string_chars[i+1] == 'i' || string_chars[i+1] == 'I' || string_chars[i+1] == 'e'|| string_chars[i+1] == 'E'){
                        string_chars[i] = 's';
                    }
                }else if(string_chars[i] == 'C'){
                    if(string_chars[i+1] == 'i' || string_chars[i+1] == 'I' || string_chars[i+1] == 'e'|| string_chars[i+1] == 'E'){
                        string_chars[i] = 'S';
                    }
                }else if(string_chars[i] == 'c' && string_chars[i+1] != 'h' && string_chars[i+1] != 'H'){
                        string_chars[i] = 'k';
                }else if(string_chars[i] == 'C' && string_chars[i+1] != 'h' && string_chars[i+1] != 'H'){
                        string_chars[i] = 'K';
                }
            }else {
                if(string_chars[i] == 'c'){
                    string_chars[i] = 'k';
                }else if(string_chars[i] == 'C'){
                    string_chars[i] = 'K';
                }
            }
        }
        return Arrays.toString(string_chars);
    }

    private static String week2(String str){
        String output = "";
        return output;
    }

    private static String week3(String str){
        String output = "";
        return output;
    }

    private static String week4(String str){
        String output = "";
        return output;
    }

    private static String week5(String str){
        String output = "";
        return output;
    }
}
