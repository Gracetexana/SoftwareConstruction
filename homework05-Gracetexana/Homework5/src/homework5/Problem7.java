package homework5;

import java.util.Arrays;

public class Problem7 {
    /**
     * demonstrates the function countChar() by using the same array as an argument 4 different times along with 4 different chars that each appear a different number of times within the array 
     * @param args
     */
    public static void main(String[] args){
        char[] array = {'a','b','c','a','b','a'};
        System.out.println(countChar(array, 'a'));
        System.out.println(countChar(array, 'b'));
        System.out.println(countChar(array, 'c'));
        System.out.println(countChar(array, 'd'));
    }

    /**
     * counts the number of times target appears in array
     * @param array an array of chars
     * @param target the char that is being counted within the area
     * @return the number of times char appears in array
     */
    public static int countChar(char[] array, char target){
        switch (array.length){
            case 0:
                return 0;
            default:
                int add = (array[0] == target)? 1: 0;
                
                return add + countChar(Arrays.copyOfRange(array, 1, array.length), target);
        }
    }
}
