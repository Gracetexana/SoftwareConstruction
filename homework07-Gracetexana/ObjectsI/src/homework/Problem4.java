package homework;
/*
 * Grace Texana Long Torales
 * gtl1500@g.rit.edu
 */

import java.text.DecimalFormat;

public class Problem4 {
    private double celsius;
    private double fahrenheit;
    private double kelvin;
    private DecimalFormat decimalFormat;

    /**
     * creates a thermometer of class Problem4
     */
    public Problem4(){
        this.celsius = 37;
        this.fahrenheit = 98.6;
        this.kelvin = 310.15;
        this.decimalFormat = new DecimalFormat("#.##");
    }

    /**
     * creates a thermometer, prints the current temperature in Celsius, Fahrenheit, and Kelvin, then changes the temperature 3 times, printing the new temperature readings each time
     * @param args
     */
    public static void main(String[] args){
        Problem4 thermometer = new Problem4();

        System.out.println(thermometer);

        thermometer.setCelsius(0);
        System.out.println(thermometer);

        thermometer.setFahrenheit(0);
        System.out.println(thermometer);

        thermometer.setKelvin(0);
        System.out.println(thermometer);
    }

    /**
     * returns the temperature in Celsius
     * @return the temperature in Celsius
     */
    public double getCelsius(){
        return celsius;
    }

    /**
     * returns the temperature in Fahrenheit
     * @return the temperature in Fahrenheit
     */
    public double getFahrenheit(){
        return fahrenheit;
    }

    /**
     * returns the temperature in Kelvin
     * @return the temperature in Kelvin
     */
    public double getKelvin(){
        return kelvin;
    }

    /**
     * sets the thermometer to a new temperature in Celsius, then changes the temperature readings for Fahrenheit and Kelvin correspondingly
     * @param temperature the new temperature in Celsius
     */
    public void setCelsius(double temperature){
        celsius = temperature;
        fahrenheit = (celsius * 9.0/5) + 32;
        kelvin = celsius + 273.15;
    }

    /**
     * sets the thermometer to a new temperature in Fahrenheit, then changes the temperature readings for Celsius and Kelvin correspondingly
     * @param temperature the new temperature in Fahrenheit
     */
    public void setFahrenheit(double temperature){
        fahrenheit = temperature;
        celsius = (fahrenheit + 32) * 5.0/9;
        kelvin = celsius + 273.15;
    }

    /**
     * sets the thermometer to a new temperature in Kelvin, then changes the temperature readings for Fahrenheit and Celsius correspondingly
     * @param temperature the new temperature in Kelvin
     */
    public void setKelvin(double temperature){
        kelvin = temperature;
        celsius = kelvin - 273.15;
        fahrenheit = (celsius * 9.0/5) + 32;
    }

    /**
     * returns a String telling the temperature in Celsius, Fahrenheit, and Kelvin
     */
    public String toString(){
        return "Celsius: " + decimalFormat.format(celsius) + " degrees\nFahrenheit: " + decimalFormat.format(fahrenheit) + " degrees\nKelvin: " + decimalFormat.format(kelvin) + " degrees\n";
    }
}
