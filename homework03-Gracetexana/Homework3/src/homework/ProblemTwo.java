package homework;

import java.util.Scanner;

public class ProblemTwo {
    
    public static void main(String[] args){
        /**
         * asks user whether they want to talk about music or movies; calls appropriate method in response
         * 
         * no params
         * 
         * no returns
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1 if you want to talk about music.");
        System.out.println("Enter 2 if you want to talk about movies.");

        String selection = scanner.next();

        switch (selection){
            case "1":
                music(scanner);
                break;
            case "2":
                movies(scanner);
                break;
            default:
                System.out.println("Not an option, try again.");
                System.out.println();
                main(null);
        }
    }

    public static void music(Scanner scanner){
        /**
         * takes the user through a conversation about music
         * 
         * @param scanner just brings the same scanner from main method so I didn't have to instantiate a new one
         * 
         * no returns
         */
        System.out.println("Do you like Blink-182? (Y/N)");
        String selection = scanner.next();
        switch (selection.toUpperCase()){
            case "Y": 
                System.out.println("Good taste!");
                break;
            case "N": 
                System.out.println("There is no accounting for taste!");
                break;
            default: 
                System.out.println("That wasn't an option, try again.");
                music(scanner);

        }
    }

    public static void movies(Scanner scanner){
        /**
         * takes the user through a conversation about Star Wars
         * 
         * @param scanner just brings the same scanner from main method so I didn't have to instantiate a new one
         * 
         * no returns
         */
        System.out.println("Which Star Wars episode was the best? (1/2/3/4/5/6/7)");
        String selection = scanner.next();
        
        switch(selection){
            case "1":
            case "2":
            case "3":
                System.out.println("Um, no.");
                break;
            case "4":
            case "5":
                System.out.println("I agree!");
                break;
            case "6":
            case "7":
                System.out.println("I like those too!");
                break;
            default:
                System.out.println("Not an option, try again.");
                movies(scanner);
        }
    }
}
