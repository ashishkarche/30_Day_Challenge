package Day_22.DSA;

import java.util.Scanner;

public class recursion {

    public static void Pnumber(int n) {

        /*
         * 
         * whenever recursion calls happen , calls should be in the form of stack
         * format, (LIFO)
         * 
         * 
         * for loop to print number 5 to 1.
         * 
         * for (int i = 5; i > 0; i--) {
         * System.out.println(i);
         * }
         * 
         * convert this into recursion
         * int i = 5 , int n <== initialize
         * i > 0 , n == 0 <== Base condtion to Break loop/recursion
         * i--: i -1 , n -1 <== condition
         */
        if (n == 0) {
            return; // Base condition
        }
        System.out.print(n + " "); // print number
        Pnumber(n - 1); // recursion condtion

    }

    public static void print_number_1_5(int n) {
        if (n == 6) {
            return;    // Base Conditon
        }

        System.out.print(n + " ");  // Print Number
        print_number_1_5(n + 1);   // Condition
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        Pnumber(number);
        print_number_1_5(number);

        sc.close();

    }
}
