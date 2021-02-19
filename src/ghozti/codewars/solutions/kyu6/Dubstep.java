package ghozti.codewars.solutions.kyu6;

import java.util.ArrayList;

public class Dubstep {

    final int KYU = 6;

    /**
     *THIS METHOD:
     * will take a string with WUB in between characters such as "STARWUBWUBWUBWUBWUBWARSWUB"
     * then it will replace all WUB with " " so it ends up being "STAR     WARS "
     * then it trims the string so it's "STAR     WARS"
     * then it replaces all " " with "1" so it's "STAR11111WARS"
     * then it replaces all "11" with "1" so it's "STAR111WARS" (does this twice)
     * then it replaces all "1" with " " so it's "STAR  WARS"
     * then the while loop will repetitively do this until the string has no extra white spaces. (without the while loop the string would end up being "STAR  WARS" and not "STAR WARS"
     */

    public static String SongDecoder (String song){
        String ssong;
        song = song.replaceAll("WUB"," ").trim().replaceAll(" ","1").replaceAll("11","1").replaceAll("11","1").replaceAll("1"," ");
        while (true){
            ssong = song.replaceAll("WUB"," ").trim().replaceAll(" ","1").replaceAll("11","1").replaceAll("11","1").replaceAll("1"," ");
            if (!ssong.equals(song)){
                break;
            }
        }
        return ssong;
    }
}