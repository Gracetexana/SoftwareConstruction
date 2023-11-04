import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> numbers = part1(s);
        for (int i=0; i<5; i++){
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();
        System.out.println();

        part2(120);
    }

    public static ArrayList<Integer> part1(Scanner s){
        ArrayList<Integer> numbers = new ArrayList<>();
        
        System.out.println("I will ask you to enter 5 Integers.");

        for (int i=1; i<6; i++){
            try {
                System.out.println(i + ":");

                numbers.add(s.nextInt());
            } catch (InputMismatchException e) {
                numbers.add(10);
                s.next();
            }
        }
        return numbers;
    }

    public static void part2(int input){
        int i = 4;
        while (true){
            try {
                System.out.print(input + " divided by " + i + " is ");
                input /= i;
                System.out.println(input);
                i --;
            } catch (ArithmeticException e){
                System.out.println("impossible, dividing by 1 instead.");
                input /= 1;
                break;
            }
        }
    }
}
