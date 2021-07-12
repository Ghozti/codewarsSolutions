package ghozti.codewars.solutions.kyu5;

import java.util.ArrayList;
import java.util.Arrays;

public class TalkLikeSiegfried {

    public static String siegfried(final int week, final String str) {
        String output = "";

        switch (week){
            case 1:
                output = week1(str);
                break;
            case 2:
                output = week2(str);
                break;
            case 3:
                output = week3(str);
                break;
            case 4:
                output = week4(str);
                break;
            case 5:
                output = week5(str);
                break;
        }

        return output;
    }

    private static String week1(String str){
        StringBuilder output = new StringBuilder();
        char[] string_chars = str.toCharArray();

        for(int i = 0; i < string_chars.length; i++){
            if(i  < str.length() - 1){

                boolean action_done = false;

                if(string_chars[i] == 'c'){
                    if(string_chars[i+1] == 'i' || string_chars[i+1] == 'I' || string_chars[i+1] == 'e'|| string_chars[i+1] == 'E'){
                        string_chars[i] = 's';
                        action_done = true;
                    }
                }else if(string_chars[i] == 'C'){
                    if(string_chars[i+1] == 'i' || string_chars[i+1] == 'I' || string_chars[i+1] == 'e'|| string_chars[i+1] == 'E'){
                        string_chars[i] = 'S';
                        action_done = true;
                    }
                }

                if(string_chars[i] == 'c' && string_chars[i+1] != 'h' && string_chars[i+1] != 'H' && !action_done){
                        string_chars[i] = 'k';
                }else if(string_chars[i] == 'C' && string_chars[i+1] != 'h' && string_chars[i+1] != 'H' && !action_done){
                        string_chars[i] = 'K';
                }
            }else if(i == str.length() - 1){
                if(string_chars[i] == 'c'){
                    string_chars[i] = 'k';
                }else if(string_chars[i] == 'C'){
                    string_chars[i] = 'K';
                }
            }
        }

        for(char i : string_chars){
            output.append(i);
        }

        return output.toString();
    }

    private static String week2(String str){
        str = week1(str);
        StringBuilder output = new StringBuilder();

        char[] string_chars = str.toCharArray();

        for(int i = 0; i < string_chars.length; i++){
            if(i  < str.length() - 1){

                if(string_chars[i] == 'p'){
                    if(string_chars[i+1] == 'h'){
                        string_chars[i] = 'f';
                    }
                }else if(string_chars[i] == 'P'){
                    if(string_chars[i+1] == 'H'){
                        string_chars[i] = 'F';
                    }
                }
            }
        }

        for(char i : string_chars){
            output.append(i);
        }

        return output.toString();
    }

    private static String week3(String str){
        StringBuilder output = new StringBuilder();
        str = week2(str);

        String[] strsplit = str.split(" ");

        for(int i = 0; i < strsplit.length; i++){
            if(strsplit[i].contains("e")){
                ArrayList<Character> word_split = new ArrayList<>();
                ArrayList<Character> word_split_extras = new ArrayList<>();
                for (int j = 0; j < strsplit[i].length(); j++){
                    if (strsplit[i].charAt(j) >= 97 && strsplit[i].charAt(j) <= 122 || strsplit[i].charAt(j) >= 65 && strsplit[i].charAt(j) <= 90){
                        word_split.add(str.charAt(j));
                    }else {
                        word_split_extras.add(strsplit[i].charAt(j));
                    }
                }

                StringBuilder word = new StringBuilder();

                for(char j : word_split){
                    word.append(j);
                }

                if(word.toString().length() > 2 || word.toString().endsWith("e")){
                    char[] final_split = word.toString().toCharArray();
                    final_split[word.toString().length()-1] = ' ';
                    for(char j : final_split){
                        output.append(j);
                    }

                    for (char j : word_split_extras){
                        output.append(j);
                    }
                }
            }
        }
        return output.toString();
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
