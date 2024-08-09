package Day_3;

public class exception_handling {
    public static void main(String[] args) {
        // Try Catch block
        // In java if error occur then code does't run. it will stop .
        // Use try catch block, if error occur then first error catches,
        // and then in try block code run.

        /*
         * example , we have an website. and we try to fetch data and some
         * error occur, then whole website stop .
         * but we use try catch block as exception handling. then
         * website other component runs.
         */

        int[] marks={12,23,34};
        try{
            System.out.println(marks[3]);
            System.out.println("The name is ashish");
        }catch(Exception exception){
            System.out.println("Marks Not Found");
        }
    }
}
