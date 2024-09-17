package Day_26.DSA;

import java.util.Scanner;

public class class7 {

    public static void array_print(int[] arr) {
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter Element: ");
            int n = sc.nextInt();
            arr[i]=n;
            
        }

        for(int i = 0 ; i < arr.length;i++){
            System.out.println(arr[i]);
        }

        sc.close();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Array Size: ");
        int size = sc.nextInt();
        int[] arrayN = new int[size];

        array_print(arrayN);
        sc.close();

    }
}