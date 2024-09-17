package Day_26.DSA;


public class class13 {

    public static boolean[] map = new boolean[26];

    // Remove duplicate in a string
    public static void removeDuplicate(int idx, String chr, String newStr) {
        if (idx == chr.length()) {
            System.out.println(newStr);
            return;
        }

        char currChr = chr.charAt(idx);

        if (map[currChr - 'a'] == true) {
            removeDuplicate(idx + 1, chr, newStr);
        } else {
            newStr += currChr;
            map[currChr - 'a'] = true;
            removeDuplicate(idx + 1, chr, newStr);
        }

    }

    public static void main(String[] args) {
        String chr = "abbccda";
        removeDuplicate(0, chr, "");
    }
}
