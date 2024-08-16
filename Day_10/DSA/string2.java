package Day_10.DSA;

import java.util.Scanner;

public class string2 {

    public static void String_Practice2(String name, String surname) {
        // String function 1
        // concatenation is used to add / sum the 2,3,... strings.
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String space = " ";

        System.out.println("Your name is " + name);
        System.out.println("concatenation=> " + name + space + surname);

        // function 2
        // length is used to calculate length of any given string.
        System.out.println("Length=> " + name.length());

        // function 3
        // charAt is used to print one word from string

        for (int i = 0; i < surname.length(); i++)
            System.out.println("charAt=> " + space + surname.charAt(i));

        // function 4
        // compare string is used to check if string are equal are not.
        // if string 1 is greate4 > then string 2 . print +ve value.
        // if string 1 is LESS < then string 2 . print -ve value.
        // if string 1 is EQUAL == TO string 2 . print 0(NULL) value.
        // if compare word/alphabets, then A has small value compare to B.
        // then they get bigger value when it comes to A to Z.
        // A > B > C >...>Z

        if (name.compareTo(surname) == 0) {
            System.out.println("String are equal. ");
            System.out.println("Name already exist");
            System.out.print("Enter name again: ");
            name = sc.nextLine();
        } else {
            System.out.println("String are not equal.");
        }
        System.out.println("your name is " + name);

    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();// to get full sentence with space. next() get only one word.

        System.out.print("Enter surname: ");
        String surname = sc.nextLine();

        String_Practice2(name, surname);
    }
}
