package Day_3;

public class brek_conti {
    public static void main(String[] args) {
        // BREAK & CONTINUE
        int i = 1;
        while (true) {
            System.out.println(i);
            i++;
            if (i > 5) { 
                break;
            }
            if (i == 3) { // use this statement to remove 3 
                i++;
                continue;
            }
        }
    }
}
