/*
* Grace Texana Long Torales
* gtl1500@g.rit.edu
*/

package session.weighted;

import java.util.List;

public interface WeightedGraph<T> {
    public void addValue(T value);
    public void connect(T value, T neighbor, int weight);
    public List<T> dijkstrasShortestPath();
}
