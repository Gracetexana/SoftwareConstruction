/*
* Grace Texana Long Torales
* gtl1500@g.rit.edu
*/

package homework;

import java.util.List;

public interface Graph <T>{
    public void add(T value);
    public boolean contains(T value);
    
    public void directed(T value1, T value2);
    public void directed(T value1, T ... values);

    public void undirected(T value1, T value2);
    public void undirected(T value1, T ... values);

    public int getSize();

    public boolean breadthFirstSearch(T start, T end);
    public List<T> breadthFirstPath(T start, T end);
}
