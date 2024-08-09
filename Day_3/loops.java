package Day_3;

import java.lang.reflect.Array;
import java.util.Scanner;

public class loops {
    // loops

    public static void main(String[] args) {

        // for loop
        // Scanner sc = new Scanner(System.in);

        // int num = sc.nextInt();
        for (int i = 2; i <= 10; i++) {
        int result = i * 2; // first we need to multiply by 2
        // num++; // then input value change 2 to 3 to 4,....
        System.out.println(" Table " + result);
        }
        System.out.println(" ");

        // 1-100
        for (int i = 1; i <= 100; i++) {
        System.out.print(i + " ");
        }
        System.out.println(" ");

        // 100-1
        for (int i = 100; i >= 1; i--) {
        System.out.print(i + " ");
        }
        System.out.println(" ");

        // while loop
        // 1 to 10
        int b = 1;
        while (b <= 10) {
        b++;
        System.out.println(b);
        }
        // 10 - 1
        int c = 10;
        while (c >= 1) {
        c--;
        System.out.println(c);
        }

        int e = 1;
        do{
        e++;
        System.out.print(e+" ");

        }while(e<10);
        System.out.println();
        int k = 10;
        do{

        System.out.print(k+" ");
        k--;
        }while(k>1);

        Scanner sc = new Scanner(System.in);

        int num;
        do {
            System.out.print("Enter no: ");
            num = sc.nextInt();
            System.out.println("The No: " + num);

        } while (num >= 0);
        System.out.println("The end");
    }
}
