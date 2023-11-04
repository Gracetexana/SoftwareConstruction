package homework;
/*
 * Grace Texana Long Torales
 * gtl1500@g.rit.edu
 */
import java.util.Random;

public class SortFunctions {
    private static Random random = new Random();
    
    /**
     * creates a random array of length size with values no greater than size
     * @param size the length of the array and the maximum value of the elements in the array
     * @return an array of length size with values no greater than size
     */
    public static int[] makeArray(int size){
        int[] array = new int[size];
        for (int i=0; i<size; i++){
            array[i] = random.nextInt(size+1);
        }
        return array;
    }

    /**
     * finds the index of the maximum value in an array starting from index start
     * @param array the array to be searched
     * @param start the first index in the array to search
     * @return the index of the maximum value in the array
     */
    public static int getMaxIndex(int[] array, int start){
        int index = start;
        int max = array[start];
        for (int i=start; i<array.length; i++){
            if (array[i] > max){
                index = i;
                max = array[i];
            }
        }
        return index;
    }

    /**
     * swaps two values in an array
     * @param array the array within which to swap values
     * @param a the index of the first value to swap
     * @param b the index of the second value to swap
     */
    public static void swap(int[] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
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
