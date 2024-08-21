package Day_15.DSA.bit_manipulation;

public class bit_mani {
    public static void main(String[] args) {
        // bit manipulation
        /*
         * bitwise operator
         * 1. & (AND) (both value true , code exe)
         * 2. | (OR) (one value true, code exe)
         * 3. ^ (XOR) (two different values(True ^ False), code exe)
         * 4. ~ (ONE'S COMPLEMENT) (Convert true to false , false to true)
         * 5. << (LEFT SHIFT) (shift one bit to left side,0'1'10 = 1100)
         * 6. >> (RIGHT SHIFT) (shift one bit to right side, 01'1'0 = 0011)
         */

        // decimal to binary
        /*
         * 1. if it is divide then 0
         * 2. if it is not divide then 1
         * 3. until last answer is o and 1, try to divide by 2 we always get 1
         */

        // binary to decimal
        /*
         * 1. Take bits like 0101 , multiply by every number with 2 to the power of
         * position (2^0,2^1,....)and add sum up.
         * 2. example = 0101 = 0*(2^3)+1*(2^2)+0(2^1)+1*(2^0) = 0 + 4+0+1 = 5
         */
    }
}
