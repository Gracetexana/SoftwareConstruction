package activities.session03;

import java.util.Scanner;

public class Register {
    public static void main(String[] args){
        /**
         * prompts user to enter charge and payment; prints change
         * 
         * no params
         * 
         * no returns
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the charge: ");
        float charge = scanner.nextFloat();

        System.out.print("Enter the payment: ");
        float payment = scanner.nextFloat();

        System.out.println(change(charge, payment));
    }
    public static String change(float charge, float payment){
        /**
         * calculates you change based on your payment
         * 
         * @param charge is how much your purchase cost
         * @param payment is how much money you give to the register
         * 
         * @returns the difference between the payment and charge
         */
        float change = payment - charge;
        
        int dollars = (int) change;
        String dollarString = Math.abs(dollars) == 1 ? "1 dollar" : Math.abs(dollars) + " dollars";

        int cents = (int) (Math.round((change - dollars) * 100));
        String centString = Math.abs(cents) == 1 ? "1 cent" : Math.abs(cents) + " cents";

        if (change < 0){
            return "You still owe " + dollarString + " and " + centString + ".";
        }

        return "Your change is " + dollarString + " and " + centString + ".";
    }
}
