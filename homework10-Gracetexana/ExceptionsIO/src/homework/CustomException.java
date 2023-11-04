package homework;
/*
 * Grace Texana Long Torales
 * gtl1500@g.rit.edu
 */

public class CustomException extends Exception{
    
    public CustomException(String message){
        super(message);
    }

    public CustomException(Throwable cause){
        super(cause);
    }

    public CustomException(String message, Throwable cause){
        super(message, cause);
    }
}
