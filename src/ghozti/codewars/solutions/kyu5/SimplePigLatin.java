package ghozti.codewars.solutions.kyu5;

public class SimplePigLatin {
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
