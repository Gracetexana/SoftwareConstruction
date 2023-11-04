package activities;

import java.util.Scanner;

/*
 * Grace Texana Long Torales
 * gtl1500@g.rit.edu
 */

public class EvensAndOdds {
    /**
     * Prompts user to enter a number and prints whether the number is even or odd until the user enters 0
     * @param args
     * no returns
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int number;

        do{
            System.out.println("Enter a number");
            number = scanner.nextInt();
            switch(number % 2){
                case 0: System.out.println("Even.");
                break;
                case 1: System.out.println("Odd");
                break;
            }
        } while(number != 0);

        System.out.println("Done!");
    }
}
