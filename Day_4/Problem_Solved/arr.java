import java.util.Scanner;

public class arr {

    public static void array() {
        int[] arr = { 1, 2, 3, 4 };
        System.out.print("array: ");
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    

    public static void main(String[] args) {
        try{
        System.out.println("Print Array");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter yes/no to print array: ");
        String userinput = sc.next();

        switch (userinput) {
            case "yes":
                array();
                break;
                case "no":
                System.out.println("Ahh!! shit, here we go again..");
                break;
            default:
            System.out.println("Not valid opinion");
                break;
        }
    }catch(Exception exception){
        System.out.println("SYSTEM = you little bit***!!");
    }
    }
}