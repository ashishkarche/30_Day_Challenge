package Day_13.DSA;

import java.util.Scanner;

public class string_builder {
    public static void string_builder_p2(String name) {

        StringBuilder sb = new StringBuilder(name);

        sb.setCharAt(0, 'C'); // replace operation
        System.out.println("replace operation: " + sb);

        sb.insert(1, 'b'); // insert operation
        System.out.println("Insert operation: " + sb);

        sb.delete(0, 2); // delete operation
        System.out.println("Delete operation: " + sb);

        sb.append("END"); // add operation
        System.out.println("append operation: " + sb);

        for (int i = 0; i < sb.length() / 2; i++) { // reverse string
            int front = i; // index number
            int back = sb.length() - 1 - i; // assume sb = "hello": 5-1-0 = 4

            char frontchr = sb.charAt(front); // charAt(0) = "h"
            char backchr = sb.charAt(back); // charAt(4) = "o"

            sb.setCharAt(front, backchr); // setcharAt(indexno, character)is like replace function
            // 0,"o"
            sb.setCharAt(back, frontchr);
            // 4,"h"

        }
        System.out.println(sb);
        StringBuilder ab = new StringBuilder("h");
        // here memory does not get affetced in stringbuilder
        // bcz append make changes in stringbuilder not in memory.
        // and in string memory is affected.
        // str = str +"e";
        // means in stack we store "str" and point to the heap memory "e"
        // str = str + "l"
        // again in stack we store "str" and point to the heap memory "L", new address
        // allocate and previous get deleted.

        ab.append("e");
        ab.append("l");
        ab.append("l");
        ab.append("o");
        System.out.println(ab);

        // length() is used to calculate the length of string.
        System.out.println(ab.length());
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("Input anything: ");
        String chr = sc.nextLine();

        string_builder_p2(chr);
    }
}
