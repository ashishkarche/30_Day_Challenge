package Day_22.DSA;

import java.util.InputMismatchException;
import java.util.Scanner;

public class practice {

    public static void recursion_(int[] arr) {
        // Recursion

        // Bubble Sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // Time Complexity - O(n^2)
        System.out.println();
        System.out.print("After Sorting: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        return;
    }

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Array Size: ");
            int size = sc.nextInt();
            System.out.println();
            int[] array = new int[size];

            for (int i = 0; i < array.length; i++) {
                System.out.print("Push element: ");
                int element = sc.nextInt();
                array[i] = element;
            }

            System.out.println();
            System.out.print("Before Sorting: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }

            recursion_(array);

            sc.close();
        } catch (InputMismatchException exception) {
            System.out.println("Error: " + exception + ", Input must be intger.");
        }
    }
}
