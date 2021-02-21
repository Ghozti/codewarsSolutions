package ghozti.codewars.solutions.kyu6;

public class PersistentBugger {

    final int KYU = 6;

    public static int persistence(long n) {
        long[] arr = new long[Integer.valueOf((int) (n + "".length()))];
        int x = 0;

        for (int i = 0; i < (n + "".length()); i++) {
            arr[i] = Long.valueOf(n + "".charAt(i));
        }

        for (int i = 0; i < arr.length; i++) {

        }
        return x;
    }
}
