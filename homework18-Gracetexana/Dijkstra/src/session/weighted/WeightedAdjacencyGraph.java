/*
* Grace Texana Long Torales
* gtl1500@g.rit.edu
*/

package session.weighted;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    }

    @Override
    public List<T> dijkstrasShortestPath() {
        return null;
    }
    
}
