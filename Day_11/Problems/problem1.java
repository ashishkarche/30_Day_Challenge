package Day_11.Problems;

import java.util.Scanner;

public class problem1 {
    public static void subject_marks(int row, int column) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        // define 2D array
        String[][] sub_mark = new String[row][column];

        // get user input
        for (int i = 0; i < row; i++) {
            // System.out.print("Enter Roll no: ");
            for (int j = 0; j < column; j++) {
                System.out.println("Enter marks [" + i + ", " + j + "]: ");
                sub_mark[i][j] = sc.nextLine();
            }
        }

        // print the array or search array
        System.out.println("search marks");
        String x = sc.nextLine();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                // System.out.print(sub_mark[i][j]);
                if (sub_mark[i][j].equals(x)) {
                    System.out.println(sub_mark[i][j] + " found at index: [" + i + ", " + j + "]");
                }
            }
        }
    }

    public static void main(String[] args) {

        try {
            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter row size: ");
            int row = sc.nextInt();
            System.out.print("Enter column size: ");
            int column = sc.nextInt();

            subject_marks(row, column);
        } catch (Exception exception) {
            System.out.println("Input must be integer..");
        }
    }
}
