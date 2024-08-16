package Day_10.DSA;

import java.util.Scanner;

public class string {

    public static void String_Practice(int size) {
        // String is used to defined text, word, number , operator(+,-,*).
        // denoted by ['',""]
        // no need to use try-catch block
        // try {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String[] name = new String[size];

        for (int i = 0; i < name.length; i++) { // Get user input from user
            System.out.print("Enter names: ");
            name[i] = sc.nextLine();
        }

        // Search name (Linear Search)
        System.out.print("Search name: ");
        String x = sc.nextLine();

        // NOTE - CAN'T FIND / SEARCH strings, when we use operators like (==)
        for (int j = 0; j < name.length; j++) {
            if (name[j].equals(x)) { // Use equals() method to compare strings.
                System.out.println("Name is found at index: " + j);
            }
        }

        for (int i = 0; i < name.length; i++) { // print array
            System.out.println(name[i]);
        }

        // } catch (Exception exception) {
        // System.out.println("Input must be String or character..");
        // }

    }

    // Driver function
    public static void main(String[] args) {
        try {
            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter array size: ");
            int size = sc.nextInt();

            String_Practice(size);
        } catch (Exception exception) {
            System.out.println("Input must be String or character.");
        }
    }
}

// time complexity is O(n)
// for loop get user input and print which is "n".