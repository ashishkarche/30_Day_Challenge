package Day_5.DSA.Basics_of_time_complexity;

import java.util.Scanner;

public class Space_complexity {
    public static void main(String[] args) {
        // Space complexity
        /*
         * Space complexity means - how many variable store in memory.
         * space complexity defined by variable that we used in coding.
         */

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            System.out.println("hi");
        }
    }
}
