package Minproject.calculator;

import java.util.Scanner;

public class calculator {

    public static void operation(String operations, int num1, int num2) {

        switch (operations) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
            case "%":
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("This Operation is Not supported");
                break;
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println("==== Calculator ====");

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Number_1: ");
            int num1 = sc.nextInt();

            System.out.print("Enter Operation: ");
            String operations = sc.next();

            System.out.print("Enter number_2: ");
            int num2 = sc.nextInt();

            System.out.print(num1 + " " + operations + " " + num2 + " Result: ");
            operation(operations, num1, num2);
        } catch (Exception exception) {
            System.out.println("Warning..!!");
            System.out.println("You Enter Wrong Number / operations / MisMatchInput");
        }
    }
}