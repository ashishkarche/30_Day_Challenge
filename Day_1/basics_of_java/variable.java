package Day_1.basics_of_java;

public class variable {
    public static void main(String[] args) {
        // Variable
        /*
         * if we want to store data in java , then we can store in
         * the form of variables.
         * Meaning - 
         * Variable create an space or allocate an space to a variable
         * name that stores "ASHISH" data in Computer memory. 
         */

        String name = "ashish";  // Variable syntax
        String name2 = "Karche";
        int age = 21;            // integer type variable
        System.out.println(name); // Output funtiun or Syntax
        System.out.println(name2);
        System.out.println(age);

        String name3 = name; // reference which point to variable
                             // name which has value ashish. 
        System.out.println(name3); 
        
    }

}
