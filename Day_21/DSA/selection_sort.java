package Day_21.DSA;

import java.util.Scanner;

public class selection_sort {
    public static void selection(int[] arr) {
        // selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest_ele = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest_ele] > arr[j]) {
                    smallest_ele = j;
                }
            }
            // swap
            int temp = arr[smallest_ele];
            arr[smallest_ele] = arr[i];
            arr[i] = temp;
        }

        // print array
        System.err.println();
        System.err.println();
        System.out.print("Selection Sort: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void selection_sort_2(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int small = i;
            if (arr[i] > arr[i + 1]) {
                small = i;
            }
            int temp = arr[i];
            arr[i] = arr[small];
            arr[small] = temp;
        }

        System.out.println();
        System.out.print("Selection Sort: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter array size: ");
            int size = sc.nextInt();

            int[] arr = new int[size];

            for (int i = 0; i < arr.length; i++) {
                System.out.println("Enter element: ");
                int n = sc.nextInt();
                arr[i] = n;
            }

            System.out.print("Befor sorting:");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
            System.out.print("After Sorting: ");
            selection(arr);
            selection_sort_2(arr);
        } catch (Exception exception) {
            System.out.println("Error:" + exception + ", input must be intger.");
        }
    }

}
