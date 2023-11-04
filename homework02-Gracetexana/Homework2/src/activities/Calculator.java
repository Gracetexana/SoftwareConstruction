package activities;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){
        /**
         * This function allows a user to input 2 floats to be added, multiplied, subtracted, and divided
         * 
         * no params
         * 
         * no returns
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number.");
        float x = scanner.nextFloat();

        System.out.println("Enter the second number.");
        float y = scanner.nextFloat();

        arithmetic(x, y);        
    }

    public static void arithmetic(float x, float y){
        /**
         * This function adds, multiples, subtracts, and divides two floats
         * 
         * @param x the first float
         * @param y the second float
         * 
         * no returns
         */
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("x + y = " + (x+y));
        System.out.println("x * y = " + (x*y));
        System.out.println("x - y = " + (x-y));
        System.out.println("x / y = " + (x/y));
        System.out.println();
    }
}
