package homework;
/*
 * Grace Texana Long Torales
 * gtl1500@g.rit.edu
 */
import java.util.Arrays;

public class Problem2 extends SortFunctions{
    /**
     * randomly creates an array, displays it before sorting, sorts using mergeSort function, displays array after sorting
     * @param args
     */
    public static void main(String[] args){
        int[] array = makeArray(100);
        printArray(array);
        array = mergeSort(array);
        printArray(array);
    }
    
    /**
     * recursively splits an array in half until it is only one element long, recombines each split so that the result is in ascending order
     * @param array the array to be sorted
     * @return a sorted array
     */
    public static int[] mergeSort(int[] array){
        switch (array.length){
            case 1:
                return array;
            default:
                int[] firstHalf = Arrays.copyOfRange(array, 0, array.length/2);
                firstHalf = mergeSort(firstHalf);

                int[] secondHalf = Arrays.copyOfRange(array, array.length/2, array.length);
                secondHalf = mergeSort(secondHalf);

                int[] results = mergeArrays(firstHalf, secondHalf);
                
                return results;
        }        
    }

    /**
     * merges two arrays so that the result is in ascending order
     * @param array1 first array to be merged
     * @param array2 second array to be merged
     * @return resulting array that is the two arrays combined and in ascending order
     */
    public static int[] mergeArrays(int[] array1, int[] array2){
        int[] results = new int[array1.length + array2.length];
        int index1=0; //keep track of place in array1
        int index2=0; //keep track of place in array2

        for (int k=0; k<results.length; k++){

            if (index1 > array1.length-1){ //if all values from array1 have already been added to results
                results[k] = array2[index2];
                index2++; //move through array2
            } else if (index2 > array2.length-1){ //if all values from array2 have already been added to results
                results[k] = array1[index1];
                index1++; //move through array1
            } else if (array1[index1] < array2[index2]){ //figure out which array has the smallest number next
                results[k] = array1[index1];
                index1++; //move through array1
            } else{
                results[k] = array2[index2];
                index2++; //move through array2
            }
        }
        return results;
    }
}
