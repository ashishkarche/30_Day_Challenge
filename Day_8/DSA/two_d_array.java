package Day_8.DSA;

import java.util.Scanner;

public class two_d_array {

    // public static void TwoArrayD(int size) {
    // // 2D Array
    // // if we have to find How much 2D array take memory space ,
    // // Equation is (Rows * column) * data_type_size.
    // try {

    // int[][] number = new int[size][size];

    // @SuppressWarnings("resource")
    // Scanner sc = new Scanner(System.in);

    // for (int i = 0; i < number.length; i++) {
    // for (int j = 0; j < i; j++) {
    // System.out.println("Enter Element");
    // number[i][j] = sc.nextInt();
    // }
    // }
    // System.out.println("Search number: ");
    // int x = sc.nextInt();

    // for (int i = 0; i < number.length; i++) {
    // for (int j = 0; j < i; j++) {
    // // System.out.println(number[i][j]);
    // if (number[i][j] == x) {
    // System.out.println("Number found at index: " + i + " " + j);
    // }
    // }
    // }

    // } catch (Exception exception) {
    // System.out.println("Input must be integer....");
    // }

    // }

    public static void main(String[] args) {

        // try {
        // @SuppressWarnings("resource")

        // Scanner sc = new Scanner(System.in);F

        // System.out.print("Enter size: ");
        // int size = sc.nextInt();

        int[][] number = { { 1 }, { 2 } };
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number.length; j++) {
                System.out.println(number[i][j]); // error occurs
            }
        }
        
        // TwoArrayD(size);
        // } catch (Exception exception) {
        // System.out.println("Input must be integer");
        // }
    }
}