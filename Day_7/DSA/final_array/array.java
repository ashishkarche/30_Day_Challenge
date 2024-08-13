// NOTE - PLEASE CHECK array2.java

package Day_7.DSA.final_array;

import java.util.Scanner;

public class array {

    // First Method
    public static void FirstMethod(int array_size) {

        // Scanner sc = new Scanner(System.in);
        int[] Array = new int[array_size];
        // user enter array size 5
        /*
         * then in for loop
         * i < array_size
         * i < 5 ; i++
         * 0 < 5 ; i++
         * Array[0] = 0;
         * 1 < 5 ; i++;
         * Arrat[1] = 1;
         * 
         */

        System.out.println("First Array: ");

        // LEARN THIS AFTER array2.java LEARN.
        // for (int j = 0; j < array_size; j++) { // used to push/add element in array
        // System.out.println("Enter Element " + j + ": ");
        // Array[j] = sc.nextInt();
        // }

        for (int i = 0; i < array_size; i++) {

            // LEARN THIS AFTER array2.java LEARN.
            // System.out.println(array[i]);

            System.out.println(Array[i] = i);
            // if array is empty then it will replace with null value like int: 0, float:
            // 0.0, Boolean: false, string: " "
            // in c++ if array is empty then it print garbage value.
        }
    }

    public static void SecondMethod(int n, int size) {
        try {
            int[] array = new int[size];
            // we set different size for an array,
            // by passing int n arugment we push or print array.

            /*
             * i < n
             * we enter n value 5
             * i < 5
             * array[i] = i;
             * array[0] = 0;
             * array[1] = 1;
             * array[2] = 2;
             * array[3] = 3;
             * array[4] = 4;
             * 
             */

            // array[0] = 1;
            // array[1] = 2;
            // array[2] = 3;
            // array[3] = 4;
            // array[4] = 5;

            // LEARN THIS AFTER array2.java LEARN.
            // for (int j = 0; j < size; j++) { // used to push/add element in array
            // System.out.println("Enter Element " + j + ": ");
            // Array[j] = sc.nextInt();
            // }

            for (int i = 0; i < n; i++) { // used for loop to push element in array
                System.out.println(array[i] = i); // logic like at (array[0] = 0, array[1] = 1, array[2] = 5)
                
                // LEARN THIS AFTER array2.java LEARN.
                // System.out.println(array[i]);
            }
        } catch (Exception exception) {
            System.out.println("Entered element " + n + " bigger then array size " + size);
        }
    }

    public static void main(String[] args) {

        try {
            // Array
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter array Size: ");
            int size = sc.nextInt();

            System.out.print("Push Element in Array: ");
            int element_no = sc.nextInt();

            FirstMethod(size);
            SecondMethod(element_no, size);
        } catch (Exception exception) {
            System.out.println("Enter Wrong Input");
        }
    }

}

// time complexity is O(n).
// in FirstMethod function there is for loop which has time complexity O(n)
// in SecondMethod function there is for loop which has time complexity O(n)
// try - catch block does't affect time complexity
// and for are separated then O(n) + O(n) = O(2n)
// which is O(n)