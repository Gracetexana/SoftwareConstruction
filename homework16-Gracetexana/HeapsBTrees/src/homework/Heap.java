/*
* Grace Texana Long Torales
* gtl1500@g.rit.edu
*/

package homework;

public interface Heap {
    /**
     * add anewelement to the heap in the correct position
     * @param value
     */
    public void add(int value);
    /**
     * remove the highest priority element from the heap and rearrang as necessary
     * @return the removed element
     */
    public int remove();
    /**
     * @return the size of the heap
     */
    public int size();
}
