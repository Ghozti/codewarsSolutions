package ghozti.codewars.solutions.kyu6;

public class WhoLikesIt{

    final int KYU = 6;

    /**
     *THIS METHOD:
     * will check if the array "names" has a length of 0
     * if so then it will return "no one likes this"
     * if the length is 1 then it will return the name and "likes this"
     * if the length is 2 or 3 it returns the names and "like this"
     * if the length is more than 3 it returns 2 names then the length of the array minus 2 (because they are already displayed) plus "like this"
     */

    public static String whoLikesIt(String... names) {
        if(names.length == 0) return "no one likes this";

        if(names.length == 1) return names[0] + " likes this";
        else if(names.length == 2) return names[0] + " and " + names[1] + " like this";
        else if(names.length == 3) return names[0] + ", " + names[1] + " and " + names[2] + " like this";
        return names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
    }
}
