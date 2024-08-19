package Day_13.problem_solution;

import java.util.Scanner;

public class reverse_strings {
    public static void reverse_strings_m2(String chr) {
        StringBuilder charc = new StringBuilder(chr);

        for (int i = 0; i < charc.length() / 2; i++) {

            // i is index number
            int front = i;
            /*
             * front = 0 <== index number
             */
            int back = charc.length() - 1 - i;
            /*
             * charc = "hello" length is 5
             *          01234
             * back = 5 - 1 -0 = 4 index number
             */

            char frontchar = charc.charAt(front);
            // fromtchar stores what is at index front = 0; then charAt print one word "h"
            // at index 0.
            char backchar = charc.charAt(back);
            // it will store 4th index number word "o"

            charc.setCharAt(front, backchar);
            // here we replace word at index 0 with "o"
            charc.setCharAt(back, frontchar);
            // here we replaced word at index 4 with "h"
            
            // again loop run
        }
        System.out.println(charc);
        // oellh
        
    }

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter character: ");
        String character = sc.nextLine();

        reverse_strings_m2(character);
    }
}

// time complexity is O(n)