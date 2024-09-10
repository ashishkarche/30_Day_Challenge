package Day_25.DSA;

public class Reclass6 {
    public static int Printlogn(int x, int n) {

        if (n == 0 || x == 0) { // base case
            return 1;
        }

        // if n is even
        if (n % 2 == 0) {
            return Printlogn(x, n / 2) * Printlogn(x, n / 2);
        } else { // if n is odd
            return Printlogn(x, n / 2) * Printlogn(x, n / 2) * x;
        }

    }

    public static void main(String[] args) {
        try {
            int x = 2, n = 5;
            int ans = Printlogn(x, n);
            System.out.println(ans);
        } catch (Exception exception) {
            System.out.println("Error: " + exception);
        }
    }

}
