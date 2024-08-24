package Day_18.DSA;

import java.util.Scanner;

public class bit_manipulation {

    // we use OR to convert 0 to 1.(update to 1)
    // AND with NOT to convert 1 to 0 .(update to 0)

    public static void set_operation_bit(int n, int pos) {
        // SET BIT
        // Q1. Set the 2nd bit (position[i] = 1) of a number n. (n = 0101)
        // Bit mask = 1 << i
        // operation
        /*
         * 1. calculate bitmask
         * 1 << 1
         * 0001 << 1
         * bit mask = 0010
         * 
         * 2. OR operation (|) = 0010 | 0101 = 0111
         */
        int BitMask = 1 << pos;

        int newNumber = BitMask | n;

        System.out.println("Set Bit Operation: " + newNumber);

    }

    public static void clear_bit(int n2, int position2) {
        // Q2. clear the 3rd bit(Position[i] = 2) of a number n. (n =0101).
        /*
         * bitmask = 1 << i;
         * operation = AND with NOT
         * 
         * 1. calculate bitmask
         * 1 << 2
         * 0001 << 2
         * bitmask = 0100
         * 
         * 2. Operation AND with NOT
         * i . Calculate NOT with bitmask :
         * here we use not(~) on bitmask number = ~(0100) all 0 convert to 1, 0 to 1.
         * bitmask = 1011
         * ii. calculate AND:
         * 
         * 1011 & 0101 = 0001 [Convert binary to decimal is 1]
         */

        int bitmask = 1 << position2;

        int bitmask2 = ~(bitmask);

        int newNumber2 = bitmask2 & n2;

        System.out.println("Cleat Bit operation: " + newNumber2);
    }

    public static void update_bit(int n3, int pos3) {
        // Q3. update the 2nd bit (Position[i] = 1) of a number n to 1,(n= 0101)
        /*
         * for 0:
         * Bitmask = 1 << i
         * operation = AND with NOT
         * 
         * for 1:
         * bitmask = 1 << i
         * operation = OR
         * 
         * 1. bitMask = 1 << i
         * 0001 << 1
         * bitmask = 0010
         * 
         * 2. operation = OR
         * 0010 | 0101 = 0111 (Convert binary to decimal: 7)
         */

        // int bitM = 1 << pos3;

        // int newNo = bitM | n3;

        // System.out.println("Case 2: Update n to 1, Update Operation: " + newNo);

        // case 2 , same question , update number n to 0. (n = 0101)
        /*
         * bitmask = 1<<1 = 0001 << 1 = 0010
         * operation = AND with NOT
         * 1. NOT On Bitmask = ~(0010) = 1101 [Newbitmask]
         * 2. AND ON New bitmask = 1101 & 0101 = 0101 (Convert Binary to decimal: 5)
         */

        // int bitM2 = 1 << pos3;

        // int NotBitM = ~(bitM2);

        // int operation = NotBitM & n3;

        // System.out.println("Case 2: Update n to 0, Update Operation: " + operation);

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Update number n to 0 or 1: ");
        int operation = sc.nextInt();

        int bitM = 1 << pos3;
        if (operation == 1) {
            int OR_operation = bitM | n3;
            System.out.println("Update Operation n to 1: " + OR_operation);
        } else {
            int NotBitM = ~(bitM);
            int AND_operation = NotBitM & n3;
            System.out.println("Update Operation n to 0: " + AND_operation);
        }
    }

    public static void main(String[] args) {

        try {
            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in);

            System.out.println("=== SET OPERATION ===");
            System.out.println("Enter number: ");
            int number = sc.nextInt();
            System.out.println("enter position: ");
            int position = sc.nextInt();

            set_operation_bit(number, position);

            System.out.println("=== Clear Operation ===");
            System.out.println("Enter number: ");
            int number2 = sc.nextInt();
            System.out.println("Enter position: ");
            int pos = sc.nextInt();

            clear_bit(number2, pos);

            System.out.println("=== Update Operation ===");
            System.out.println("Enter number: ");
            int number3 = sc.nextInt();
            System.out.println("Enter Position");
            int pos3 = sc.nextInt();

            update_bit(number3, pos3);
        } catch (Exception exception) {
            System.out.println("Error: " + exception + " , Input must be integer");
        }
    }
}