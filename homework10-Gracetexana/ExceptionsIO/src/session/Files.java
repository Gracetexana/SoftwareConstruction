package session;
/*
 * Grace Texana Long Torales
 * gtl1500@g.rit.edu
 */

import java.io.File;

public class Files {
    
    /**
     * implements method createFile twice to test
     * @param args
     */
    public static void main(String[] args){
        createFile("Test1");
        createFile("Test2");
    }
    
    /**
     * creates a new file with name filename
     * prints the absolute path of the file
     * prints whether or not the file exists
     * prints the number of bytes in the file
     * @param filename the name of the file to be created
     */
    public static void createFile(String filename){
        File file = new File(filename + ".txt");
        try{
            file.createNewFile();
        }
        catch (Exception e){

        }
        // print path
        System.out.println("File Path: " + file.getAbsolutePath());

        // file exists
        System.out.println((file.exists()) ? "exists" : "does not exist");

        // file number of bytes
        System.out.println((file.exists()) ? file.length() : "does not exist");
    }
}
