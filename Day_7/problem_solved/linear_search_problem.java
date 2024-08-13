package Day_7.problem_solved;

import java.util.Scanner;

public class linear_search_problem {
    // take an array as input fromthe user. search for a given x and print the index
    // at which it occurs.

    // linear search means it goes or search in straight pattern.
    public static void CreateArray(int size) {
        // take an array as input
        Scanner sc = new Scanner(System.in);
        
        int[] number = new int[size];

        // j < number.length is same as j < size

        for (int i = 0; i < number.length; i++) {
            System.out.print("Enter Element " + i + ": ");
            number[i] = sc.nextInt();
        }
        System.out.println();

        //linear search
        System.out.print("Search Number: ");
        int x = sc.nextInt();

        // Search array
        for (int j = 0; j < number.length; j++) {
            if (number[j] == x) { // check on every index if x is equal to/matched. if x is match at user input
                                  // then print.
                System.out.print(x + " is Found at index: " + j);
            }
        }
    }

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Array Size: ");
            int size = sc.nextInt();

            CreateArray(size);
        } catch (Exception exception) {
            System.out.println("Input must be Intger");
        }
    }
}


// time complexity is O(n)