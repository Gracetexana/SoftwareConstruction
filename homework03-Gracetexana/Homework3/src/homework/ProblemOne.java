package homework;

import java.util.Scanner;

public class ProblemOne {
    public static void main(String[] args){
        /**
         * Prompts user to input age until user inputs age over 0; calls response method to determine appropriate response
         * 
         * no params
         * 
         * no returns
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        while (age<0){
            System.out.println("Impossible. Enter your age.");
            age = scanner.nextInt();
        }

        System.out.println(response(age));
    }

    public static String response(int age){
        /**
         * returns appropriate String response depending on age param
         * 
         * @param age is user age as an int
         * 
         * @returns response based on age
         */
        if (age<10){
            return "Is this your first program?";
        } else if (age<13){
            return "A tween!";
        } else if (age<20){
            return "A teen!";
        } else if (age<30){
            return "A twenty-something!";
        } else{
            return "With age comes experience.";
        }
    }
}
