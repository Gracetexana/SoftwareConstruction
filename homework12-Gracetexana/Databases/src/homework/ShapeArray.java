package homework;
/*
* Grace Texana Long Torales
* gtl1500@g.rit.edu
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class ShapeArray {
    /**
     * asks user for desired size of array between 2 and 20
     * throws an exception if the given size is not between 2 and 20
     * creates an array of shapes of that size
     * prints the shapes from that array
     * sorts the array using sortShape() method
     * prints sorted array
     * uses findShape() to search array -- first for a random shape, then for the first shape in the array -- then prints the results
     * @param args
     */
    public static void main(String[] args){
        
        Shape[] shapes;

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        while (true){
            try{
                int size = 0;
                System.out.println("Enter the size of your array of shapes.");
                size = Integer.parseInt(input.readLine());
                System.out.println();
                shapes = createArray(size);
                input.close();
                break;
            } 
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Unsorted\n");
        for (Shape shape : shapes){
            System.out.println(shape);
        }

        shapes = sortShape(shapes, shapes.length);

        System.out.println("Sorted\n");
        for (Shape shape : shapes){
            System.out.println(shape);
        }

        System.out.println((findShape(shapes, randomShape())) ? "The random shape is in this array." : "The random shape is not in this array");

        System.out.println((findShape(shapes, shapes[0])) ? "shapes[0] is in this array." : "shapes[0] is not in this array");
    }

    /**
     * creates an array of size size containing random shapes
     * throws an exception if given size is less than 2 or greater than 20
     * @param size
     * @return
     * @throws CustomException
     */
    public static Shape[] createArray(int size) throws CustomException{
        if (size < 2 || 20 < size){
            throw new CustomException("Array size must be between 2 and 20!");
        } else{
            // fill array shapes with randomly generated shapes
            Shape[] shapes = new Shape[size];
            for (int i=0; i<size; i++){
                shapes[i] = randomShape(); 
            }
            return shapes;
        }
    }

    /**
     * returns a random color out of 10 colors listed
     * @return a random color
     */
    public static String randomColor(){
        Random random = new Random();

        switch (random.nextInt(10)){
            case 0:
                return "red";
            case 1:
                return "orange";
            case 2:
                return "yellow";
            case 3:
                return "green";
            case 4:
                return "blue";
            case 5:
                return "indigo";
            case 6:
                return "violet";
            case 7:
                return "black";
            case 8:
                return "grey";
            default:
                return "white";
        }
    }

    /**
     * returns a circle, triangle, or rectangle, with each of their parameters in turn randomly generated
     * @return a circle, triangle, or rectangle
     */
    public static Shape randomShape(){
        Random random = new Random();

        // randomly generate Shape parameters
        int x = random.nextInt(100);
        int y = random.nextInt(100);
        Position pos = new Position(x, y);
        String fillColor = randomColor();
        String lineColor = randomColor();
        double measurement1 = random.nextInt(10000)/100.0;

        // randomly decide which shape to create
        switch (random.nextInt(3)){
            case 0:
                return new Circle(pos, fillColor, lineColor, measurement1);
            case 1:
                return new Triangle(pos, fillColor, lineColor,  measurement1);
            default:
                double measurement2 = random.nextInt(10000)/100.0;
                return new Rectangle(pos, fillColor, lineColor,  measurement1,  measurement2);
        }
    }

    /**
     * recursively sorts shapes from smallest to largest area using Quicksort
     * @param shapes the array of shapes to be sorted
     * @param until how many slots in the array actually contain shapes (necessary for recursion)
     * @return shapes after being sorted
     */
    public static Shape[] sortShape(Shape[] shapes, int until){
        // recursion
        switch (until){
            case 0: // base case: 0 non-null objects in shapes OR,
            case 1: // base case: 1 non-null object in shapes
                return shapes;
            default:
                        
                // shapes will be sorted pivoting around area of first shape in shapes
                double pivot = shapes[0].getArea();

                // ideally, I would use ArrayLists, but since the question says to return an array, I will use counters for each of the arrays to track how full the array is
                int lessCounter = 0;
                int equalCounter = 0;
                int greaterCounter = 0;

                // arrays that the shapes will be sorted into -- each must be the same length as shapes because all Shapes in shapes might go into only one of the arrays
                Shape[] lessThan = new Shape[until];
                Shape[] equalTo = new Shape[until];
                Shape[] greaterThan = new Shape[until];

                // check each non-null element in shapes
                for (int i=0; i<until; i++){
                    double area = shapes[i].getArea();

                    
                    // lessThan will contain shapes with areas less than pivot
                    if (area < pivot){
                        lessThan[lessCounter] = shapes[i];
                        lessCounter ++;

                    // greaterThan will contain shapes with areas greater than pivot
                    } else if (area > pivot){
                        greaterThan[greaterCounter] = shapes[i];
                        greaterCounter ++;

                    // equalTo will contain shapes with areas equal to pivot
                    } else {
                        equalTo[equalCounter] = shapes[i];
                        equalCounter ++;
                    }
                }

                // recursively sort
                lessThan = sortShape(lessThan, lessCounter); 
                greaterThan = sortShape(greaterThan, greaterCounter);

                // fill in result with sorted arrays
                int j = 0;

                // first add elements from lessThan
                for (int k=0; k<lessCounter; k++){
                    shapes[j] = lessThan[k];
                    j++;
                }

                // next add elements from equalTo
                for (int k=0; k<equalCounter; k++){
                    shapes[j] = equalTo[k];
                    j++;
                }

                // finally add elements from greaterThan
                for (int k=0; k<greaterCounter; k++){
                    shapes[j] = greaterThan[k];
                    j++;
                }

                return shapes;

        }

    }

    /**
     * determines whether shape is contained in shapes
     * uses bisection search
     * @param shapes the array to be searched (must be sorted)
     * @param shape the shape being sought
     * @return true if the shape is contained in shapes, false if not
     */
    public static boolean findShape(Shape[] shapes, Shape shape){
        double target = shape.getArea();

        int low = 0;
        int high = shapes.length - 1;
        int mid;

        while (low <= high){
            mid = (high + low) / 2;
            double area = shapes[mid].getArea();

            if (shapes[mid].equals(shape)){
                return true;

            } else if (target > area){
                low = mid + 1;

            } else {
                high = mid - 1;
            }
        }

        return false;
    }
}
