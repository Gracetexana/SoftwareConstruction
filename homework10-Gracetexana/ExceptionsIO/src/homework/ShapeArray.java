package homework;
/*
 * Grace Texana Long Torales
 * gtl1500@g.rit.edu
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public class ShapeArray {
    /**
     * creates an array of Shapes using method createArray()
     * takes user input to determine size of array
     * size must be between 2 and 20
     * saves Shapes from array to file using method saveShapesToFile()
     * converts shapes form file to array and prints results
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
                shapes = createArray(size);
                input.close();
                break;
            } 
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

        // program correctly writes shapes to a file 
        saveShapesToFile(shapes, "Test2.txt");

        // program correctly reads shapes from a file
        Shape[] other = loadShapesToFile("Test2.txt");
        System.out.println(other);
        System.out.println();
        for (Shape shape : other){
            System.out.println(shape);
            System.out.println();
        }
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
            case 2:
                double measurement2 = random.nextInt(10000)/100.0;
                return new Rectangle(pos, fillColor, lineColor,  measurement1,  measurement2);
            default:
                return new Shape(pos, fillColor, lineColor, "shape");
        }
    }

    /**
     * writes Shapes from array called shapes to file called filename
     * if filename does not already exist, it is created
     * @param shapes an array of shapes
     * @param filename the name of the file to which to write the shapes
     */
    public static void saveShapesToFile(Shape[] shapes, String filename){
        File file = new File(filename);

        // create the file if it doesn't exist
        if (!file.exists()){
            try{
                file.createNewFile();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

        // write each shape in the file in Shape.toString() format
        try (FileWriter fileWriter = new FileWriter(file)){
            for (int i=0; i<shapes.length; i++){
                fileWriter.write(shapes[i] + "\n");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    /**
     * converts shape-describing strings in a file to an array of Shapes
     * @param filename the file being read that contains shape-describing strings
     * @return an array of shapes described in the file
     */
    public static Shape[] loadShapesToFile(String filename){
        ArrayList<String> shapeStrings = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))){
            
            String line;
            while ((line = reader.readLine()) != null){ // make line = reader.readLine() so that we can work with line and don't accidentally read more lines than intended
                shapeStrings.add(line);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        Shape[] shapes = new Shape[shapeStrings.size()];

        // convert each string to the appropriate shape and add to an array of shapes
        for (int i=0; i<shapes.length; i++){
            shapes[i] = stringToShape(shapeStrings.get(i));
        }

        return shapes;
    }

    /**
     * converts toString form of any shape to a Shape Object
     * @param string a string in the format of that shape's toString
     * @return a shape that corresponds to the toString
     */
    public static Shape stringToShape(String string){
        String[] words = string.split("\\s+");

        // extracting relevant information from toString form of each shape
        String type = words[1];
        String fillColor = words[0];
        String lineColor = words[3];
        int x = Integer.parseInt(words[7].substring(1, words[7].length()-1)); // removes the open paren before x coordinate and comma afterwards
        int y = Integer.parseInt(words[8].substring(0, words[8].length()-1)); // removes the open paren after y coordinate

        switch (type){ // return shape depending on type
            case "circle":
                double radius = Double.parseDouble(words[11]);
                return new Circle(new Position(x, y), fillColor, lineColor, radius);
            case "triangle":
                double side = Double.parseDouble(words[12]);
                return new Triangle(new Position(x, y), fillColor, lineColor, side);
            case "rectangle":
                double height = Double.parseDouble(words[11]);
                double width = Double.parseDouble(words[14]);
                return new Rectangle(new Position(x, y), fillColor, lineColor, width, height);
            default:
                return new Shape(new Position(x, y), fillColor, lineColor, type);
        }

    }
}
