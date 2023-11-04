package homework;
import java.util.Scanner;

public class problemThree {

    public static void main(String[] args){
        /**
         * This function prompts the user to enter a String, an int, and a double
         * 
         * no params
         * 
         * no returns
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a String.");
        String s = scanner.nextLine();

        System.out.println("Please enter an int.");
        int i = scanner.nextInt();

        System.out.println("Please enter a double.");
        double d = scanner.nextDouble();

        System.out.println(concat(s,i,d));
    }

    public static String concat(String s, int i, double d){
        /**
         * This funciton concatonates a String, an int, and a double
         * 
         * @param s is the String
         * @param i is the int
         * @param d is the double
         * 
         * @returns a string of s + i + d
         */
        return "" + s + i + d;
    }
}
