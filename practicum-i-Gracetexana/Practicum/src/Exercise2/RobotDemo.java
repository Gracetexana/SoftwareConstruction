package Exercise2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RobotDemo {

    /**
     * asks user for 3 IDs to use in creating 3 robots
     * asks user for 3 more IDs to use in creating 3 next generation robots
     * asks user to enter a number between 0 and 10 (repeats until the user enters a number between 0 and 10) and assigns that number to iterations
     * for iterations number of times:
     * -faces each robot in a random direction
     * -causes each robot to advance()
     * prints the final location and direction of each robot
     * @param args
     */
    public static void main(String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Robot> robots = new ArrayList<>();

        System.out.println("Enter a robot ID number.");
        robots.add(new Robot(scanner.nextInt()));

        System.out.println("Enter another robot ID number.");
        robots.add(new Robot(scanner.nextInt()));

        System.out.println("Enter a final robot ID number.");
        robots.add(new Robot(scanner.nextInt()));

        System.out.println("Now enter a next generation robot ID number.");
        robots.add(new RobotNG(scanner.nextInt()));

        System.out.println("Enter another next generation robot ID number.");
        robots.add(new RobotNG(scanner.nextInt()));

        System.out.println("Enter a final next generation robot ID number.");
        robots.add(new RobotNG(scanner.nextInt()));

        int iterations = -1;

        while (iterations < 0 || 10 < iterations){
            System.out.println("Enter a number between 0 and 10.");
            iterations = scanner.nextInt();

            if (iterations < 0 || 10 < iterations){
                System.out.println("I'm sorry, that number is not within range. Please try again.");
            }
        }
        System.out.println();

        for (int i=0; i<iterations; i++){
            for (Robot robot : robots){
                switch (random.nextInt(4)){
                    case 0:
                        robot.setDirection(Direction.NORTH);
                        break;
                    case 1:
                        robot.setDirection(Direction.SOUTH);
                        break;
                    case 2:
                        robot.setDirection(Direction.EAST);
                        break;
                    case 3:
                        robot.setDirection(Direction.WEST);
                        break;
                }

                robot.advance();
            }
        }

        for (Robot robot : robots){
            robot.display();
            System.out.println();
        }
    }
}
