import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //float occupies 32 bits or 4 bytes
        //double precision occupies 64 bits or 8 bytes
        // a double is more precise with the range

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value = " + myMinFloatValue);
        System.out.println("Float Maximum Value = " + myMaxFloatValue);

        System.out.println("");          //to get some space between the values in the system out println

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value = " + myMinDoubleValue);
        System.out.println("Double Maximum Value = " + myMaxDoubleValue);       //double is more precise than float, but uses twice the memory of float to store that number

        System.out.println("");

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00 / 3.00;

        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        System.out.println("");



        // Challenge time! Convert a given number of pounds to kilograms
                int i = 0;
                do {


                    Scanner input = new Scanner(System.in);
                    System.out.print("Enter a number in pounds: ");

                    double pounds = input.nextDouble();
                    double kilograms = pounds * 0.45;

                    System.out.println(pounds + " pounds is " + kilograms + " kilograms.");

                } while(i < 5);

                // this is just a test to see if I can commit and push




    }
}
