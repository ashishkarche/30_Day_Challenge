package Day_3.miniproject;

import java.util.Scanner;

public class Guess_number {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 100);
        Scanner sc = new Scanner(System.in);
        int userInput;
        try {
            do {
                System.out.println("To Quit Game Enter: -1");
                System.out.print("Guess the number - ");

                userInput = sc.nextInt();
                if (randomNumber == userInput) {
                    System.out.println("WOOHO,  Guess Is Correct...");
                    break;
                } else if (randomNumber > userInput) {
                    System.out.println("Number Is Bigger");
                } else {
                    System.out.println("Number Is Smaller");
                }

            } while (userInput >= 0);
            System.out.println("My Number was " + randomNumber);
        } catch (Exception exception) {
            System.out.println("error occur..");
        }
    }
}
