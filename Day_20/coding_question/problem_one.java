package Day_20.coding_question;

import java.util.Scanner;

public class problem_one {

    private static void odd_even_operation(int userInput) {

        if (userInput % 2 == 1) {
            System.out.println("odd");
        } else {
            System.out.println("even");
        }

    }

    public static void main(String[] args) {
        // if Number is even print even, and number is odd print odd

        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Number: ");
            int number = sc.nextInt();
            sc.close();

            odd_even_operation(number);
        } catch (Exception exception) {
            System.out.println("Error: " + exception + ", Input Must Int.");
        }

    }
}