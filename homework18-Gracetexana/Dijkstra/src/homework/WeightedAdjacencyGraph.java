/*
* Grace Texana Long Torales
* gtl1500@g.rit.edu
*/

package homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WeightedAdjacencyGraph<T> implements WeightedGraph<T> {
    private final Map<T, Vertex<T>> vertices;

    public WeightedAdjacencyGraph(){
        vertices = new HashMap<>();
    }

    @Override
    public void addValue(T value) {
        Vertex<T> vertex = new Vertex<>(value);
        vertices.put(value, vertex);
    }

    @Override
    public void connect(T value, T neighbor, int weight) {
        Vertex<T> from = vertices.get(value);
        Vertex<T> to = vertices.get(neighbor);
        from.addNeighbor(to, weight);
        to.addNeighbor(from, weight);
    }

    /**
     * prints the cheapest/lightest path from one vertex to another, as well as the cost/weight of that path
     * if there is no path, prints that as well
     * @param fromValue the start of the path
     * @param toValue the end of the path
     */
    @Override
    public void dijkstrasShortestPath(T fromValue, T toValue) {
        ArrayList<T> path = new ArrayList<>();

        // fills in a hashmap with the correct path from helper function
        HashMap<T, String[]> paths = new HashMap<>();
        paths = dijkstrasHelper(fromValue, toValue, paths);

        // if no path exists, return null
        if (paths == null){
            System.out.println("No path exists.");

        // otherwise, work backwards from target value (toValue)
        } else {
            T workBackwards = toValue;
            while (workBackwards != null){
                path.add(0, workBackwards);
                workBackwards = (T) paths.get(workBackwards)[0];
            }

            for (T value : path){
                System.out.print(value + " ");
            }

            System.out.println("\b, " + paths.get(toValue)[1] + "0 dollars");
        }
    }

    /**
     * travels through a weighted adjacency graph, finding the shortest path from one location to another
     * @param fromValue the start of the path
     * @param endValue the end of the path
     * @param paths a hashmap that updates via recursion
     * @return a hashmap that includes the information necessary to find the shortest path
     */
    public HashMap<T, String[]> dijkstrasHelper(T fromValue, T endValue, HashMap<T, String[]> paths){
        Vertex<T> from = vertices.get(fromValue);

        // starting point
        // X in index 2 means this vertex's neighbors have been (will be) checked
        // O in index 2 means vertex neighbors have not been checked
        if (paths.isEmpty()){
            paths.put(fromValue, new String[] {null, "0", "X"});

        }

        // if the helper function has reached its destination
        if (fromValue.equals(endValue)){
            return paths;
        }

        // weight of the path from starting vertex to current vertex (from)
        int weightSoFar = Integer.valueOf(paths.get(fromValue)[1]);

        // add neighbors + path weights to HashMap paths...
        for (Edge<T> edge : from.getEdges()){
            int pathWeight = weightSoFar + edge.getWeight();
            T to = edge.getTo().getValue();

            // ...if not already in paths, or...
            if (!paths.containsKey(to)){
                paths.put(to, new String[] {fromValue.toString(), String.valueOf(pathWeight), "O"});

            // ...a lighter path is found
            } else if (paths.containsKey(to) &&
                pathWeight < Integer.valueOf(paths.get(to)[1])){
                    paths.put(to, new String[] {fromValue.toString(), String.valueOf(pathWeight), "O"});
            }
        }

        // check for lightest unchecked path
        int min = 0;
        T nextCheck = fromValue;
        boolean fullyChecked = true;
        for (T entry : paths.keySet()){
            String openOrClosed = paths.get(entry)[2];

            // at least one vertex's neighbors has not been checked
            if (openOrClosed.equals("O")){
                fullyChecked = false;
                int entryWeight = Integer.valueOf(paths.get(entry)[1]);

                if (min == 0 ||
                entryWeight < min){
                    min = entryWeight;
                    nextCheck = entry;
                }
            }
            
        }

        // if all vertices and their neighbors have been checked and the helper function has not reached its destination
        if (fullyChecked){
            return null;
        }

        // this vertex's neighbors will be checked, so we will replace its O with an X
        paths.get(nextCheck)[2] = "X";

        // use recursion to check nextCheck
        return dijkstrasHelper(nextCheck, endValue, paths);
    }
    
}
