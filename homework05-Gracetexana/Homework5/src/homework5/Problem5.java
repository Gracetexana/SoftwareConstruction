package homework5;
/*
 * Grace Texana Long Torales
 * gtl1500@g.rit.edu
 */
public class Problem5 {
    
    /**
     * demonstrates the function power(base, exp) 4 times by printing out the results of calling the funciton 4 times, using base=3 and exp=0, 1, 2, and 3 respectively
     * @param args
     */
    public static void main(String[] args){
        System.out.println(power(3, 0));
        System.out.println(power(3, 1));
        System.out.println(power(3, 2));
        System.out.println(power(3, 3));
    }
    /**
     * raises base to the power of exp
     * @param base the number (int) to be raised
     * @param exp the number representing the power to which to raise the base; must be a nonnegative integer
     * @return base^exp
     */
    public static int power(int base, int exp){
        switch (exp){
            case 0: return 1;
            default:
                return base * power(base, exp-1);
        }
    }
}
