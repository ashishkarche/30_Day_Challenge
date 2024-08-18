package Day_12.problem_solved;

import java.util.Scanner;

public class reverse_string {

    public static void reverseArray(String chr) {
        StringBuilder sb = new StringBuilder(chr);

        for (int i = sb.length() - 1; i >= 0; i--) {

            System.out.println(sb.charAt(i));
            /*
             * ashish = length is 6
             * 012345 <== index no
             * 6-1 = 5 = print h
             * i -- : i = i-1 5-1=4
             * 5-1 = 4 = print s
             * i--
             * 4-1 = 3 = print i
             * 3-1 =2 = print h
             * 2-1 = 1 = print s
             * 1-1 = 0 = print a
             */
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character: ");
        String chr = sc.nextLine();

        reverseArray(chr);
    }
}
