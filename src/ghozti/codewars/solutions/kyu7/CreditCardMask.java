package ghozti.codewars.solutions.kyu7;

public class CreditCardMask {

    final int KYU = 7;

    /**
     * THIS METHOD:
     * checks to see if the string's length is greater than 4 (since we need to mask all but 4 of the characters)
     * creates 2 strings (masked and non masked)
     * loops through the string except the last 4 characters
     * and appends (masked) with '#'
     * then creates a substring starting from the length of str -4 to it's length (so we get the last 4 characters)
     * then updates (str) to be masked + nonMasked
     */

    public static String maskify(String str){
        if (str.length() > 4){
            String nonMasked;
            StringBuilder masked = new StringBuilder();

            for (int i = 0; i < str.length() - 4; i++) {
                masked.append('#');
            }

            nonMasked = str.substring(str.length()-4);
            str = masked + nonMasked;
        }
        return str;
    }
}
