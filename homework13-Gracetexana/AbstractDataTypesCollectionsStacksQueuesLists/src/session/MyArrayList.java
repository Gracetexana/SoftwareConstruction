/*
* Grace Texana Long Torales
* gtl1500@g.rit.edu
*/

package session;

public class MyArrayList<E> {
    static final int initialCapacity = 2;
    E[] data = (E[]) new Object[initialCapacity];
    int size = 0;

    // add a new element at the specificed index
    public void add(int index, E e){
        ensureCapacity();
        checkIndex(index);
        
        // move elements to the right
        for (int i=size-1; i>=index; i--){
            data[i+1] = data[i];
        }

        // insert a new element to data[index]
        data[index] = e;

        // increase the size by 1
        size ++;
    }

    void checkIndex(int index){
        if (index < 0 || index >= data.length){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    void ensureCapacity(){
        if (size >= data.length){
            System.out.println("Max capacity detected! Doubling the size before inserting a new element");

            E[] newData = (E[]) new Object[size * 2];

            System.arraycopy(data, 0, newData, 0, size);

            data = newData;
        }
    }
}
