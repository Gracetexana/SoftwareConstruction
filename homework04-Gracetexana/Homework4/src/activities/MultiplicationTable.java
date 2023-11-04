package activities;
/*
 * Grace Texana Long Torales
 * gtl1500@g.rit.edu
 */
public class MultiplicationTable {
    /**
     * creates a 10x10 multiplication table as a 2d array; prints the multiplicaiton table in a readable format
     * @param args
     */
    public static void main(String[] args){
        int[][] table = new int[10][10];

        for (int i=0; i<10; i++){
            for (int j=0; j<10; j++){
                table[i][j] = (i+1)*(j+1);
                
                if (table[i][j] < 10){
                    System.out.print(" ");
                }

                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}
