package activities.session07;
/*
 * Grace Texana Long Torales
 * gtl1500@g.rit.edu
 */

public class Dog {
    private String name;
    private int age;
    private String breed;
    private double weight;
    
    /**
     * creates a dog object using the paramters provided
     * @param name the dog's name
     * @param age the dog's age
     * @param breed the dog's breed
     * @param weight the dog's weight
     */
    public Dog(String name, int age, String breed, double weight){
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.weight = weight;
    }

    /**
     * creates a Dog object with the default values shown
     */
    public Dog(){
        this.name = "Cutie";
        this.age = 0;
        this.breed = "unknown";
        this.weight = 1.0;
    }

    /**
     * allows the user to define breed when creating a Dog object, the rest of the values are default
     * @param breed
     */
    public Dog(String breed){
        this("Cutie", 0, breed, 1.0);
    }

    /**
     * creates four Dog objects, calls the speak() method for each Dog, calls the eat() method for two of the Dogs, and prints out information about each of the Dogs
     * @param args
     */
    public static void main(String[] args){
        Dog atlas = new Dog("Atlas", 7, "mutt", 70);
        Dog kiva = new Dog("Kiva", 7, "mutt", 50);
        Dog dog3 = new Dog();
        Dog dog4 = new Dog("malinois");

        atlas.speak();
        kiva.speak();
        dog3.speak();
        dog4.speak();

        dog3.eat();
        dog4.eat();
        
        System.out.println();
        System.out.println(atlas);
        System.out.println(kiva);
        System.out.println(dog3);
        System.out.println(dog4);
    }

    /**
     * returns the Dog's age
     * @return age
     */
    public int getAge(){
        return age;
    }

    /**
     * set's Dog's weight to the parameter entered
     * @param weight the new weight of the dog
     */
    public void setWeight(double weight){
        this.weight = weight;
    }

    /**
     * causes the Dog to bark (prints out the Dog's bark)
     */
    public void speak(){
        System.out.println("borf!");
    }

    /**
     * causes the Dog to eat (increases the Dog's weight by 0.1)
     */
    public void eat(){
        weight += 0.1;
    }

    /**
     * returns a string with Dog information
     * @return a String containing information about the Dog
     */
    public String toString(){
        return "Name: " + name + "\n" +
        "Age: " + age + "\n" +
        "Breed: " + breed + "\n" +
        "Weight: " + weight + "\n";
    }
}
