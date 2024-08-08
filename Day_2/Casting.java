package Day_2;
public class Casting {
    public static void main(String[] args){
        // Casting means Convert one type to another type.
        // meaning of we assign double data type which has 8 byte space,
        // we can store big value in double. but instead of double,
        // we declare int data type with same as double value then it show error.
        // Example - we take 1 one glass water and put that water in backet, then backet can store that water,
        // let's reverse the process we have water backet & we put that water in glass, then it overflow with water.

        // Casting type - implicit or explicit

        // Implicit Casting - java automatically can go int (4 bytes )to double (8 bytes)data type 
        // means - we can store int value in double .
        double price = 100.00;
        double Fprice = price + 18.1;
        System.out.println(Fprice);

        // Now just change the Data type 
        // Explicit Casting - it can't go to big to small data type (double to int).
        // in explicit cast is like we may lose thoda bohot data basically farak nhi padta , 
        // but hum value define krke rahege.
        int price1 = 100;
        int Fprice2 = price1 + (int)18.1; // throw an error  
        System.out.println(Fprice2); // output - 118 not 118.1
    }
}
