/*
* Grace Texana Long Torales
* gtl1500@g.rit.edu
*/

/*
* Grace Texana Long Torales
* gtl1500@g.rit.edu
*/

package session;

import java.util.HashSet;
import java.util.Set;

public class Vertex <T>{
    private T value;
    private Set<Vertex<T>> neighbors;

    Vertex(T value){
        this.value = value;
        this.neighbors = new HashSet<>();
    }

    T getValue(){
        return value;
    }

    void addNeighbor(Vertex<T> neighbor){
        neighbors.add(neighbor);
    }

    Set<Vertex<T>> getNeighbors(){
        return neighbors;
    }
}
