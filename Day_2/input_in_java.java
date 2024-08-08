package Day_2;

import java.util.Scanner;


public class input_in_java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.print("Age: ");
        // int age = sc.nextInt();
        // if (age >= 18) {
        //     System.out.println("IsAdult " + age);
        // } else {
        //     System.out.println("NotAdult " + age);
        // }
        // System.out.print("name: ");
        // String name1 = sc.next(); // this function does't print whole line
        // System.out.println(name1);

        System.out.println("name");
        String name = sc.nextLine();
        System.out.println(name);

    }
}
