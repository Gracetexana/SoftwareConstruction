/*
* Grace Texana Long Torales
* gtl1500@g.rit.edu
*/

package homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Board extends AdjacencyGraph<String>{
    private int cols;
    private int rows;

    public Board(int cols, int rows){
        this.cols = cols;
        this.rows = rows;

        for (int i='A'; i<'A'+cols; i++){
            for (int j=0; j<rows; j++){
                add(Character.toString(i) + j);
            }
        }

        for (String space : getVertices().keySet()){
            for (String move : moves(space)){
                directed(space, move);
            }
        }
    }

    /**
     * prompts a user to enter starting column and row and ending column and row to determine the shortest path between them
     * @param args
     */
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        Board board = new Board(5, 4);

        while (true){
            try {
                System.out.println();
                System.out.println("If you want to quit, press 'Q'; otherwise press enter.");
                if (s.nextLine().toUpperCase().equals("Q")){
                    break;
                }

                System.out.println("Enter your starting column as a character between A and " + Character.toString('A' + board.getCols()-1) + " (inclusive)");
                String startCol = s.nextLine().toUpperCase();

                System.out.println("Enter your starting row as a number between 0 and " + (board.getRows()-1) + " (inclusive)");
                String startRow = s.nextLine().toUpperCase();

                System.out.println("Enter your ending column as a character between A and " + Character.toString('A' + board.getCols()-1) + " (inclusive)");
                String endCol = s.nextLine().toUpperCase();

                System.out.println("Enter your ending row as a number between 0 and " + (board.getRows()-1) + " (inclusive)");
                String endRow = s.nextLine().toUpperCase();

                System.out.print("Shortest path: ");

                if (!board.contains(startCol + startRow) || !(board.contains(endCol + endRow))){
                    throw new Exception();
                }

                System.out.println(board.breadthFirstPath(startCol + startRow, endCol + endRow));

            } catch (Exception e){
                System.out.println("No path exists.");
            }
        }
    }
    
    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }

    /**
     * shows all moves available from one space on the board
     * @param space the vertex in question
     * @return the vertices that a knight would be able to move to from space
     */
    public ArrayList<String> moves(String space){
        char[] position =  space.toCharArray();
        ArrayList<String> moves = new ArrayList<>();
        
        HashMap<int[], int[]> distance = new HashMap<>();
        distance.put(new int[] {1, -1}, new int[] {2, -2});
        distance.put(new int[] {2, -2}, new int[] {1, -1});

        for (int[] horizontal : distance.keySet()){
            int[] vertical = distance.get(horizontal);

            for (int dx : horizontal){
                for (int dy : vertical){
                    char xPos = (char) (position[0] + dx);
                    char yPos = (char) (position[1] + dy);

                    if (xPos >= 'A' && xPos < 'A'+cols && yPos >= '0' && yPos < '0'+rows){
                        moves.add(String.valueOf(xPos) + String.valueOf(yPos));
                    }
                }
            }
        }

        return moves;
    }
}
