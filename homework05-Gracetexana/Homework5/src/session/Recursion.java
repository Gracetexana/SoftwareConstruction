package session;

/*
 * Grace Texana Long Torales
 * gtl1500@g.rit.edu
 */

public class Recursion {
    /**
     * prints the return value of 2 calls to function search(): 
     * first call uses array {1,2,3} with target 2; 
     * second call uses array {1,2,3} with target 4
     * @param args
     */
    public static void main(String[] args){
        int[] array = {2,9,10,12,21,36,37,38,39,41,56,57,77,79,83,93,98};
        System.out.println(binarySearch(array, 21));
        System.out.println(binarySearch(array, 79));
        System.out.println(binarySearch(array, 11));
        System.out.println(binarySearch(array, 2));
        System.out.println(binarySearch(array, 98));
    }

    /**
     * uses a while loop to print numbers from n to 0 as long as n is greater than 0
     * @param n is the number to be counted down from
     */
    public static void countDown(int n){
        while (n >= 0){
            System.out.println(n);
            n--;
        }
    }

    /**
     * uses recursion to print numbers from n to 0 as long as n is greater than 0
     * @param n is the number to be counted down from
     */
    public static void countDownRec(int n){
        if (n >= 0){
            System.out.println(n);
            countDownRec(n-1);
        }
    }

    /**
     * uses recursion to print numbers from 0 to n as long as n is greater than 0
     * @param n is the number to count up to
     */
    public static void countUp(int n){
        if (n==0){
            System.out.println(n);
        } else {
            countUp(n-1);
            System.out.println(n);
        }
    }

    /**
     * uses recursion to calculate the factorial of n
     * @param n is the number for which to calculate a factorial
     * @return returns the int result of n! (n factorial)
     */
    public static int factorial(int n){
        switch (n){
            case 0:
            case 1:
                return 1;
            default:
                return n * factorial(n-1);
        }
    }

    /**
     * returns the nth number in the fibonacci sequence according to F(n) = F(n-1) + F(n-2) when F(1) = 0 and F(2) = 1
     * @param n is the desired index in the fibonacci sequence
     * @return the nth number in the fibonacci sequence
     */
    public static int fibonacci(int n){
        switch (n){
            case 1:
                return 0;
            case 2:
                return 1;
            default:
                return fibonacci(n-1) + fibonacci(n-2);
                }
    }

    /**
     * searches array to determine whether target is in the array (returns true) or not (returns false)
     * @param array the array to be searched
     * @param target the value to be searched for within the array
     * @return true if target is in the area and false otherwise
     */
    public static boolean search(int[] array, int target){
        for (int x : array){
            if (x == target){
                return true;
            }
        }
        return false;
    }

    /**
     * using binary search, searches array to determine whether target is in the array (returns true) or not (returns false)
     * @param array the numberical array to be searched; array must be in ascending order
     * @param target the value to be searched for within the array
     * @return true if the target is in the area and false otherwise
     */
    public static boolean binarySearch(int[] array, int target){
        int low = 0;
        int high = array.length;
        int mid;
        while (true){
            mid = (low + high) / 2;
            if (array[mid] == target){
                return true;
            } else if (target > array[mid]){
                if (high - low < 2){
                    return false;
                }
                low = mid;
            } else{
                if (high - low < 2){
                    return false;
                }
                high = mid;
            }
        }
    }
}
