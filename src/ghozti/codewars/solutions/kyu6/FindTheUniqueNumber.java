package ghozti.codewars.solutions.kyu6;

public class FindTheUniqueNumber {

    final int KYU = 6;

    /**
     * THIS METHOD:
     * will create a compare number variable which will be the non unique number
     * loop through the doubles in the array and compare the number at index i-1 and i
     * if they are the same then the compare variable will be assigned this value
     * then the second loop will loop through the numbers again and compare the index at i with the compare variable
     * if the number does not equal to "compare" then it will return that number
     */

    public static double findUniq(double arr[]) {
        double compare = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] == arr[i]){
                compare = arr[i-1];
                break;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != compare){
                return arr[i];
            }
        }
        return 0;
    }
}
