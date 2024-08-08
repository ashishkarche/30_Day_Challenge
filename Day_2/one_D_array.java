package Day_2;
// Arrays 
/*
 * 
 */

import java.util.Arrays;

public class one_D_array {

    public static void main(String[] args) {
        // Example - now we have 3 subject marks store. 
        // what if there was 10 or 11 subject & subject change every year.
        // how can we store that for every student ??
        // 
        int age = 40;
        int physics = 50;
        int chemistry = 70;

        // we use arrays. This how we defined and print array.
        int[] marks = new int[3]; 
        marks[0] = 97;
        marks[1] = 95;
        marks[2] = 93;

        // if we don't push / assign value to array/ variable then it consider to be null/0.
        // output is "0".
        // and we if declare an empty array data type boolean then output is false.

        System.out.println(marks[0]);
        // Array has two imp function 
        // 1. Length 
        System.out.println(marks.length);
        // 2. sort(Ascending/decending order)
        Arrays.sort(marks);
        System.out.println(marks[0]);

        // if we already know the element of array then no need to used new keyword.
        int[] mark = {97,98,95};
        System.out.println(mark[0]);
    }
}