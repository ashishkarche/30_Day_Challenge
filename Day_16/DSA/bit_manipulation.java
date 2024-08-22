package Day_16.DSA;

import java.util.Scanner;

public class bit_manipulation {
    public static void Bit_function(int n, int pos) {
        // GET BIT OPERATION
        // Question 1. Get the 3rd bit (position = 2) of a number n.(n=0101)
        // Bit mask = 1 << i
        // operation: AND

        // and we count position from right ot left,
        // 0 1 0 1
        // 3 2 1 0 <==position
        // bit mask means we perform all this function (get, set, clear,update) that
        // what we call bit mask. and in this process we used additional number ,it's
        // called bit mask.

        // answer
        /*
         * position (i) = 2
         * 1 << 2 (this is left shift operator)
         * shift bit to the left.
         * convert 1 to binary = 0001 << 2 (Shift 1 to the left side of position 2.)
         * 000'1' << 2
         * bit mask = 0100
         * 
         * operation - AND (both value true, then code exe)
         * formula = bit mask OPERATOR N (number)
         * 0100 AND 0101 = 0100
         * 
         * 0100 is non-zero (means it do not have 0000)number {1}[zero 0 number means it
         * do have 0000]
         * 
         * Logic is we used AND operator to find 1 value in binary digit.
         */

        // Question 2. same question 1 ,change in postion = 3
        /*
         * calculate bit mask = 1 << i.
         * 0001 << 3
         * 1000 is bit mask
         * 
         * Operator = AND
         * = 1000 & 0101
         * = 0000 is zero number value , (do not contain 1/can't find 1)
         */

        // CODE -

        int BitMask = 1 << pos;

        if ((BitMask & n) == 0) {
            System.out.println("bit was zero");
        } else {
            System.out.println("bit was one");
        }
    }

    public static void main(String[] args) {
        // Bit manipulation function
        /*
         * 1. Get - Is used to find that the bit is 0 or 1.
         * 2. Set - To set bit 0 to 1 and 1 to 0.
         * 3. Clear - Is used to set bit to 0
         * 4. Update - is used to update the bit from 0 to 1 and 1 to 0.
         */
        try {
            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in);
            System.out.println("----- GET BIT OPERATION -----");
            System.out.println("Enter number: ");
            int number = sc.nextInt();

            System.out.println("Enter Position: ");
            int position = sc.nextInt();

            Bit_function(number, position);
        } catch (Exception exception) {
            System.out.println("ERROR..!!!, Input must be integer.");
        }
    }
}