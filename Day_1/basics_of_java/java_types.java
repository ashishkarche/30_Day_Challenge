package Day_1.basics_of_java;

public class java_types {
    public static void main(String[] args) {
        /*
         * Primitive Types
         * primitive types have fix capacity/size while non-primitive 
         * types not have fix capacity/size
         * 
         * 1. byte - take 1 byte memory
         * 2. short - 2 byte memory
         * 3. int - 4 byte memory
         * 4. long - 8 byte memory
         * 5. float - 4 byte memory
         * 6. double - 8 byte memory
         * 7. char - 2 byte memory Stores one word / alphabet
         * 8. boolean - 1 byte memory (True / False)
         */

        byte age = 40;
        int mobile_num = 1234567890;
        long mobile_num1 = 1234567890L;
        float pi = 3.14F;
        char letter = '@';
        boolean RuRobot = true;

        /*
         * Non- Primitive Types
         * In non primitive types we can perform different operations
         * on Types likr we can find the length of string.
         * 
         * 1.String
         * 2.New is the keyword, it is used to create new objects.
         */

        String name = new String("ashish");
        String Lname = new String("Karche");
        System.out.println(name.length()); 
        System.out.println(Lname.length()); 

    }
}
