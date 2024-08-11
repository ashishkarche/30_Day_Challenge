package Day_5.DSA.Basics_of_time_complexity;

import java.util.Scanner;

public class Tcomplexity {
    public static void main(String[] args) {
        // Time complexity

        // this code time complexity is N
        /*
         * time complexity is depend on input size N
         * so we can say - time complexity X input size(N)
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("Print pattern ");
        System.out.print("Enter No: ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // if there us nested loop that has same input variable
        // then time complexity is O(n^2)
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // if there us nested loop that has differmt input variable
        // then time complexity is O(n*m)
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // if loops are separates with same variable then time complexity is O(2n)
        for (int i = 1; i <= n; i++) {
            System.out.println("hi");
        }
        for (int i = 1; i <= n; i++) {
            System.out.println("hi");
        }
        // if loops are separates with different variable then time complexity is O(n+m)
        for (int i = 1; i <= n; i++) {
            System.out.println("hi");
        }
        for (int i = 1; i <= n; i++) {
            System.out.println("hi");
        }
    }
}
