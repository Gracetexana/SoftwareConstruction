/*
* Grace Texana Long Torales
* gtl1500@g.rit.edu
*/

package session;

public interface Stack<T> {
    void push(T element);
    T pop();
    T peek();
    int size();
}
