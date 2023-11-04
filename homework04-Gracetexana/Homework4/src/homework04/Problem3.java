package homework04;

import java.util.Scanner;
/*
 * Grace Texana Long Torales
 * gtl1500@g.rit.edu
 */
public class Problem3 {
    /**
     * prompts user for name and population of 5 countries; stores that data in 2 separate arrays; prints the data in a pleasing format; calculates and prints the average population of the countries
     * @param args
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] countries = new String[5];

        int[] populations = new int[5];

        String country;
        int population;
        int totalPop = 0;
        for (int i=0; i<5; i++){
            System.out.println("Name a country");
            country = scanner.next();
            countries[i] = country;

            System.out.println("What is that country's population?");
            population = scanner.nextInt();
            populations[i] = population;

            totalPop += population;
        }

        double average = totalPop/5.0;

        for (int i=0; i<5; i++){
            System.out.println(countries[i] + "'s population is " + populations[i]);
            totalPop += populations[i];
        }

        System.out.println("The average population of the countries is " + average);
    }
}
