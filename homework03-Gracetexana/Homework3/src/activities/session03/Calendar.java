package activities.session03;

import java.util.Scanner;

public class Calendar {
    public static void main(String[] args){
        /**
         * Prompts user to enter a day of the month; prints the number entered with the appropriate suffix
         * 
         * no params
         * 
         * no returns
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day of the month: ");
        int input = scanner.nextInt();

        String suffix = suffix(input);

        if (suffix == null){
            System.out.println("Not a valid input.");
        } else{
            System.out.println("It is the " + input + suffix + ".");
        }        
    }
    public static String suffix
    (int dayOfTheMonth){
        /**
         * Returns the correct suffix (as a String) of each int between 1 and 31, inclusive
         * 
         * @param dayOfTheMonth is the number for which a suffix is desired
         * 
         * @returns either "st", "nd", "rd", or "th" depending on dayOfTheMonth
         */
        if (dayOfTheMonth > 31 || dayOfTheMonth < 1){
            return null;
        }
        switch(dayOfTheMonth / 10){
            case 1:
                return "th";
            default:
                switch(dayOfTheMonth % 10){
                    case 1:
                        return "st";
                    case 2:
                        return "nd";
                    case 3:
                        return "rd";
                    default:
                        return "th";
                }
        }
    }
}
