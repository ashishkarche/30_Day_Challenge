package Day_26.DSA;

public class class11 {

    // check if an array is sorted(stricly incresing)
    public static boolean sortArray(int[] array, int idx) {
        if (idx == array.length-1) {
            return true;
        }
        if (array[idx + 1] > array[idx]) {
            // System.out.println("sorted");
            return sortArray(array, idx + 1);
        } else {
            // System.out.println("unsorted");
            return false;
        }
        

    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        // int[] array = { 4, 3, 5 };
        System.out.println(sortArray(array, 0));
    }
}
