package Day_25.DSA;

public class recursion_class4 {
    // Recursion
    public static void Print_fibo(int a, int b, int n) {
        int c = a + b;
        if (n == 0) {
            return;
        }

        System.out.println(c);
        Print_fibo(b, c, n - 1);
    }

    // iteration/loop
    public static void num() {
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }

    }

    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        Print_fibo(a, b, n - 2);
        num();
    }
}
