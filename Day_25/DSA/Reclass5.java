package Day_25.DSA;

public class Reclass5 {
    // stack height = n
    public static int Print(int x, int n) {

        if (n == 0 || x == 0) {
            return 1;
        }
        int power = Print(x, n - 1);
        int mul = x * power;
        return mul;

    }

    public static void main(String[] args) {
        int x = 2, n = 5;
        int ans = Print(x, n);
        System.out.println(ans);
    }
}
