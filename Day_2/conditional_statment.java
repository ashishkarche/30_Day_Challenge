package Day_2;

import java.util.Scanner;

public class conditional_statment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        // int b = sc.nextInt();

        if (a >= 18) {
            System.out.println("Is adult ");
        }else{
            System.out.println("not adult");
        }

    }
}
