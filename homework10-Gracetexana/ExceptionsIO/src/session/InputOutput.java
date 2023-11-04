package session;
/*
 * Grace Texana Long Torales
 * gtl1500@g.rit.edu
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class InputOutput {
    
    /**
     * creates array of Strings
     * uses method writeString to add contents of array to file "Test1.txt"
     * uses method readString to print contents of "Test1.txt"
     * @param args
     */
    public static void main(String[] args){
        String[] array = {"static", "", "void main"};
        writeString(array, "Test1.txt");

        for (String line : readString("Test1.txt")){
            System.out.println(line);
        }
    }

    /**
     * writes contents of array to a file with name filename
     * @param array contents to be written to file
     * @param filename name of file
     */
    public static void writeString(String[] array, String filename){
        try{
            FileWriter fileWriter = new FileWriter(filename);
            for (int i=0; i<array.length; i++){
                fileWriter.write(array[i]);
            }
            fileWriter.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    /**
     * reads each line in a file
     * returns each line in a file in String[]
     * @param filename the name of the file to be read
     * @return the contents of the file in a String[]
     */
    public static String[] readString(String filename){
        ArrayList<String> contents = new ArrayList<>();

        try{
            FileReader fileReader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null){
                contents.add(line);
            }
            
            fileReader.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            System.exit(1);
        }

        String[] contentsArray = contents.toArray(new String[0]);

        return contentsArray;
    }
}
