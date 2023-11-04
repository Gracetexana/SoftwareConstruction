/*
* Grace Texana Long Torales
* gtl1500@g.rit.edu
*/

package session;

import java.util.ArrayList;

public class Patron {
    String ID;
    String name;
    ArrayList<String> borrowed;
    double fines;

    public Patron(String ID, String name){
        this.ID = ID;
        this.name = name;
        this.borrowed = new ArrayList<>();
        this.fines = 0;
    }

    public String getID(){
        return ID;
    }

    public String getName(){
        return name;
    }

    public ArrayList<String> getBorrowed(){
        return borrowed;
    }

    public double getFines(){
        return fines;
    }

    public void setName(String newName){
        name = newName;
    }

    /**
     * returns the list of borrowed books as a nicely formatted String
     * @return a nicely formatted list of borrowed books
     */
    public String borrowedString(){
        StringBuilder books = new StringBuilder();
        for (String book : borrowed){
            books.append("\t" + book + "\n");
        }
        return books.toString();
    }

    /**
     * adds a book to a patron's list of borrowed books
     * @param book is the title of the book that the patron borrows
     */
    public void addBorrowed(String book){
        book = book.toUpperCase();
        borrowed.add(book);
    }

    /**
     * checks if the patron has borrowed this book
     * if so, removes the book from the patron's list of borrowed books
     * if not, informs the patron that they have not borrowed this book
     * @param book is the title of the book being returned
     */
    public void returnBorrowed(String book){
        book = book.toUpperCase();
        if (borrowed.contains(book)){
            borrowed.remove(book);
        } else {
            System.out.println("This is not in your list of borrowed books.");
        }
    }

    @Override
    public String toString(){
        return name + "\n" +
        ID + "\n" +
        "List of borrowed books:\n" +
        borrowedString() +
        "Total fines: " + fines;
    }

    @Override
    public int hashCode(){
        int hash = 0;

        char[] chars = this.getID().toUpperCase().toCharArray();

        for (int i=0; i<3; i++){
            hash = hash * 26 + (chars[i] - 65);
        }

        for (int i=3; i<chars.length; i++){
            hash = hash * 10 + (chars[i] - 48);
        }

        return hash;
    }
}
