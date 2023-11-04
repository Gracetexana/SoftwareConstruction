package homework5;
/*
 * Grace Texana Long Torales
 * gtl1500@g.rit.edu
 */
public class Problem2 {
    /**
     * calls sign() with an argument of 5 to print "No Parking" 5 times
     * @param args
     */
    public static void main(String[] args){
        sign(5);
    }

    /**
     * uses recursion to print "No Parking" n number of times
     * @param n is the number of times to print "No Parking"
     */
    public static void sign(int n){
        if (n > 0){
            System.out.println("No Parking");
            sign(n-1);
        }
    }
}
