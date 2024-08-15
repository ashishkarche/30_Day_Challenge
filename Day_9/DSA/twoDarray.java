package Day_9.DSA;

import java.util.Scanner;

public class twoDarray {

    public static void Twoarray(int row, int column) {

        try {
            Scanner sc = new Scanner(System.in);

            // type[][] Arrayname = new type[row][columns]
            int[][] name = new int[row][column];

            // push/add element in 2D array.
            for (int i = 0; i < row; i++) {

                for (int j = 0; j < column; j++) {
                    // if row[i] 3 * column[j] 4"
                    /*
                     * i = 0 : j =1,2,3,4 : loop Break (j < column).
                     * i = 1 : j =1,2,3,4 : loop Break (j < column).
                     * i = 2 : j =1,2,3,4 : loop Break (j < column).
                     * loop break (i < row)
                     */
                    System.out.print("Enter Element at index " + i + " " + j + ": ");
                    name[i][j] = sc.nextInt();
                }
            }

            System.out.println("Search Number: ");
            int x = sc.nextInt();

            // Linear Search (Search number at index row[i]*column[j])
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    // System.out.println(name[i][j]);
                    if (name[i][j] == x) {
                        System.out.println("Number found at index: " + i + " " + j);
                    }
                }
            }
        } catch (Exception exception) {
            System.out.println("Input must be Intger...");
        }

    }

    // Driver function
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter no.row: ");
            int row = sc.nextInt();
            System.out.print("Enter no.column: ");
            int column = sc.nextInt();

            Twoarray(row, column);
        } catch (Exception exception) {
            System.out.println("Input must be integer.");
        }
    }
}

// time complexity is O(row*column) means O(n*m)
// bcz there are two input.