package homework5;
/*
 * Grace Texana Long Torales
 * gtl150@g.rit.edu
 */
public class Problem4 {
    /**
     * prints the value returned by calling function pyramidSum(50)
     * @param args
     */
    public static void main(String[] args){
        System.out.println(pyramidSum(50));
    }
    
    /**
     * sums all ints from 0 to n
     * @param n is the max number added to the sum
     * @return the sum of all ints from 0 to n
     */
    public static int pyramidSum(int n){
        switch (n){
            case 0: return 0;
            default: return n + pyramidSum(n-1);
        }
    }
}
