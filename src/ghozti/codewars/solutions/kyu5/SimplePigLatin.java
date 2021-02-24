package ghozti.codewars.solutions.kyu5;

public class SimplePigLatin {

    final int KYU = 5;

    /**
     * this method will:
     * separate str into a string array containing each word, space and punctuation mark
     * it will loop through that array and check if the current element is blank if so it will do nothing
     * it will then check if the next element contains ? ! , . if so it will also do nothing
     * else it will make a substring of the current element starting at index 1 and ending at the element's length
     * then take the first char and add it to the substring then add "ay"
     * at last it will put the array elements into a string
     */

    public static String pigIt(String str) {
        String[] arr = str.split("(?<=\\b|[^\\p{L}])");

        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].isBlank()){
                if (arr[i].contains("!") || arr[i].contains(".") || arr[i].contains(",") || arr[i].contains("?")){
                    arr[i] = arr[i];
                }else {
                    arr[i] = arr[i].substring(1) + arr[i].charAt(0) + "ay";
                }
            }
        }

        StringBuilder pigL = new StringBuilder();

        for (String i : arr){
            pigL.append(i);
        }

        return pigL.toString();
    }
}
