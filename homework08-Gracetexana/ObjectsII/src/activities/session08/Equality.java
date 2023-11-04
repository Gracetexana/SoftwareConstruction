package activities.session08;
/*
 * Grace Texana Long Torales
 * gtl1500@g.rit.edu
 */

public class Equality {

    /**
     * creates several variables of types int and double to compare to each other using ==; prints out the comparisons; also compare and print variables to literals and literals to literals
     * @param args
     */
    public static void main(String[] args){
        int intVar1 = 2;
        int intVar2 = 2;
        double doubleVar1 = 2.0;
        double doubleVar2 = 2.0;
        
        // Comparing variables of the same type
        System.out.println("Comparing variables of the same type:\n"); 
                    
        System.out.println(intVar1 + " (intVar1) and " + intVar2 + " (intVar2) are " + ((intVar1 == intVar2) ? "": "not ") + "equal");

        System.out.println(doubleVar1 + " (doubleVar1) and " + doubleVar2 + " (doubleVar2) are " + ((doubleVar1 == doubleVar2) ? "": "not ") + "equal");

        System.out.println();
        System.out.println();

        // Comparing numeric variables of different types
        System.out.println("Comparing numeric variables of different types:\n");
                    
        System.out.println(intVar1 + " (intVar1) and " + doubleVar2 + " (doubleVar2) are " + ((intVar1 == doubleVar2) ? "": "not ") + "equal");

        System.out.println();
        System.out.println();

        // Comparing numeric variables and literals of the same type
        System.out.println("Comparing numeric variables and literals of the same type:\n");
                    
        System.out.println(intVar1 + " (intVar1) and " + 2 + " (int) are " + ((intVar1 == 2) ? "": "not ") + "equal");
                    
        System.out.println(doubleVar1 + " (doubleVar1) and " + 2.0 + " (double) are " + ((doubleVar1 == 2.0) ? "": "not ") + "equal");

        System.out.println();
        System.out.println();

        // Comparing numeric variables and literals of different types
        System.out.println("Comparing numeric variables and literals of different types:\n");
                    
        System.out.println(intVar1 + " (intVar1) and " + 2.0 + " (double) are " + ((intVar1 == 2.0) ? "": "not ") + "equal");
                    
        System.out.println(doubleVar1 + " (doubleVar1) and " + 2 + " (int) are " + ((doubleVar1 == 2) ? "": "not ") + "equal");

        System.out.println();
        System.out.println();

        // Comparing numeric literals to each other
        System.out.println("Comparing numeric literals to each other:\n");
                    
        System.out.println(2.0 + " (double) and " + 2 + " (int) are " + ((2.0 == 2) ? "": "not ") + "equal");
                    
        System.out.println(2.1 + " (double) and " + 2 + " (int) are " + ((2.1 == 2) ? "": "not ") + "equal");
    }
}
