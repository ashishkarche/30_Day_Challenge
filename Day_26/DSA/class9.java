package Day_26.DSA;

public class class9 {
    // Print a String in reverse.
    public static void printString(int n,String chr){
        if (n == 0) {
            System.out.println(chr.charAt(n));
            return;
        }
        System.out.println(chr.charAt(n));
        printString(n-1, chr);
        
    }

    public static void main(String[] args) {
        String random = "abcd";
        printString(random.length()-1, random);
    }
}
