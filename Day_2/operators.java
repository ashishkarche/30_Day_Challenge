package Day_2;
public class operators {
    public static void main(String[] args) {
        // operators
        // 4 Types
        /*
         * 1. Arithmatic Operator(=,-,*,%,/)
         * 2. Assignment Operator(=, +=,-=,*=,%=,etc)
         * 3. Logical Operator(&&,||,!)
         * 4. Comparision Operator(==, <,<=,>,>=)
         * 5. unary operator (increment/decrement).
         */

        int a = 4;
        int b = 2;
        int sum = a+b;
        int multiply = a*b;
        int divide = a/b;
        a++; // unary operator applies only one on variable.
        System.out.println(a++);// we print directly then first it will print assign then increment the value and variable value change.
                                // so if you store unary operator before printing then it will print increment value.
        System.out.println(++b); // it will increment first then print value
        System.out.print("Sum: "+sum+"\nmultiply: "+multiply+"\ndivide: "+divide);
    }
}
