
import java.util.Scanner;

public class Right_Half_Pyramid_Pattern {

    public static void Print_Pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Right Half Pyramid Pattern
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Right Half Pyramid Pattern ---");
        System.out.print("Enter Number of Layers: ");
        int n = sc.nextInt();

        Print_Pattern(n);
    }
}