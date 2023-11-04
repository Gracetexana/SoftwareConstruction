package homework.session09;

/*
 * Grace Texana Long Torales
 * gtl1500@g.rit.edu
 */

public class Pokemon {
    String name;
    Type type;
    int health;
    int attack;

    public Pokemon(String name, int health, int attack){
        this.name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase(); //capitalize first letter of name and lowercase the rest
        this.type = Type.NORMAL;
        this.health = health;
        this.attack = attack;
    }

    public Pokemon(int health, int attack){
        this.name = "Rattata";
        this.type = Type.NORMAL;
        this.health = health;
        this.attack = attack;
    }

    public String getName(){
        return name;
    }

    public Type getType(){
        return type;
    }

    public int getHealth(){
        return health;
    }

    public int getAttack(){
        return attack;
    }

    public void setName(String evolution){
        name = evolution;
    }

    public void setHealth(int heal){
        health = heal;
    }

    public void setAttack(int evolution){
        attack = evolution;
    }

    /**
     * calls the loseHealth method for the amount of damage that an opponent Pokemon does to this Pokemon
     * @param opponent the Pokemon that is attacking this Pokemon
     * @return the amount of health lost by this Pokemon
     */
    public int hit(Pokemon opponent){
        return loseHealth(opponent.attack);
    }

    /**
     * causes this Pokemon to lose health equal to damage or health, whichever is less
     * @param damage the amount of damage that this Pokemon is hit with
     * @return the amount of health that this Pokemon loses
     */
    public int loseHealth(int damage){
        if (damage > health){
            try{
                return health;
            } finally{
                health = 0; // changes health to 0 AFTER returning original value of health
            }
        } else{
            health -= damage;
            return damage;
        }
    }

    /**
     * determines whether a Pokemon is still conscious or not
     * @return true if a Pokemon has more than 0 health or false otherwise
     */
    public boolean isConscious(){
        return (health > 0);
    }

    @Override
    public String toString(){
        return name +
            "\nType: " + type +
            "\nHealth: " + health +
            "\nAttack: " + attack;
    }
}
