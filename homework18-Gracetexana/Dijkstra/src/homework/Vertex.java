/*
* Grace Texana Long Torales
* gtl1500@g.rit.edu
*/

/*
* Grace Texana Long Torales
* gtl1500@g.rit.edu
*/

package homework;

import java.util.HashSet;
import java.util.Set;

public class Vertex <T>{
    private T value;
    private Set<Edge<T>> edges;

    Vertex(T value){
        this.value = value;
        this.edges = new HashSet<>();
    }

    T getValue(){
        return value;
    }

    void addNeighbor(Vertex<T> neighbor, int weight){
        Edge<T> edge = new Edge<>(this, neighbor, weight);
        edges.add(edge);
    }

    Set<Vertex<T>> getNeighbors(){
        Set<Vertex<T>> neighbors = new HashSet<>();
        for(Edge<T> edge : edges){
            neighbors.add(edge.getTo());

        }
        return neighbors;
    }

    Set<Edge<T>> getEdges(){
        return edges;
    }

    Edge<T> getEdge(Vertex<T> neighbor){
        for (Edge<T> edge : getEdges()){
            if (edge.getTo().value.equals(neighbor.getValue())){
                return edge;
            }
        }

        return null;
    }
}
