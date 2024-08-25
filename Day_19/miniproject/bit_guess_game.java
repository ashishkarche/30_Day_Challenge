package Day_19.miniproject;

import java.util.Scanner;

public class bit_guess_game {

    public static void bit_operation() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int RandomNumber = (int) (Math.random() * 10);

        int option = 0;
        int BitMask;
        int position;
        int number;
        int result = 0;

        try {
            do {
                System.out.println();
                System.out.println("---- Bit Guess Game ----");
                System.out.println("1. Get Bit (Hint)");
                System.out.println("2. Set Bit");
                System.out.println("3. Clear Bit");
                System.out.println("4. Update Bit");
                System.out.println("5. Give Up");
                System.out.println();
                System.out.print("Enter Choice: ");
                option = sc.nextInt();

                switch (option) {
                    case 1:
                        System.out.println("=== Get Bit Operation ===");
                        System.out.println("Enter Position: ");
                        position = sc.nextInt();
                        BitMask = 1 << position;

                        if ((BitMask & RandomNumber) == 0) {
                            System.out.println("Hint: Number zero is present ");
                        } else {
                            System.out.println("Hint: Number one is present");
                        }

                        break;

                    case 2:
                        System.out.println("=== Set Bit Operation ===");
                        System.out.println("Enter Number: ");
                        number = sc.nextInt();
                        System.out.println("Enter position: ");
                        position = sc.nextInt();
                        BitMask = 1 << position;

                        int OR_operation = BitMask | number;

                        result = OR_operation;
                        System.out.println(OR_operation);

                        if (RandomNumber == result) {
                            break;
                        } else if (RandomNumber < result) {
                            System.out.println("Number is Smaller.");
                        } else {
                            System.out.println("Number is Bigger");
                        }
                        break;

                    case 3:
                        System.out.println("=== Clear Bit Operation ===");
                        System.out.println("Enter Number: ");
                        number = sc.nextInt();
                        System.out.println("Enter Position");
                        position = sc.nextInt();
                        BitMask = 1 << position;

                        int NotBitM = ~(BitMask);
                        int AND_operation = NotBitM & number;
                        result = AND_operation;

                        System.out.println(AND_operation);

                        if (RandomNumber == result) {
                            break;
                        } else if (RandomNumber < result) {
                            System.out.println("Number is Smaller.");
                        } else {
                            System.out.println("Number is Bigger");
                        }
                        break;

                    case 4:
                        System.out.println("=== Update Bit Operation ===");
                        System.out.println("Enter Number: ");
                        number = sc.nextInt();
                        System.out.println("Enter Position");
                        position = sc.nextInt();
                        BitMask = 1 << position;

                        System.out.println("Update Bit 0 or 1: ");
                        int operation = sc.nextInt();
                        if (operation == 1) {
                            System.out.println("Update Bit to " + operation);
                            int OR_operation2 = BitMask | number;
                            result = OR_operation2;
                            System.out.println(OR_operation2);

                            if (RandomNumber == result) {
                                break;
                            } else if (RandomNumber < result) {
                                System.out.println("Number is Smaller.");
                            } else {
                                System.out.println("Number is Bigger");
                            }

                        } else {
                            System.out.println("Update Bit to " + operation);
                            int NotBitMask = ~(BitMask);
                            int AND_operation2 = NotBitMask & number;
                            result = AND_operation2;

                            System.out.println(AND_operation2);
                            if (RandomNumber == result) {
                                break;
                            } else if (RandomNumber < result) {
                                System.out.println("Number is Smaller.");
                            } else {
                                System.out.println("Number is Bigger");
                            }

                        }
                        break;
                    default:
                        System.out.println("System Closed...");
                        break;
                }
                if (RandomNumber == result) {
                    System.out.println("Well Done, You Guess Right: " + result);
                    break;
                }
            } while (option < 4);
        } catch (Exception exception) {
            System.out.println("Error: " + exception + " Input must be integer");
        }

        if (option == 5) {
            System.out.println();
            System.out.println("Oops..!!!, Here is Correct Number: " + RandomNumber);
        }

    }

    public static void main(String[] args) {

        System.out.println("== Made by Ashish ==");
        bit_operation();

    }
}