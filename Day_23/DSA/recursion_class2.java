package Day_23.DSA;

import java.util.Scanner;

import Day_6.DSA.array;

public class recursion_class2 {

    public static void print_number(int num) {
        if (num == 0) {
            return;
        }
        System.out.println(num + " ");

        print_number(num - 1);
    }

    public static void array_print(int[] arr) {
        // int i =0;
        // i++;
        // if (i<arr.length) {
        // return;
        // }

        // System.out.println(arr[i]);
        // array_print(arr);

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Push Number: ");
            int n = sc.nextInt();
            System.out.println(arr[i] = n);

        }
        sc.close();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] = i);
        }
    }

    public static void main(String[] args) {

        int n = 5;
        int[] arr = new int[3];
        print_number(n);
        array_print(arr);
    }
}