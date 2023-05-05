import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Question1<T extends Comparable> {
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
                
                a[minIndex] = a[len-1];
                a[len-1] = min;
                len--;
            }

            return result;
        }        
    }

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
