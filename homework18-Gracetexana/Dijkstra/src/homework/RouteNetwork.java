/*
* Grace Texana Long Torales
* gtl1500@g.rit.edu
*/

package homework;

import java.util.Scanner;

public class RouteNetwork {
    /**
     * creates a map of airports in the us
     * asks a user which airports they want to leave from and arrive in
     * prints for the user the cheapest path that can be taken from their desired start point to their desired endpoint, along with the cost of that path
     * @param args
     */
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        WeightedAdjacencyGraph<String> map = new WeightedAdjacencyGraph<>();

        map.addValue("PDX");
        map.addValue("SFO");
        map.addValue("LAX");
        map.addValue("ORD");
        map.addValue("ROC");
        map.addValue("DCA");
        map.addValue("ATL");
        map.addValue("MCO");

        map.connect("PDX", "LAX", 21);
        map.connect("PDX", "ORD", 26);
        map.connect("SFO", "LAX", 10);
        map.connect("SFO", "ORD", 37);
        map.connect("SFO", "DCA", 25);
        map.connect("LAX", "ORD", 35);
        map.connect("LAX", "DCA", 36);
        map.connect("LAX", "ATL", 31);
        map.connect("LAX", "MCO", 31);
        map.connect("ORD", "ROC", 15);
        map.connect("ROC", "ATL", 22);
        map.connect("ROC", "MCO", 24);
        map.connect("ROC", "DCA", 10);

        System.out.println("Where ya comin' from?");
        String from = s.nextLine().toUpperCase();
        System.out.println("Where ya headed?");
        String to = s.nextLine().toUpperCase();

        System.out.print("Your cheapest route's gonna be ");
        map.dijkstrasShortestPath(from, to);
    }
}
