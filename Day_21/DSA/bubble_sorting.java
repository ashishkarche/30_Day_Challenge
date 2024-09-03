package Day_21.DSA;

import java.util.Scanner;

public class bubble_sorting {

    public static void bubble_sort(int[] array) {
        // Array - 78312

        // int[] arr = {7,8,3,1,2};

        // bubble sort
        // time complexity = O(n^2)
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) { //
                if (array[j] > array[j + 1]) {
                    // swap
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }
            }

        }

        System.out.println();
        System.out.print("Bubble Sort: ");
        // print array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

    public static void bubble_sort_2(int[] array) {

        // Bubble Sort
        // Time Complexity O(n)
        for (int i = 0; i < array.length - 1; i++) {

            // swap
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }

        System.out.println();
        System.out.print("Bubble Sort: ");
        for (int j = 0; j < array.length; j++)
            System.out.print(array[j] + " ");
    }


    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Array Size: ");
            int size = sc.nextInt();
            int[] arr = new int[size];

            for (int i = 0; i < arr.length; i++) {
                System.out.println("Enter element: ");
                int n = sc.nextInt();
                arr[i] = n;
            }

            System.out.print("Before Sorting: ");
            for (int k = 0; k < arr.length; k++)
                System.out.print(arr[k] + " ");
            sc.close();

            System.out.println();
            System.out.print("After Sorting: ");
            bubble_sort(arr);
            bubble_sort_2(arr);
        } catch (Exception exception) {
            System.out.println("Error: " + exception + ", Input must be string.");
        }

    }

}

// bubble sort time complexity = O(n^2)