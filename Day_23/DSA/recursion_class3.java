package Day_23.DSA;

public class recursion_class3 {
    public static void Print_natural_number(int n,int end,int sum) {
        if (n == end) {
            sum += n;
            System.out.println(sum);
            return;
        }
        sum += n;
        Print_natural_number(n + 1,end,sum);

    }

    public static void main(String[] args) {
        Print_natural_number(1,10,0);
    }
}
