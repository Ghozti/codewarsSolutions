package ghozti.codewars.solutions.kyu7;

public class CreditCardMask {

    final int KYU = 7;

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
