package Day_11.DSA;

import java.util.Scanner;

public class string {

    public static void String_Practice3(String name, String name2) {

        // if (name == name2) {
        // System.out.println("Equal");
        // } else {
        // System.out.println("not equal");
        // }

        // OUTPUT: IS NOT EQUAL , when name=ashish, name1=ashish are same
        // else is same.
        // in java string are object. and string are non-primitive type so there
        // functioning is different(stored differently in memory).
        // used compare function . compareTo(String variable).

        if (name.compareTo(name2) == 0) {
            System.out.println("equal");
        } else {
            System.out.println("Not equal");
        }

        // substring is used print small part of string from substring(startingindex to
        // endingindex)
        // example = ashish , output = as, is, ash

        System.out.println(name.substring(0, 3));
        // how it works.
        // ashish
        // 012345 <== index Number
        // substring(0,2).
        // means it will print as from index 0 to 2. and other part ignore.

        // strings are immutable . means if you stored string in memory then it can not
        // be modify.

    }

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string 1: ");
        String name = sc.nextLine();

        System.out.println("Enter string 2: ");
        String name2 = sc.nextLine();

        String_Practice3(name, name2);
    }
}