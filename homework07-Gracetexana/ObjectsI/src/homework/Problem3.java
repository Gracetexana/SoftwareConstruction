package homework;
/*
 * Grace Texana Long Torales
 * gtl1500@g.rit.edu
 */

public class Problem3 {
    String name;
    String symbol;
    int atomicNumber;
    double atomicWeight;

    /**
     * creates an element from the periodic table
     * @param name the name of the element
     * @param symbol the symbol of the element
     * @param atomicNumber the atomic number of the element
     * @param atomicWeight the atomic weight of the element
     */
    public Problem3(String name, String symbol, int atomicNumber, double atomicWeight){
        this.name = name;
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
        this.atomicWeight = atomicWeight;
    }

    /**
     * creates an array of 10 elements (class Problem3) and prints out their information
     * @param args
     */
    public static void main(String[] args){
        // add elements to an array to make printing easier
        Problem3[] elements = {
            new Problem3("Hydrogen", "H", 1, 1.008),

            new Problem3("Helium", "He", 2, 4.0026),

            new Problem3("Lithium", "Li", 3, 6.94),

            new Problem3("Beryllium", "Be", 4, 9.0122),

            new Problem3("Boron", "B", 5, 10.81),

            new Problem3("Carbon", "C", 6, 12.011),

            new Problem3("Nitrogen", "N", 7, 14.007),

            new Problem3("Oxygen", "O", 8, 15.999),

            new Problem3("Fluorine", "F", 9, 18.998),

            new Problem3("Neon", "Ne", 10, 20.180)
        };

        for (Problem3 element : elements){
            System.out.println(element);
        }
    }

    /**
     * returns the name of the element
     * @return the name of the element
     */
    public String getName(){
        return name;
    }

    /**
     * returns the symbol of the element
     * @return the symbol of the element
     */
    public String getSymbol(){
        return symbol;
    }

    /**
     * returns the atomic number of the element
     * @return the atomic number of the element
     */
    public int getAtomicNumber(){
        return atomicNumber;
    }

    /**
     * returns the atomic weight of the element
     * @return the atomic weight of the element
     */
    public double getAtomicWeight(){
        return atomicWeight;
    }

    /**
     * changes the name of the element
     * @param newName the new name of the element
     */
    public void setName(String newName){
        name = newName;
    }

    /**
     * changes the symbol of the element
     * @param newSymbol the new symbol of the element
     */
    public void setSymbol(String newSymbol){
        symbol = newSymbol;
    }

    /**
     * returns a String representation of the element
     */
    public String toString(){
        return name + ": " + symbol + "\nAtomic Number: " + atomicNumber + "\nAtomic Weight: " + atomicWeight + "\n";
    }
}
