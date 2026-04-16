import java.util.*;

class ColorfulNumber {

    static int isColorful(int A) {
        String num = String.valueOf(A);
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < num.length(); i++) {
            int product = 1;

            for (int j = i; j < num.length(); j++) {
                product *= (num.charAt(j) - '0');

                if (set.contains(product)) {
                    return 0;
                }
                set.add(product);
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isColorful(23)); // Output: 1
    }
}