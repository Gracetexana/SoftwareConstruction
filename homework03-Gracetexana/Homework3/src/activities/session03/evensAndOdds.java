package activities.session03;
import java.util.Scanner;

public class evensAndOdds {
    
    public static void main(String[] args){
        /**
         * This method prompts the user to enter an integer to determine whether it is even.
         * 
         * no params
         * 
         * no returns
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer.");
        int input = scanner.nextInt();
        isEven(input);
    }

    public static void isEven(int input){
        /**
         * This method takes an int as input and prints out a statement telling whether the number is even, odd, or divisible by 5 (instead of even or odd).
         * 
         * @param input is the int
         * 
         * no returns
         */
        if (input % 5 == 0){
            //number is divisible by 5
            System.out.println("The number is divisible by 5.");
        } else if (input % 2 == 0){
            //number is even
            System.out.println("The number is even.");
        } else{
            //number is odd
            System.out.println("The number is odd.");
        }
    }
}
