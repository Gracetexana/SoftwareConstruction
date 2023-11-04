package activities;

import java.util.Scanner;

/*
 * Grace Texana Long Torales
 * gtl1500@g.rit.edu
 */
public class CountUp {
    /**
     * prompts a user to enter a number, then prints every number from 0 to that number
     * @param args
     * no returns
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = scanner.nextInt();

        for(int i=0; i<=number; i++){
            System.out.println(i);
        }
    }
}
