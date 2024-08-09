package Day_3;

import java.util.Scanner;

public class conditional_statement {
    public static void main(String[] args) {
        // switch
        // it will take one value and then apply conditions.

        Scanner sc = new Scanner(System.in);

        int cash = sc.nextInt();

        switch (cash) {
            case 10:

                System.out.println("can't buy anything");
                break;
            case 40:
                System.out.println("can get book");
                break;
            default:
                System.out.println("can get 1 thing.");
                break;
        }
    }
}
