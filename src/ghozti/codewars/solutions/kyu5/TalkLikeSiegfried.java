package ghozti.codewars.solutions.kyu5;

import java.util.ArrayList;

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

        return output.replace("  "," ");
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

        return output.toString().trim();
    }

    private static String week2(String str){
        str = week1(str);

        str = str.replace("ph","f");

        str = str.replace("PH","F");

        return str.trim();
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
                        word_split.add(strsplit[i].charAt(j));
                    }else {
                        word_split_extras.add(strsplit[i].charAt(j));
                    }
                }
                StringBuilder word = new StringBuilder();

                for(char j : word_split){
                    word.append(j);
                }

                if(word.toString().length() > 3 && word.toString().endsWith("e")){
                    ArrayList<Character> word_str = new ArrayList<>();
                    char[] final_split = word.toString().toCharArray();
                    final_split[word.toString().length()-1] = ' ';
                    for(char j : final_split){
                        word_str.add(j);
                    }

                    for (char j : word_split_extras){
                        word_str.add(j);
                    }

                    String final_str = "";

                    for(char j : word_str){
                        final_str += j;
                    }

                    strsplit[i] = final_str.replace(" ","");
                }
            }
        }

        for(String i : strsplit){
            output.append(i);
            output.append(" ");
        }

        String output_tostr = output.toString();

        output_tostr = output.toString().replace("aa","a").replace("bb","b").replace("cc","c")
                .replace("dd","d").replace("ee","e").replace("ff","f").replace("gg","g")
                .replace("hh","h").replace("ii","i").replace("jj","j").replace("kk","k")
                .replace("ll","l").replace("mm","m").replace("nn","n").replace("oo","o")
                .replace("pp","p").replace("qq","q").replace("rr","r").replace("ss","s")
                .replace("tt","t").replace("uu","u").replace("vv","v").replace("ww","w")
                .replace("xx","x").replace("yy","y").replace("zz","z");
/*
        output_tostr = output.toString().replace("aa".toUpperCase(),"a".toUpperCase()).replace("bb".toUpperCase(),"b".toUpperCase()).replace("cc".toUpperCase(),"c".toUpperCase())
                .replace("dd".toUpperCase(),"d".toUpperCase()).replace("ee".toUpperCase(),"e".toUpperCase()).replace("ff".toUpperCase(),"f".toUpperCase()).replace("gg".toUpperCase(),"g".toUpperCase())
                .replace("hh".toUpperCase(),"h".toUpperCase()).replace("ii".toUpperCase(),"i".toUpperCase()).replace("jj".toUpperCase(),"j".toUpperCase()).replace("kk".toUpperCase(),"k".toUpperCase())
                .replace("ll".toUpperCase(),"l".toUpperCase()).replace("mm".toUpperCase(),"m".toUpperCase()).replace("nn".toUpperCase(),"n".toUpperCase()).replace("oo".toUpperCase(),"o".toUpperCase())
                .replace("pp".toUpperCase(),"p".toUpperCase()).replace("qq".toUpperCase(),"q".toUpperCase()).replace("rr".toUpperCase(),"r".toUpperCase()).replace("ss".toUpperCase(),"s".toUpperCase())
                .replace("tt".toUpperCase(),"t".toUpperCase()).replace("uu".toUpperCase(),"u".toUpperCase()).replace("vv".toUpperCase(),"v".toUpperCase()).replace("ww".toUpperCase(),"w".toUpperCase())
                .replace("xx".toUpperCase(),"x".toUpperCase()).replace("yy".toUpperCase(),"y".toUpperCase()).replace("zz".toUpperCase(),"z".toUpperCase());


 */
        return output_tostr.trim();
    }

    private static String week4(String str){
        String output = "";
        str = week3(str);
        return str.replace("th","z").replace("wr","r").replace("wh","v").replace("w","v")
                .replace("TH","Z").replace("WR","R").replace("WH","V").replace("W","V");
    }

    private static String week5(String str){
        StringBuilder output = new StringBuilder();
        str = week4(str).replace("ou","u").replace("an","un");

        String[] str_split = str.split(" ");

        for(int i = 0; i < str_split.length; i++){
            if(str_split[i].endsWith("ing")){
                str_split[i] = str_split[i].replace("ing","ink");
            }else if(str_split[i].endsWith("ING")){
                str_split[i] = str_split[i].replace("ING","INK");
            }

            if(str_split[i].startsWith("sm")){
                str_split[i] = str_split[i].replace("sm","schm");
            }else if(str_split[i].startsWith("SM")){
                str_split[i] = str_split[i].replace("ING","SCHM");
            }
        }

        for(String i : str_split){
            output.append(i);
            output.append(" ");
        }

        return output.toString().trim();
    }
}
