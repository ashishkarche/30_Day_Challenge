package Day_27.DSA;

/**
 * backtracking
 */
class backtracking {
    // backtracking means find all possible solution & use the
    // one you want.
    // pehle istmal kre fhir vishwas kre.

    public static void printPermutation(String chr, String perm, int idx) {
        if (chr.length() == 0) {
            System.out.println(perm);
            return;
        }
        for (int i = 0; i < chr.length(); i++) {
            char currChar = chr.charAt(i);
            String newChr = chr.substring(0, i) + chr.substring(i + 1);
            printPermutation(newChr, perm+currChar, idx + 1);
        }
    }

    public static void main(String[] args) {
        String chr = "ABC";
        printPermutation(chr, "", 0);
    }
}