package homework;

import java.util.Random;
import java.util.Scanner;

public class ProblemThree {
    
    /**
     * takes the player through a guessing game-- they get 3 tries to guess the correct number; if they lose, the correct number is revealed
     * @param args idk what this does
     * no returns
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int number = random.nextInt(10) + 1;

        System.out.println("Guess a number between 1 and 10 (both inclusive) within 3 guesses.");
        int guess = scanner.nextInt();

        if (!hint(number, guess)){
            System.out.println("2 more guesses");
            guess = scanner.nextInt();
            if (!hint(number, guess)){
                System.out.println("1 more guess");
                guess = scanner.nextInt();
                if (!hint(number,guess)){
                    System.out.println("You lose. The number was " + number + ".");
                }
            }
        }
    }
    
    /**
     * hint takes two numbers and prints whether they are equal ("Correct") or whether the second number is higher or lower than the first
     * @param number first number
     * @param guess second number
     * @return whether the numbers are equal or not
     */
    public static boolean hint(int number, int guess){
        if (number == guess){
            System.out.println("Correct!");
            return true;
        } else if (number > guess){
            System.out.println("Too low!");
            return false;
        } else{
            System.out.println("Too high!");
            return false;
        }
    }
}
