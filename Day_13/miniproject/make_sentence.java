package Day_13.miniproject;

import java.util.Scanner;

public class make_sentence {
    public static void operations(String chr) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(chr);

        System.out.println("Entered character: " + sb);

        int option;

        try {
            do {
                System.out.println();
                System.out.println("===== Perform operation(options) =====");
                System.out.println();
                System.out.println("1. Replace Character");
                System.out.println("2. Add sign/symbol");
                System.out.println("3. Insert character");
                System.out.println("4. Delete character(Range at index 0 to 2)");
                System.out.println("5. Quit");
                System.out.println();

                System.out.print("Enter option Number: ");

                option = sc.nextInt();

                switch (option) {
                    case 1:
                        System.out.println("Replaced character");
                        System.out.print("Enter index no: ");
                        int index_no = sc.nextInt();
                        sb.setCharAt(index_no, 'A');
                        System.out.println("Result: " + sb);
                        break;

                    case 2:
                        System.out.println("Append sybmol/sign");
                        System.out.print("enter character: ");
                        String append_chr = sc.next();
                        sb.append(append_chr);
                        System.out.println("Result: " + sb);
                        break;
                    case 3:
                        System.out.println("Insert charatcer");
                        System.out.print("Enter index no: ");
                        int insert_no = sc.nextInt();
                        System.out.println("Insert character: ");
                        String insert_chr = sc.next();
                        sb.insert(insert_no, insert_chr);
                        System.out.println("Result: " + sb);
                        break;

                    case 4:
                        System.out.println("Delete character");
                        System.out.print("Enter starting range no: ");
                        int start_no = sc.nextInt();
                        System.out.print("Enter ending range no: ");
                        int end_no = sc.nextInt();
                        sb.delete(start_no, end_no);
                        System.out.println("Result: " + sb);
                        break;

                    default:
                        System.out.println("Option not supported..");
                        break;
                }
            } while (option <= 4);
        } catch (Exception exception) {
            System.out.println("Index Number must be Integer..");
            System.out.println("System Closed..");
        }
    }

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter character: ");
        String chr = sc.nextLine();

        operations(chr);
    }
}

// time complexity is O(n)
// take n no.of user input