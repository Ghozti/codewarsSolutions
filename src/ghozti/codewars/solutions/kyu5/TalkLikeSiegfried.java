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

        String[] str_split = str.split(" ");

        for(String i : str_split){
            if((i.endsWith("e") || i.endsWith("E")) && i.length() > 3){
                output.append(i.substring(0,i.length()-1));
                output.append(" ");
            } else if((i.contains("e") || i.contains("E") && i.contains("-")) && i.length() > 3){
                i = i.replace("-","&-");
                String[] string_sub = i.split("-");
                for(String j : string_sub){
                    System.out.println(j);
                    if ((j.endsWith("e") || j.endsWith("E")) && j.length() > 3){
                        j = j.substring(0,j.length()-1);
                        output.append(j);
                        output.append(" ");
                    }else if ((j.endsWith("&")) && j.length() > 3){
                        if (j.substring(0,j.length()-1).endsWith("e") || j.substring(0,j.length()-1).endsWith("E")){
                            output.append(j.substring(0,j.length()-2));
                            output.append("-");
                        }
                    }else{
                        output.append(j);
                        output.append(" ");
                    }
                }
            } else {
                output.append(i);
                output.append(" ");
            }
        }

        String output_tostr = output.toString();

        output_tostr = output.toString().replace("aa","a").replace("bb","b").replace("cc","c")
                .replace("dd","d").replace("ee","e").replace("ff","f").replace("gg","g")
                .replace("hh","h").replace("ii","i").replace("jj","j").replace("kk","k")
                .replace("ll","l").replace("mm","m").replace("nn","n").replace("oo","o")
                .replace("pp","p").replace("qq","q").replace("rr","r").replace("ss","s")
                .replace("tt","t").replace("uu","u").replace("vv","v").replace("ww","w")
                .replace("xx","x").replace("yy","y").replace("zz","z");
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
            }else if(str_split[i].startsWith("Sm")){
                str_split[i] = str_split[i].replace("Sm","Schm");
            }else if(str_split[i].startsWith("SM")){
                str_split[i] = str_split[i].replace("SM","SCHM");
            }
        }

        for(String i : str_split){
            output.append(i);
            output.append(" ");
        }

        return output.toString().trim();
    }
}
