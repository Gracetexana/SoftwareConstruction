/*
* Grace Texana Long Torales
* gtl1500@g.rit.edu
*/

package session;

public interface Map <K, V> {
    
    void put(K key, V value);
    V get(K key);
    int size();
}
