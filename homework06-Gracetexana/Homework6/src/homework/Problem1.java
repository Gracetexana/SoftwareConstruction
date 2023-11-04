package homework;
/*
 * Grace Texana Long Torales
 * gtl1500@g.rit.edu
 */
public class Problem1 extends SortFunctions{

    /**
     * creates a randomly generated array and prints it before and after being sorted
     * @param args
     */
    public static void main(String[] args){
        int[] array = makeArray(10);
        printArray(array);
        selectionSort(array);
        printArray(array);
    }

    /**
     * uses selection sort method to sort an array; selection sort = getting the largest (or smallest) value, putting it in the 0th position of the array, then doing the same thing for the second largest value and the 1st position of the array, etc
     * @param array the array to be sorted
     */
    public static void selectionSort(int[] array){
        for (int i=0; i<array.length; i++){
            swap(array, i, getMaxIndex(array, i));
        }
    }
}
