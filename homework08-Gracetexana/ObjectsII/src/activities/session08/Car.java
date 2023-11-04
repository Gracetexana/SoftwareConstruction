package activities.session08;
/*
 * Grace Texana Long Torales
 * gtl1500@g.rit.edu
 */

public class Car {
    private String make;
    private String model;
    private int year;
    private String color;
    private String vin;
    private static int CAR_COUNT = 0;

    public Car(String make, String model, int year, String color, String vin){
        this.make = // capitalize the first letter of make
            make.substring(0, 1).toUpperCase() + make.substring(1).toLowerCase();
        this.model = // capitalize the first letter of model
            model.substring(0, 1).toUpperCase() + model.substring(1).toLowerCase();
        this.year = year;
        this.color = // capitalize the first letter of color
            color.substring(0, 1).toUpperCase() + color.substring(1).toLowerCase();
        this.vin = vin.toUpperCase();
        CAR_COUNT++;
    }

    /**
     * creates a new Car Object; prints the information about the car, collectively and then separately; changes the color and prints the information about the car collectively
     * @param args
     */
    public static void main(String[] args){
        Car myCar = new Car("Subaru", "Exiga", 2012, "black", "idkthevin");

        System.out.println(myCar);
        System.out.println(myCar.getMake());
        System.out.println(myCar.getModel());
        System.out.println(myCar.getYear());
        System.out.println(myCar.getColor());
        System.out.println(myCar.getVIN());
        
        myCar.setColor("purple");

        System.out.println(myCar);
    }

    public static int getCAR_COUNT(){
        return CAR_COUNT;
    }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    public String getColor(){
        return color;
    }

    public String getVIN(){
        return vin;
    }

    public void setColor(String newColor){
        color = // capitalize new color
            newColor.substring(0, 1).toUpperCase() + newColor.substring(1).toLowerCase();
    }

    /**
     * compares this Car with other Car to determine whether they are the same car based on their VIN
     * @param other is the Car to compare this Car to
     * @return true if both Cars have the same VIN and false if they do not
     */
    @Override
    public boolean equals(Object other){
        if (other instanceof Car){
            Car car = (Car) other;

            return car.vin.equals(this.vin);
            
        } else{
            return false;
        }
    }

    @Override
    public String toString(){
        return color + " " + year + " " + make + " " + model +"\nVIN: " + vin;
    }
}
