package Day_26.DSA;


public class class8 {

    public static void Tower_of_hanoi(int n, String src, String Helper, String dest) {
        if (n == 1) {
            System.out.println("transfer disk: " + n + " From " + src + " to " + dest);
            return;
        }
        Tower_of_hanoi(n - 1, src, dest, Helper);

        System.out.println("transfer disk: " + n + " From " + src + " to " + dest);

        Tower_of_hanoi(n - 1, Helper, src, dest);
    }

    public static void main(String[] args) {
        int n = 3;
        Tower_of_hanoi(n, "S", "H", "D");
    }
}
