package Day_2;

import java.util.Scanner;

public class comparison_operators {
    public static void main(String[] args) {
        // comparison operators (==,<,<=,>,>=,!=)
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) {
            System.out.println(a + " Is Equal to " + b);
        } else if (a < b) {
            System.out.println(a + " Is smaller then " + b);
        } else if (a > b) {
            System.out.println(a + " Is bigger then " + b);
        } else if (a <= b) {
            System.out.println(a + " Is smaller then equal to " + b);
        } else if (a >= b) {
            System.out.println(a + " Is bigger then equal to " + b);
        } else if (a != b) {
            System.out.println(a + " Is not equal to " + b);
        } else {
            System.out.println(a + " and " + b);
        }
    }
}
