package Day_24.DSA;

/**
 * practice
 */
public class practice {

    public static int printfact(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int factn = printfact(n - 1);
        int fact = n * factn;
        return fact;

    }

    public static void main(String[] args) {

        int n = 5;
        int fact = printfact(n);
        System.out.println(fact);
    }
}