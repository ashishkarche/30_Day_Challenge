package Day_9.Problem_solved;

import java.util.Scanner;

public class Matrix {

    public static void question1(int row, int column) {
        /*
         * Take a matrix as input from the user.
         * search for a given number X and print,
         * the indices at which it occurs.
         */

        try {
            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in);

            int[][] number = new int[row][column];

            // Take an input from user.
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    System.out.print("Enter element at index [" + i + ", " + j + "]: ");
                    number[i][j] = sc.nextInt();
                }
            }

            // Search for a given number X and print the indices
            // at whic it occurs
            System.out.println("Search Given number X: ");
            int x = sc.nextInt();

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    if (number[i][j] == x) {
                        System.out.println("Number " + x + " found at index: [" + i + ", " + j + "]");
                    }
                }
            }
        } catch (Exception exception) {
            System.out.println("Input must be Integer.");
        }
    }

    public static void main(String[] args) {

        try {
            // Take input from user
            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Array Row Size: ");
            int row = sc.nextInt();
            System.out.print("Enter Array Column Size: ");
            int column = sc.nextInt();

            // function/method called
            question1(row, column);
        } catch (Exception exception) {
            System.out.println("Input must be Integer");
        }
    }
}
