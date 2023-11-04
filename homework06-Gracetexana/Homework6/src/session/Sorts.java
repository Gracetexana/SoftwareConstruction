package session;
/*
 * Grace Texana Long Torales
 * gtl1500@g.rit.edu
 */
public class Sorts {
    /**
     * used to test effectiveness of other functions
     * @param args
     */
    public static void main(String[] args){
        int[] array = SortUtilities.makeArray(10);
        SortUtilities.printArray(array);
        SelectionSort(array);
        SortUtilities.printArray(array);
    }

    /**
     * sorts an array by 1) iterating over the whole array looking for the minimum, 2) placing the minimum at the start of the array, then 3) excluding the first element and repeating until the array is sorted
     * @param array is the array to be sorted
     */
    public static void SelectionSort(int[] array){
        for (int i=0; i<array.length; i++){
            int min = array[i];
            int index = i;
            for (int j=i+1; j<array.length; j++){
                if (array[j] < min){
                    min = array[j];
                    index = j;                    
                }
            }
            array[index] = array[i];
            array[i] = min;
        }        
    }
}
