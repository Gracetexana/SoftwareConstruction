package session;
/*
 * Grace Texana Long Torales
 * gtl1500@g.rit.edu
 */

import java.util.Random;

public class SortUtilities {
    private static Random RNG = new Random();

    /**
     * determines whether an array of ints is sorted in ascending order
     * @param array is the array to be analyzed
     * @return true if the array is in ascending order or false if it is not
     */
    public static boolean sorted(int[] array){
        for (int i=0; i<array.length-1; i++){
            if (array[i] > array[i+1]){
                return false;
            }
        }
        return true;
    }

    /**
     * swaps array elements at index a and index b
     * @param array the array in which to swap elements
     * @param a the first element to be swapped
     * @param b the second element to be swapped
     */
    public static void swap(int[] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    /**
     * creates an array of size size with elements no greater than size
     * @param size the size of the array and the maximum value that each element in the array can have
     * @return an array with size elements no greater than size in value
     */
    public static int[] makeArray(int size){
        int[] array = new int[size];
        for (int i=0; i<size; i++){
            array[i] = RNG.nextInt(size+1);
        }
        return array;
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
}
