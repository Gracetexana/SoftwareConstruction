/*
* Grace Texana Long Torales
* gtl1500@g.rit.edu
*/

package homework;

public interface WeightedGraph<T> {
    public void addValue(T value);
    public void connect(T value, T neighbor, int weight);
    public void dijkstrasShortestPath(T from, T to);
}
