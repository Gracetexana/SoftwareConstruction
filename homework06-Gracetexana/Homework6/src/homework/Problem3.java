package homework;
/*
 * Grace Texana Long Torales
 * gtl1500@g.rit.edu
 */
import java.util.Scanner;

public class Problem3 {
    /**
     * prompts user for name and population of 5 countries; stores that data in 2 separate arrays; sorts the countries so that they are listed alphabetically and sorts their populations to follow suit; prints the data in a pleasing format
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

        }

        selectionSort(countries, populations);

        for (int i=0; i<5; i++){
            System.out.println(countries[i] + "'s population is " + populations[i]);
            totalPop += populations[i];
        }
    }

    /**
     * finds the index of the string in an array that comes first alphabetically
     * @param array the array to be searched
     * @param start the first index in the array to search
     * @return the index of the String that is first when listed in alphabetical order
     */
    public static int getMinIndex(String[] array, int start){
        int index = start;
        char min = array[start].charAt(0);
        for (int i=start; i<array.length; i++){
            if (array[i].charAt(0) < min){
                index = i;
                min = array[i].charAt(0);
            }
        }
        return index;
    }

    /**
     * swaps two values in one array and the corresponding values in another array
     * @param countries the array within which to swap values
     * @param populations the array within which to correspondingly swap values
     * @param a the index of the first value to swap
     * @param b the index of the second value to swap
     */
    public static void swap(String[] countries, int[] populations, int a, int b){
        String temp = countries[a];
        countries[a] = countries[b];
        countries[b] = temp;

        int temp2 = populations[a];
        populations[a] = populations[b];
        populations[b] = temp2;
    }

    /**
     * prints an array
     * @param array the array to be printed
     */
    public static void printArray(int[] array){
        for (int element : array){
            System.out.print(element + " ");
        }
        System.out.println();
    }

    /**
     * uses selection sort method to sort an array; in this case, selection sort = finding the String that comes first in the alphabet, putting it in the 0th position of the array, then doing the same thing for the String that comes second in the alphabet and the 1st position of the array, etc; orders another array in the same way
     * @param countries the array to be sorted alphabetically
     * @param populations the array that has corresponding information and should be sorted according to how countries is sorted
     */
    public static void selectionSort(String[] countries, int[] populations){
        for (int i=0; i<countries.length; i++){
            swap(countries, populations, i, getMinIndex(countries, i));
        }
    }
}
