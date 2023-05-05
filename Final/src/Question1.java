/*
* Grace Texana Long Torales
* gtl1500@g.rit.edu
*/

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Question1<T extends Comparable> {
    /**
     * takes into argument one unsorted array to sort
     * @param a the array to be sorted
     * @return a new array that is the sorted version of the old
     * @throws Exception if the array is empty
     */
    public T[] part1(T[] a) throws Exception{
        int len = a.length;

        if (len == 0){
            throw new Exception("The array is empty");

        } else{
            T[] result = (T[]) Array.newInstance(a.getClass(), len);

            for (int i=0; i<a.length; i++){
                T min = a[0];
                int minIndex = 0;

                for (int j=1; j<len; j++){
                    if (min.compareTo(a[j]) > 0){
                        min = a[j];
                        minIndex = j;
                    }
                }

                result[i] = min;
                
                // the instructions did not say that the original array had to remain as is. This makes it easier for me to iterate through
                a[minIndex] = a[len-1];
                a[len-1] = min;
                len--;
            }

            return result;
        }        
    }

    /**
     * sorts an array and returns the sorted version of that array
     * @param a the array to be  sorted
     * @return the sorted array
     * @throws Exception if the array is empt
     */
    public T[] part2(T[] a) throws Exception{
        int len = a.length;

        if (len == 0){
            throw new Exception("The array is empty");

        } else{
            for (int i=0; i<len; i++){
                T max = a[0];
                int maxIndex = 0;

                for (int j=1; j<len; j++){
                    if (max.compareTo(a[j]) < 0){
                        max = a[j];
                        maxIndex = j;
                    }
                }

                a[maxIndex] = a[len-1];
                a[len-1] = max;
                len--;
            }

            return a;
        }      
    }

    /**
     * sorts an array but returns it as a sorted ArrayList
     * @param a the array to be sorted
     * @return a sorted ArrayList with all the same elements as a
     * @throws Exception if the array is empty
     */
    public ArrayList<T> part3(T[] a) throws Exception{
        int len = a.length;

        if (len == 0){
            throw new Exception("The array is empty");

        } else{
            ArrayList<T> result = new ArrayList<>();
            Collections.sort(result);

            return result;
        }        
    }
}
