package Day_2;

import java.util.Scanner;

public class logical_operator {
    public static void main(String[] args){
        // logical operator (&&[AND],||[or], ![not])

        boolean a = true;
        boolean b = true;
        boolean fn = a&&b;
        if (fn == true) {
            System.out.println(fn+" True");
        }
        else if(fn == false){
            System.out.println(fn+" False");
        }

        boolean or = a||b;
        if (or == true) {
            System.out.println(or+" True");
        }
        else if(or == false){
            System.out.println(or+" False");
        }

        int c = 18;
        int d = 19;
        Boolean isAdult = true;

        if (!isAdult) {
            System.out.println("is adult");
        }else{
            System.out.println("is not adult");
        }

        if (c > 18 && d >18) {
            System.out.println("isAdult"); // if condition is true AND true then it print
        }
        else if (c > 18 || d >18) {
            System.out.println("IsNotAdult");// if condition is true OR false then it print
        }else{
            System.out.println("try again..");
        }

        Scanner sc = new Scanner(System.in);

        int money = sc.nextInt();

        if (money<10) {
            System.out.println("Can't but anything.");
        }else if(money >10 && money< 50){
            System.out.println("can get 1 thing");
        }
        else{
            System.out.println("can get both");
        }
    }
}
