package Day_21.DSA;

import java.util.Scanner;

public class insertion {
    public static void insertion_sort(int[] arr){

        // insertion sort 

        // sorted part
        for(int i = 1; i < arr.length;i++){

            int current = arr[i];
            int j = i-1; // unsorted part
            while (j>=0 && current<arr[j]) { // j>= 0 means index number is greater then 0.
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = current; // place at sorted part
        }

        System.out.print("Inseration sort: ");
        for(int i = 0; i< arr.length;i++){
            System.out.print(+arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        for(int i = 0; i< arr.length;i++){
            System.out.println("Push Element: ");
            int n = sc.nextInt();
            arr[i] = n;
        }
        sc.close();

        insertion_sort(arr);
    }
}
