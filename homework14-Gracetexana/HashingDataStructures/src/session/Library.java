/*
* Grace Texana Long Torales
* gtl1500@g.rit.edu
*/

package session;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Patron> patrons;
    private static String IDLetters = "AAA";
    private static int IDNumbers = 0;

    public Library(){
        this.patrons = new ArrayList<>();
    }

    /**
     * adds a patron to the library's list
     * increments patron ID
     * @param patron the patron to be added to the library's list
     */
    public void addPatron(Patron patron){
        patrons.add(patron);
        incrementID();
    }

    /**
     * cycles through patrons to find the patron with the provided id (this would be better as a dictionary)
     * @param id the patron ID being sought
     * @return the patron with the corresponding ID, or null if the ID is not in the list
     */
    public Patron getPatron(String id){
        for (Patron patron : patrons){
            if (patron.getID().equals(id)){
                return patron;
            }
        }

        return null;
    }

    /**
     * adds a book to the specified patron's list of borrowed books
     * @param id the specified patron
     * @param title the book that the patron is borrowing
     */
    public void addBook(String id, String title){
        getPatron(id).addBorrowed(title);
    }

    /**
     * combines IDLetters and IDNumbers into one string such that IDNumbers is 4 digits long
     * @return the correctly formatted (and automatically incremented) patron ID
     */
    public String ID(){
        return IDLetters + String.format("%04d", IDNumbers);
    }

    /**
     * increments the patron ID number
     */
    public void incrementID(){
        if (IDNumbers == 9999){
            IDNumbers = 0;
            incrementIDLetters(2);
        } else {
            IDNumbers ++;
        }
    }

    /**
     * cycles through the letter part of the patron ID number in order
     * @param index is the index of the letter in IDLetters to be incremented
     */
    public void incrementIDLetters(int index){
        StringBuilder temp = new StringBuilder();
            
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        char[] array = IDLetters.toCharArray();

        char letter = array[index];

        if (letter == 'Z'){
            array[index] = 'A';

            temp.append(array);
            IDLetters = temp.toString();

            incrementIDLetters(index - 1);

        } else {
            int letterLocation = alphabet.indexOf(letter);
            int targetLetterLocation = letterLocation + 1;

            array[index] = alphabet.charAt(targetLetterLocation);

            temp.append(array);
            IDLetters = temp.toString();
        }
    }
}
