package activities.session03;
import java.util.Scanner;

public class Week {
    public static void main(String[] args){
        /**
         * This method prompts user for an integer to represent a day of the week, then prints out the day or an error message.
         * 
         * no params
         * 
         * no returns
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the day.");
        int input = scanner.nextInt();

        String day = whichDay(input);

        if (day == null){
            System.out.println("That is not a valid day.");
        } else{
            System.out.println("It is " + day);
        }
    }

    public static String whichDay(int input){
        /**
         * This method converts an int between 0 and 6 to a day of the week (Monday to Sunday)
         * 
         * @param input is an int
         * 
         * @returns a corresponding day of the week or a message that the input was invalid
         */
        switch(input){
            case 0:
                return "Monday.";
            case 1:
                return "Tuesday.";
            case 2:
                return "Wednesday.";
            case 3:
                return "Thursday.";
            case 4:
                return "Friday.";
            case 5:
                return "Saturday.";
            case 6:
                return "Sunday.";
            default:
                return null;
        }
    }
}
