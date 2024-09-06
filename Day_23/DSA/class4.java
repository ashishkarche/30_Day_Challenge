package Day_23.DSA;

public class class4 {
    public static int print_factorial(int i) {
        if (i == 1 || i == 0) {
            return 1;
        }
        int fact = print_factorial(i - 1);
        int fact_n = i * fact;
        return fact_n;
        
    }

    public static void main(String[] args) {
        int ans = print_factorial(5);
        System.out.println(ans);
    }
}
