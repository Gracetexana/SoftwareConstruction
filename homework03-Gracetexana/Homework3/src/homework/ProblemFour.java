package homework;

import java.util.Scanner;

public class ProblemFour {

    /**
     * prompts a user for a date in YYYY/MM/DD format; prints the format in Month day, year format
     * @param args
     * no return
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a date as YYYY/MM/DD.");
        String date = scanner.nextLine();

        System.out.println(converter(date));
    }
    /**
     * takes a date in YYYY/MM/DD format and returns the format as Month day, year
     * @param numsFormat is the date in YYYY/MM/DD format
     * @return the date in month day, year format
     */
    public static String converter(String numsFormat){
        String stringFormat = "";

        String month = numsFormat.substring(5, 7);
        switch(month){
            case "01":
                stringFormat += "January ";
                break;
            case "02":
                stringFormat += "February ";
                break;
            case "03":
                stringFormat += "March ";
                break;
            case "04":
                stringFormat += "April ";
                break;
            case "05":
                stringFormat += "May ";
                break;
            case "06":
                stringFormat += "June ";
                break;
            case "07":
                stringFormat += "July ";
                break;
            case "08":
                stringFormat += "August ";
                break;
            case "09":
                stringFormat += "September ";
                break;
            case "10":
                stringFormat += "October ";
                break;
            case "11":
                stringFormat += "November ";
                break;
            case "12":
                stringFormat += "December ";
                break;
        }

        int day = Integer.valueOf(numsFormat.substring(8, 10));
        switch(day / 10){
            case 1:
                stringFormat += day + "th, ";
                break;
            default:
                switch(day % 10){
                    case 1:
                        stringFormat += day + "st, ";
                        break;
                    case 2:
                        stringFormat += day + "nd, ";
                        break;
                    case 3:
                        stringFormat += day + "rd, ";
                        break;
                    default:
                        stringFormat += day + "th, ";
                        break;
                }
        }

        String year = numsFormat.substring(0, 4);

        stringFormat += year;

        return stringFormat;
    }
}
