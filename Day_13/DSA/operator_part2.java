package Day_13.DSA;

import java.util.Scanner;

public class operator_part2 {
    public static void pre_increment(int a, int b) {

        // pre increment
        // ++a
        // how this work
        // 1. change the value
        // 2. use the value
        b = ++a; // 1+10 = 11, use the value , b= 11 and a=11
        // meaning it will change//increment value a = 10+1 = 11, then assign that value
        // to b
        System.out.println("pre increment");
        System.out.println("a - " + a);
        System.out.println("b - " + b);

    }

    public static void post_increment(int x, int y) {

        // post increment
        // a++
        // how this works
        // 1. use the value
        // 2. change the value
        y = x++;// y = 10 bcz x value before is 10,after change the value , x = 11.
        // meaning first it will assign value to y which is 10 , then change/increment the value of
        // x.
        System.out.println("post increment");
        System.out.println("x - " + x);
        System.out.println("y - " + y);

    }

    public static void main(String[] args) {

        try {
            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a/x: ");
            int num1 = sc.nextInt();
            System.out.println("Enter b/y: ");
            int num2 = sc.nextInt();

            pre_increment(num1, num2);
            post_increment(num1, num2);
        } catch (Exception exception) {
            System.out.println("input must be intger");
        }
    }
}
