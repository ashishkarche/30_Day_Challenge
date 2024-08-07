package Day_1.basics_of_java;

public class strings {
    public static void main(String[] args) {
        // Lets talk about strings
        /*
         * string are immutable in java, if we set string value then we can't change /
         * edit it.
         * Perform operations/function on strings-
         * 
         * 1.concatenate - it sum/connect/add two string.
         * 2. chatAt- Returns the char value at the specified index.
         *            meaning - it will show you which character is present in 0,1,2,... index
         * 3. length - this function prints the length of the String.
         * 4. replace - it will replace old char that occur in string into new char.
         * 5. substring - it can print small part of string , set index 0 to 3 , 3 to 5 , etc.
         *                starting index , delete/include nhi hota wala index.
         *                this is how this function works.
         */

        String name1 = "ashish";
        String name2 = " karche";

        String name3 = name1 + name2; // concatenate
        String name4 = name1 + " Vikas" + name2; // concatenate

        System.out.println(name3);
        System.out.println(name4);

        System.out.println(name1.charAt(5));
        System.out.println(name4.length());

        String name5 = name1.replace("a", "A");
        System.out.println(name5);
        System.out.println(name5.substring(3, 5)); // output is "is"
    }

}
