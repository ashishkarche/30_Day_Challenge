package Day_12.DSA;

import java.util.Scanner;

public class string_builder {

    public static void string_builder_p1(String charac) {
        // string Builder
        /*
         * string in java are immutable .
         */

        Scanner sc = new Scanner(System.in);
        StringBuilder name = new StringBuilder(charac);

        System.out.println(name);

        try {
            System.out.print("Find alphatbet/word: ");
            System.out.println("PLease enter index number: ");

            int x = sc.nextInt();

            System.out.println(name.charAt(x)); // 1. print character if we enter index number.
            System.out.println(name);

            System.out.println("replace character...");
            System.out.print("Enter index no: ");
            int y = sc.nextInt();

            name.setCharAt(y, 'a'); // 2. replace character at specific index.
            System.out.println(name);

            System.out.println("insert character...");
            System.out.print("Enter index number:");
            int z = sc.nextInt();

            name.insert(z, 'A'); // 3. insert character at specific index.

            System.out.println(name);

            System.out.println("Delete charater...");
            System.out.println("Enter starting index no: ");
            int d = sc.nextInt();
            System.out.println("Enter ending index no:");
            int e = sc.nextInt();

            name.delete(d, e); // 4. delete character from starting index to ending index.
            // example = 0 to 3, 2 to 4, 0 to 1....
            // meaning it will go 0,1,2 not at 3 index.
            // meaning it will go 2,3 not at 4 index.

            System.out.println(name);

            System.out.println("Appeand another word...");
            System.out.println("Enter character: ");
            String t = sc.next();

            name.append(t); // append / add character at the end of the string.

            System.out.println(name);
        } catch (Exception exception) {
            System.out.println("input must be intger");
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any character: ");
        String charac = sc.nextLine();

        string_builder_p1(charac);
    }
}