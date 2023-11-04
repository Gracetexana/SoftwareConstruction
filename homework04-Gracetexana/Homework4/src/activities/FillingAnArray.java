package activities;

import java.util.Scanner;

/*
 * Grace Texana Long Torales
 * gtl1500@g.rit.edu
 */
public class FillingAnArray {
    /**
     * prompts user to enter a number; calls arrayCreator to create an array of length number containing values of index*10 at each index; prints the numbers from the array
     * @param args
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = scanner.nextInt();
        int[] array = arrayCreator(number);

        for (int num : array){
            System.out.println(num);
        }
    }
    /**
     * returns an array of length number with contents starting at 0 at index 0 and increasing by 10 for each index
     * @param number determines the length of the array
     * @return an array of length number with contents starting at 0 at index 0 and increasing by 10 for each index
     */
    public static int[] arrayCreator(int number){
        int[] array = new int[number];

        for(int i=0; i<number; i++){
            array[i] = 10*i;
        }

        return array;
    }
}
