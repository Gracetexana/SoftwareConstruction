package homework.session09;

/*
 * Grace Texana Long Torales
 * gtl1500@g.rit.edu
 */

public class GrassPokemon extends Pokemon{

    public GrassPokemon(String name, int health, int attack) {
        super(name, health, attack);
        //TODO Auto-generated constructor stub

        this.type = Type.GRASS;
    }

    public GrassPokemon(int health, int attack){
        super("Bulbasaur", health, attack);
        this.type = Type.GRASS;
    }

    /**
     * calls the loseHealth method for the amount of damage that an opponent Pokemon does to this Pokemon based on opponent Pokemon's type compared to this Pokemon's type
     * @param opponent the Pokemon that is attacking this Pokemon
     * @return the amount of health lost by this Pokemon
     */
    @Override
    public int hit(Pokemon opponent){
        double damage;
        switch (opponent.type){
            case WATER:
                damage = 0.5 * opponent.attack;
                break;
            case FIRE:
                damage = 2 * opponent.attack;
                break;
            default:
                damage = opponent.attack;
        }
        return loseHealth((int) damage);
    }
    
}
