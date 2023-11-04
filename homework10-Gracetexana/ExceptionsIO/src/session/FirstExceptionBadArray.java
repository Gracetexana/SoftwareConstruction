package session;
/*
 * Grace Texana Long Torales
 * gtl1500@g.rit.edu
 */

public class FirstExceptionBadArray {
    /**
     * create an array with 3 elements then refer to a fourth element so that the program throws an exception
     * @param args
     */
    public static void main(String[] args){
        int[] badArray = {0, 1, 2};
        try{
            System.out.println(badArray[4]);
        }
        // this catch block is executed because it is the first block that matches the situation
        catch (IndexOutOfBoundsException e){
            System.out.println("Index Out of Bounds");
        }
        // this catch block is not executed because the one before is already executed
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
