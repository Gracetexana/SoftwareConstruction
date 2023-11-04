/*
* Grace Texana Long Torales
* gtl1500@g.rit.edu
*/

package homework;

public class Edge<T> {
    private final Vertex<T> from;
    private final Vertex<T> to;
    private final int weight;

    public Edge(Vertex<T> from, Vertex<T> to, int weight){
        this.from = from;
        this.to = to;
        this.weight = weight;
    }

    public Vertex<T> getFrom(){
        return from;
    }

    public Vertex<T> getTo(){
        return to;
    }

    public int getWeight(){
        return weight;
    }
}
