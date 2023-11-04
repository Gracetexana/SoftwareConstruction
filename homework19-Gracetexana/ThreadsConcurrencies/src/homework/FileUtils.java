package homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;

public class FileUtils {
    public static void main(String[] args){
        try{
            copyFile("books.png", "booksCopy.png");
            copyFile("buttercup.jpg", "buttercupCopy.jpg");
            copyFile("cutie.jpg", "cutieCopy.jpg");
            copyFile("tacos.jpg", "tacosCopy.jpg");
            copyFile("words.txt", "wordsCopy.txt");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public static void copyFile(String source, String destination) throws Exception{
        File sourceFile = new File("input/" + source);
        File destinationFile = new File("output/" + destination);

        InputStream in = null;
        OutputStream out = null;
        try {
            in = new FileInputStream(sourceFile);
            out = new FileOutputStream(destinationFile);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }
        } finally {
            in.close();
            out.close();
        }

        try {
            clearDirectory("output");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void clearDirectory(String name) throws IOException{
        File directory = new File(name);
        for (File file : Objects.requireNonNull(directory.listFiles())){
            file.delete();
        }
    }

    
}
