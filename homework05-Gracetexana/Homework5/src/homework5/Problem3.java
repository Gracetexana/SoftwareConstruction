package homework5;
/*
 * Grace Texana Long Torales
 * gtl1500@g.rit.edu
 */
public class Problem3 {
    /**
     * prints the value returned by calling function multiplication(x,y) with arguments x=5 and y=4
     * @param args
     */
    public static void main(String[] args){
        System.out.println(multiplication(5, 4));
    }
    /**
     * uses recursion to multiply x and y by adding y together x number of times
     * @param x is the number of times to add y together
     * @param y is the number being added together x number of times
     * @return the product of x and y
     */
    public static int multiplication(int x, int y){
        switch (x){
            case 0: return 0;
            case 1: return y;
            default: 
                return y + multiplication(x-1, y);
        }
    }
}
