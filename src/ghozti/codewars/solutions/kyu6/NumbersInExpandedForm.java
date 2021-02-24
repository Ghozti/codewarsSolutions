package ghozti.codewars.solutions.kyu6;

public class NumbersInExpandedForm {
    public static String expandedForm(int num) {
        //42 -> 40 + 2
        String expandedForm = "";

        for (int i = 0; i < Integer.toString(num).length(); i++) {
            if (Integer.toString(num).charAt(i) != '0'){
                expandedForm += Integer.toString(num).charAt(i);
                for (int j = (i + 1); j < Integer.toString(num).length(); j++) {
                    expandedForm += "0";
                }

                expandedForm += " + ";
            }
        }

        return expandedForm.substring(0,expandedForm.length()-3);
    }
}
