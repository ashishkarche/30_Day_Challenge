package Day_15.DSA.binary;

import java.util.Scanner;

public class bitwise_operator {

    // public static void bitwise_operator_p1(int bit_A, int bit_B) {
    // for (int i = 0; i < 4; i++)
    // if (bit_A == i & bit_B == i) {
    // System.out.println(true);
    // }
    // }

    public static void main(String[] args) {
        // bitwise operators

        /*
         * 1. & = Binary AND (if both value true then code exe)
         * 2. | = Binary OR (if one value is true then code exe)
         * 3. ^ = Binary XOR (if two value are different then code exe)
         * 4. ~ = Binary ONE'S COMPLEMENT (if value is true then convert to false, and
         * false to true, and apply to one variable)
         * 5. << = Binary LEFT SHIFT  (Shift one binary number to left site. how to write [number << position])
         * 6. >> = Binary RIGHT SHIFT (Shift one binary number to right site. how to write [number >> position])
         */

        // Example
        /*
         * A = 0101
         * b = 0110
         * let's tale 1 = true and 0 = false
         * 1. AND (&) = 0101 & 0110 = 0100
         * means if (A & B) assign value to third variable then there value will be 0100
         * 
         * 2. OR(|) = 0101 | 0110 = 0111
         * 
         * 3. XOR(^) = 0101 ^ 0110 = 0011
         * 
         * 4. ONE'S COMPLEMENT(~) = ~ 0101  = 1010
         * 
         * 5. left shift (<<) = 0'1'01 << 1 = 1010, '0'110 << 1 = 1100
         * 
         * 6. right shift (>>) = 010'1' >> 1 = 0010, 011'0' >> 1 = 0011
         */

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter A:");
        // int a = sc.nextInt();
        // System.out.println("Enter B");
        // int b = sc.nextInt();

        // bitwise_operator_p1(a, b);
    }
}
