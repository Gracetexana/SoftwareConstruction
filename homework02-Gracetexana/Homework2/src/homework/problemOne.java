package homework;
import java.util.Scanner;

public class problemOne {
    public static void main(String[] args){
        /**
         * This function prompts the user for a temperature in Farenheit to be converted to Kelvin. The result is printed
         * 
         * no params
         * 
         * no returns
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a temperature in Fahrenheit.");
        double f = scanner.nextDouble();

        double k = fToK(f);

        System.out.println(f + " degrees Fahrenheit is " + k + " degrees Kelvin");
    }

    public static double fToK(double f){
        /**
         * This function converts Fahrenheit to Kelvin using the formula K=5/9(F-32)+273
         * 
         * @param f is the temperature in Farenheit
         * 
         * @returns the temperature in Kelvin
         */
        double k = (f-32)*(5.0/9.0)+273;
        return k;
    }
}
