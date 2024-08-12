package Day_6.DSA;

public class array {

    public static void arrayInto() {
        // Method 1
        int[] marks = new int[4];

        // type[] arrayName = new type[size]

        marks[0] = 96;
        marks[1] = 95;
        marks[2] = 98;

        // System.out.print(marks[0]+ " "); // to print array element. it will print one
        // element.
        // instead we use foreach loop for array.
        for(int i = 0; i < 4; i++){               // this loop is same as for each loop
            System.out.println(marks[i]+" ");
        }

        for (int i : marks) {
            System.out.print(i + " ");
        }

        String[] subject = { "English", "Maths", "Chemistry" };

        for (String j : subject) {
            System.out.print(j + " ");
        }

    }

    public static void main(String[] args) {
        // array - non primitive Data type
        arrayInto();
    }
}