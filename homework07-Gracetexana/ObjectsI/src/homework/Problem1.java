package homework;
/*
 * Grace Texana Long Torales
 * gtl1500@g.rit.edu
 */

import java.util.Random;

public class Problem1 {
    
    /**
     * create an array of specified size, print it, and sort the printed array
     * @param args
     */
    public static void main(String[] args){
        int[] array = makeArray(100);
        printArray(array);
        System.out.println();
        printArray(quickSort(array, array.length));
    }
    
    /**
     * creates a random array of length size with values no greater than size
     * @param size the length of the array and the maximum value of the elements in the array
     * @return an array of length size with values no greater than size
     */
    public static int[] makeArray(int size){
        Random random = new Random();

        int[] array = new int[size];
        for (int i=0; i<size; i++){
            array[i] = random.nextInt(size+1);
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

    /**
     * use quicksorting to sort an array in descending order
     * @param array the array to be sorted
     * @param len the length of the filled positions within the array (important for recursion)
     * @return an array sorted in descending order
     */
    public static int[] quickSort(int[] array, int len){
        switch (len){
            case 0:
                return new int[0];
            case 1:
                return array;
            default:
                // pivot is first element in array
                int pivot = array[0];

                // arrays to hold the elements that are greater than, equal to, or less than the pivot, respectively
                // must each be the length of the original array in case all items in the original array go to only one of them
                int[] greater=new int[len], equal=new int[len], less=new int[len];
                
                // indexes used to step through each of the respective arrays above in the following for loop
                int greaterIndex=0, equalIndex=0, lessIndex=0;

                // iterate through original array
                for (int i=0; i<len; i++){

                    // sort elements from original array into greater, equal, or less
                    if (array[i] > pivot){
                        greater[greaterIndex] = array[i];
                        greaterIndex++;

                    } else if(array[i] == pivot){
                        equal[equalIndex] = array[i];
                        equalIndex++;

                    } else{
                        less[lessIndex] = array[i];
                        lessIndex++;
                    }
                }

                // recursively sort greater and less (equal does not need sorting)
                int[] greaterSorted = quickSort(greater, greaterIndex);
                int[] lessSorted = quickSort(less, lessIndex);

                // create result array
                int[] result = new int[len];
                for (int i=0; i<len; i++){

                    // items from greaterSorted are added first
                    if (i < greaterIndex){
                        result[i] = greaterSorted[i];

                    // next, items from equal are added
                    } else if (i < (greaterIndex + equalIndex)){
                        result[i] = equal[i - greaterIndex];

                    // finally, items from lessSorted are added
                    } else{
                        result[i] = lessSorted[i -equalIndex - greaterIndex];
                    }
                }

                return result;
        }
    }
}
