package homework04;

import java.util.Scanner;

/*
 * Grace Texana Long Torales
 * gtl1500@g.rit.edu
 */
public class Problem1 {
    /**
     * prompts user to enter 2 numbers; prints the sum of the numbers; asks whether user would like to repeat; if user declines, program terminates
     * @param args
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        boolean again = true;

        do{
            System.out.println("Enter a number");
            int first = scanner.nextInt();

            System.out.println("Enter another number");
            int second = scanner.nextInt();

            System.out.println(first + second);

            System.out.println("Would you like to go again? (y/n)");

            if (scanner.next().equals("n")){
                again = false;
            }
        } while(again);
    }
}
