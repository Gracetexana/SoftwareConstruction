package activities;
//Grace Texana Long Torales
//gtl1500@g.rit.edu

import java.util.Scanner;

public class CountDown {
    /**
     * Asks user to input a number; prints each number from starting number down to 0
     * @param args
     * no returns
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        while (number >= 0){
            System.out.println(number);
            number--;
        }
    }
}
