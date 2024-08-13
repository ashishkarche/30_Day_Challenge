package Day_7.DSA.final_array;

import java.util.Scanner;

public class array2 {

    public static void printArray(int size) {
        Scanner sc = new Scanner(System.in);

        int number[] = new int[size];
        // j < number.length is same as j < size

        for (int i = 0; i < number.length; i++) { // used to push/add element in array unless condition true/false .
            System.out.println("Enter Element: ");
            number[i] = sc.nextInt();
        }
        /*
         * if user array size 5 then,
         * user enter values unless condition is meet.
         * it store first at number[index] = value
         * i < 5
         * 
         * number[0] = 1; // user enter this value in cmd
         * number[1] = 2;
         * number[2] = 4;
         * number[3] = 5;
         * number[4] = 6;
         * 
         */
        for (int j = 0; j < number.length; j++) {
            System.out.println(number[j]); // Used to print array
        }

    }

    public static void main(String[] args) {

        try {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter array size: ");
            int size = sc.nextInt();

            printArray(size);
        } catch (Exception exception) { // Used to privent string input
            System.out.println("Input must be integer");
        }
    }
}


// time complexity is O(n)