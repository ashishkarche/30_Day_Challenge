package Day_26.DSA;

public class class10 {
    //Find the 1st and last occurance of an element in string.
    public static int first = -1;
    public static int last = -1;

    public static void printEle(String name,char element, int n) {

        if (n == name.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currentChr = name.charAt(n);
        if (currentChr == element) {
            if (first == -1) {
                first = n;
            }
            else{
                last = n;
            }
        }

        printEle(name, element, n+1);
    }

    public static void main(String[] args) {
        String chr = "abaacdaefaah";
        printEle(chr, 'a', 0);
    }
}
