/*
* Grace Texana Long Torales
* gtl1500@g.rit.edu
*/

package session;

public class AGenericMethod {
    public static void main(String[] args){
        System.out.println("This is without using Generic");
        int[] array = new int[]{3,5,8,6,0};
        printArray(array);

        System.out.println("This is using the Generic");
        Integer[] integerArray = new Integer[]{6,9,2,6,4,3};
        Double[] doubleArray = new Double[]{1.6,9.5,7.1,6.3};
        Character[] characterArray = new Character[]{'A','I','C','P'};
        printArrayGeneric(integerArray);
        printArrayGeneric(doubleArray);
        printArrayGeneric(characterArray);
    }
    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static <T> void printArrayGeneric(T[] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
