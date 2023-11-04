/*
* Grace Texana Long Torales
* gtl1500@g.rit.edu
*/

package homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class AdjacencyGraph<T> implements Graph<T>{
    private HashMap<T, Vertex<T>> vertices;

    public AdjacencyGraph(){
        vertices = new HashMap<>();
    }

    public HashMap<T, Vertex<T>> getVertices(){
        return vertices;
    }
    
    @Override
    public void add(T value) {
        vertices.put(value, new Vertex<T>(value));
    }

    @Override
    public boolean contains(T value) {
        return vertices.containsKey(value);
    }

    @Override
    public void directed(T value1, T value2) {
        vertices.get(value1).addNeighbor(vertices.get(value2));
    }

    @Override
    public void directed(T value1, T... values) {
        Vertex<T> vertex = vertices.get(value1);
        for (T neighborValue : values){
            Vertex<T> neighbor =  vertices.get(neighborValue);
            vertex.addNeighbor(neighbor);
        }
    }

    @Override
    public void undirected(T value1, T value2) {
        vertices.get(value1).addNeighbor(vertices.get(value2));
        vertices.get(value2).addNeighbor(vertices.get(value1));
    }

    @Override
    public void undirected(T value1, T... values) {
        Vertex<T> vertex = vertices.get(value1);
        for (T neighborValue : values){
            Vertex<T> neighbor =  vertices.get(neighborValue);
            vertex.addNeighbor(neighbor);
            neighbor.addNeighbor(vertex);
        }
    }

    @Override
    public int getSize() {
        return vertices.size();
    }

    @Override
    public boolean breadthFirstSearch(T startValue, T endValue) {
        Vertex<T> start = vertices.get(startValue);
        Vertex<T> end = vertices.get(endValue);

        Queue<Vertex<T>> queue = new LinkedList<>();
        Set<Vertex<T>> seen = new HashSet<>();

        queue.add(start);
        seen.add(start);

        while (queue.size() > 0){
            Vertex<T> next = queue.poll();
            if (next == end){
                return true;
            } else {
                for (Vertex<T> neighbor : next.getNeighbors()){
                    if (!seen.contains(neighbor)){
                        seen.add(neighbor);
                        queue.add(neighbor);
                    }
                    
                }
            }
        }

        return false;
    }

    @Override
    public List<T> breadthFirstPath(T start, T end){
        Vertex<T> startVertex = vertices.get(start);
        Vertex<T> endVertex = vertices.get(end);

        Queue<Vertex<T>> queue = new LinkedList<>();
        Map<Vertex<T>, Vertex<T>> visited = new HashMap<>();

        queue.add(startVertex);
        visited.put(startVertex, null);

        while (queue.size() > 0){
            Vertex<T> v = queue.poll();

            if (v == endVertex){
                List<T> path = new LinkedList<>();
                Vertex<T> p = endVertex;

                while (p != null){
                    path.add(0, p.getValue());
                    p = visited.get(p);
                }

                return path;
            } else {
                for (Vertex<T> neighbor : v.getNeighbors()){
                    if (!visited.containsKey(neighbor)){
                        visited.put(neighbor, v);
                        queue.add(neighbor);
                    }
                }
            }
        }
        
    return null;    
    }

}
