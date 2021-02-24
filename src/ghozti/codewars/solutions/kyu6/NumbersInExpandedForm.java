package ghozti.codewars.solutions.kyu6;

public class NumbersInExpandedForm {

    final int KYU = 6;

    /**
     *THIS METHOD:
     * will turn the (num) parameter to a string
     * then it iterates through the elements of the string
     * it checks to see if the char at value is 0 if so it will skip this character
     * else it will take that character and add it to the "expandedForm" string
     * then it will add "0" until i + 1 is equals to the size of the string
     * then it will add " + "
     * this will repeat until the loop has iterated through every element
     * finally it will return expandedForm minus the last 3 characters since they are an unnecessary " + "
     */
    public static String expandedForm(int num) {
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
