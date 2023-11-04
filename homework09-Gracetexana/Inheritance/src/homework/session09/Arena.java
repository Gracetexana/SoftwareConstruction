package homework.session09;

/*
 * Grace Texana Long Torales
 * gtl1500@g.rit.edu
 */

import java.util.Random;

public class Arena {
    
    /**
     * narrates the fight between two pokemon
     * @param home one of the pokemon in the fight
     * @param away the other pokemon in the fight
     */
    public void rumble(Pokemon home, Pokemon away){
        System.out.println("In the left corner, we have " + home);
        System.out.println();

        System.out.println("And in the right corner, we have " + away);
        System.out.println();

        System.out.println("Now ladies and gentlemen, let's get ready for a great match!");
        System.out.println();

        System.out.println("First up, we have " + home.name + "!");
        System.out.println();

        while (home.isConscious() && away.isConscious()){
            System.out.print(home.name + " attacks with " + home.attack + " points,");

            int homeDamage = away.hit(home);

            if (homeDamage < home.attack){
                System.out.println(" but " + away.name + " only takes " + homeDamage + " damage leaving it at " + away.health + " health! What a show!");
                System.out.println();
                
            } else if (homeDamage > home.attack){
                System.out.println(" and hits " + away.name + " for a whopping " + homeDamage + " damage! Such raw power!");
                System.out.println();

            } else{
                System.out.println(" bringing " + away.name + " down to " + away.health + "!");
                System.out.println();
            }

            if (away.isConscious()){
                System.out.println("How will " + away.name + " respond???");
                System.out.println();

            } else{
                System.out.println("Looks like " + away.name + " is down for the count! Congratulations to " + home.name + "!");
                System.out.println();
                break;
            }

            System.out.print("Now " + away.name + " is attacking with " + away.attack + " points--everything it's got!!");

            int awayDamage = home.hit(away);

            if (awayDamage < away.attack){
                System.out.println(" But this only hits " + home.name + " for " + awayDamage + " damage, bringing it down to " + home.health + " health! Them's the breaks!");
                System.out.println();

            } else if (awayDamage > away.attack){
                System.out.println(" And this hits " + home.name + " for an incredible " + awayDamage + " points! You can't get entertainment like this at home, folks!");
                System.out.println();
                
            } else{
                System.out.println(" " + home.name + " is now at " + home.health + " health. That's gonna leave a mark...");
                System.out.println();
            }

            if (home.isConscious()){
                System.out.println("Let's see what " + home.name + " has up its sleeve.");
                System.out.println();

            } else{
                System.out.println("Looks like that's it for " + home.name + "! " + away.name + " wins!");
                System.out.println();
                break;
            }
        }
    }

    /**
     * creates a Pokemon with random type, random attack between lowAttack and highAttack, and random health between lowHealth and highHealth
     * @param lowAttack the lowest bound that a random pokemon can have for its attack
     * @param highAttack the highest bound that a pokemon can have for its attack
     * @param lowHealth the lowest bound that a random pokemon can have for its health
     * @param highHealth the highest bound that a random pokemon can have for its health
     * @return a Pokemon with random type, attack, and health
     */
    public Pokemon pokemonMaker(int lowAttack, int highAttack, int lowHealth, int highHealth){
        Random random = new Random();

        int attack = random.nextInt(highAttack - lowAttack + 1) + lowAttack;

        int health = random.nextInt(highHealth - lowHealth + 1) + lowHealth;

        switch (random.nextInt(4)){
            case 0:
                return new FirePokemon(health, attack);
            case 1:
                return new GrassPokemon(health, attack);
            case 2:
                return new WaterPokemon(health, attack);
            default:
                return new Pokemon(health, attack);
        }
    }
}
