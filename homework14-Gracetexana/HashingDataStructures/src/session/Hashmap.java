/*
* Grace Texana Long Torales
* gtl1500@g.rit.edu
*/

package session;

public class HashMap<K,V> implements Map<K,V>{
    Entry<K,V>[] entries;
    int size;

    public HashMap(){
        this.entries = new Entry[100];
        this.size = 0;
    }

    @Override
    public void put(K key, V value) {
        // int hashcode = Math.abs(key.hashCode() % 100);
        int index = getIndex(key);
        Entry<K,V> entry = new Entry<>(key, value);
        entries[index] = entry;
        size ++;
    }
    
    @Override
    public V get(K key) {
        // int hashcode = Math.abs(key.hashCode() % 100);
        int index = getIndex(key);
        Entry<K,V> entry = (Entry<K,V>) entries[index];
        return entry.getValue();
    }

    @Override
    public int size() {
        return size;
    }

    int getIndex(K key){
        return Math.abs(key.hashCode() % entries.length);
    }

}
