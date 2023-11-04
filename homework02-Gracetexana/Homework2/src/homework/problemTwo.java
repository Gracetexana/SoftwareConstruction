package homework;
import java.util.Scanner;

public class problemTwo {
    
    public static void main(String[] args){
        /**
         * This function prompts the user for a measurement in grams that they would like to be converted to Joules.
         * 
         * no params
         * 
         * no returns
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a measurement in grams that you would like to have converted to Joules.");
        double g = scanner.nextDouble();
        double j = gToJ(g);

        System.out.println(g + " grams is equal to " + j + " Joules");
    }

    public static double gToJ(double g){
        /**
         * This function converts grams to Joules using the equation E = mc^2.
         * 
         * @param g is a measurement in grams
         * 
         * @return the value of Joules that is equivalent to the given value of grams
         */
        double c = 299792458;
        double m = g/1000.0;
        return m * c * c;
    }
}
