package homework.session09;

/*
 * Grace Texana Long Torales
 * gtl1500@g.rit.edu
 */

import java.util.Scanner;

public class WatchBattle {
    
    /**
     * allows a user to "watch" as many Pokemon battles as they would like;
     * each battle is between 2 randomly generated Pokemon
     * @param args
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Arena arena = new Arena();
        boolean contWatching = true;

        while (contWatching){
            Pokemon home = arena.pokemonMaker(50, 100, 500, 1000);

            Pokemon away = arena.pokemonMaker(50, 100, 500, 1000);

            arena.rumble(home, away);
            
            boolean response = false;

            while (!response){
                System.out.println("Would you like to watch another match? (y/n)");

                switch (scanner.nextLine()){
                    case "Y":
                    case "y":
                        response = true;
                        System.out.println();
                        break;
                    case "N":
                    case "n":
                        contWatching = false;
                        response = true;
                        System.out.println();
                        break;
                    default:
                        System.out.println("I'm sorry, I don't recognize that input. Please try again.");
                }
            }
        }
    }
}
