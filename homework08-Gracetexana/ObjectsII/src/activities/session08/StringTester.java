package activities.session08;
/*
 * Grace Texana Long Torales
 * gtl1500@g.rit.edu
 */

import java.util.Scanner;

public class StringTester {
    
    /**
     * assigns 3 variables to string literals, 2 of which having the same characters; compares the variables using == and prints out the results; reassigns the matching variables to new Strings; compares all the variables using == and prints out the results; 
     * 
     * prompts a user to enter 2 new Strings and compares them using ==
     * 
     * compares four objects of the Car class using ==; counts the number of Cars made before and after the creation of each Car
     * @param args
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String x = "Buttercup";
        String y = "Buttercup";
        String z = "Thunder";

        // comparisons between first set of variables
        System.out.println("First set of variables:\n");
                    
        System.out.println(x + " (x) and " + y + " (y) are " + ((x == y) ? "": "not ") + "equal");     
        System.out.println(x + " (x) and " + z + " (z) are " + ((x == z) ? "": "not ") + "equal");
        System.out.println(z + " (z) and " + y + " (y) are " + ((z == y) ? "": "not ") + "equal");

        x = new String("Buttercup");
        y = new String("Buttercup");

        System.out.println();
        System.out.println();

        // comparisons between second set of variables
        System.out.println("Second set of variables:\n");

        System.out.println(x + " (x) and " + y + " (y) are " + ((x == y) ? "": "not ") + "equal");     
        System.out.println(x + " (x) and " + z + " (z) are " + ((x == z) ? "": "not ") + "equal");
        System.out.println(z + " (z) and " + y + " (y) are " + ((z == y) ? "": "not ") + "equal");

        System.out.println();
        System.out.println();

        // user entries
        // System.out.println("Enter a string.");
        // String first = scanner.nextLine();

        // System.out.println("Enter another string.");
        // String second = scanner.nextLine();

        // System.out.println(first + " and " + second + " are " + ((first == second) ? "": "not ") + "equal");
        
        // System.out.println();
        // System.out.println();

        // car comparison
        System.out.println("Number of cars: " + Car.getCAR_COUNT()); // 0 cars before any car creation
        System.out.println();

        Car car1 = new Car("Subaru", "Exiga", 2012, "black", "idkthevin");
        System.out.println("Car 1:\n" + car1);
        System.out.println("Number of cars: " + Car.getCAR_COUNT()); // 1 car
        System.out.println();

        Car car2 = new Car("Subaru", "Exiga", 2012, "black", "idkthevin");
        System.out.println("Car 2:\n" + car2);
        System.out.println("Number of cars: " + Car.getCAR_COUNT()); // 2 cars
        System.out.println();

        Car car3 = car2;
        System.out.println("Car 3:\n" + car3);
        System.out.println("Number of cars: " + Car.getCAR_COUNT()); // still 2 cars because car3 is just a copy of car2
        System.out.println();

        Car car4 = new Car("Honda", "Civic", 2005, "red", "anothermystery");
        System.out.println("Car 4:\n" + car4);
        System.out.println("Number of cars: " + Car.getCAR_COUNT()); // 3 cars
        System.out.println();

        System.out.println();

        // first comparison of cars
        System.out.println("First Test:\n");

        System.out.println("Car 1: " + car1 + "\nand\nCar 2: " + car2 + "\nare " + ((car1 == car2) ? "": "not ") + "equal");

        System.out.println();

        // second comparison of cars
        System.out.println("Second Test:\n");

        System.out.println("Car 2: " + car2 + "\nand\nCar 3: " + car3 + "\nare " + ((car2 == car3) ? "": "not ") + "equal");

        System.out.println();

        // third comparison of cars
        System.out.println("Third Test:\n");

        System.out.println("Car 1: " + car1 + "\nand\nCar 2: " + car2 + "\nare " + ((car1.equals(car2)) ? "": "not ") + "equal");

        System.out.println();

        // fourth comparison of cars
        System.out.println("Fourth Test:\n");

        System.out.println("Car 1: " + car1 + "\nand\nCar 4: " + car4 + "\nare " + ((car1.equals(car4)) ? "": "not ") + "equal");
    }
}
