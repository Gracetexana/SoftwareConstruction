public class Exercise1 {
    
    /**
     * prints the results of SumDivisions(1), SumDivisions(5), and SumDivisions(10)
     * @param args
     */
    public static void main(String[] args){
        System.out.println(SumDivisions(1));
        System.out.println(SumDivisions(5));
        System.out.println(SumDivisions(10));
    }

    /**
     * takes as input (n) a number bigger than zero and strictly positive, then calculates the following sum = 1 + 1/2 + 1/3 + 1/4 + ..... + 1/n.
     * @param n an integer
     * @return the sum of 1 + 1/2 + 1/3 ... + 1/n
     */
    public static float SumDivisions(int n){
        float sum = 0;
        for (int i=1; i<=n; i++){
            sum += (1.0/i);
        }

        return sum;
    }
}
