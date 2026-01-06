public class PossiblePair {
    public static void main(String[] args) {
        int[] a = {12,34,54,78,9};
        int n = a.length;

        System.out.println("All possible pairs are:");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.println("(" + a[i] + ", " + a[j] + ")");
            }
        }
    }
}
