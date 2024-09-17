package Day_26.DSA;

public class class12 {
    // Move all 'x' to the end of the string.
    public static void moveX(int idx, int count, String newStr, String name) {

        if (idx == name.length()) {
            for (int i = 0; i < count; i++) {
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }
        char currChar = name.charAt(idx);
        if (currChar == 'x') {
            count++;
            moveX(idx + 1, count, newStr, name);
        } else {
            newStr += currChar;
            moveX(idx + 1, count, newStr, name);
        }
    }

    public static void main(String[] args) {
        String name = "axbcxxd";
        moveX(0, 0, "", name);
    }
}
