/*
* Grace Texana Long Torales
* gtl1500@g.rit.edu
*/

package homework;

import java.util.Arrays;

public class ArrayHeap implements Heap {
    int[] array;
    int size;

    public ArrayHeap(){
        array = new int[8];
        size = 0;
    }

    /**
     * Sifts a value up from the specified index in a heap.
     *
     * @param array The heap.
     * @param index The index to begin sifting up.
     */
    static void siftUp(int[] array, int index) {
        int parent = (index - 1) / 2;
        while(array[parent] > array[index]) {
            swap(array, index, parent);
            index = parent;
            parent = (index - 1) / 2;
        }
    }

    /**
     * Sifts a value down from the root in a heap.
     *
     * @param array The heap.
     * @param size The size of the heap.
     */
    static void siftDown(int[] array, int size) {
        int to = 0;
        int from;
        do {
            from = to;

            int left = 2 * from + 1;
            int right = left + 1;
            if(left < size && array[left] < array[to]) {
                to = left;
            }

            if(right < size && array[right] < array[to]) {
                to = right;
            }

            swap(array, from, to);

        } while(from != to);
    }

    /**
     * Swaps the values at the specified indexes.
     *
     * @param array The array in which the values should be swapped.
     * @param from The first index.
     * @param to The second index.
     */
    static void swap(int[] array, int from, int to) {
        if(from != to) {
            int tmp = array[from];
            array[from] = array[to];
            array[to] = tmp;
        }
    }

    @Override
    public void add(int value) {
        if (array.length == size){
            array = Arrays.copyOf(array, size*2);
        }
        array[size] = value;
        siftUp(array, size);
        size ++;
    }

    @Override
    public int remove() {
        try {
            return array[0];

        } finally {
            swap(array, size-1, 0);
            size --;
            array[size] = 0;
            siftDown(array, size);
        }
    }

    @Override
    public int size() {
        return size;
    }

    /**
     * determines whether the array heap contains value
     * @param value the value being searched for
     * @return true if the arrayheap contains value or false otherwise
     */
    public boolean contains(int value){
        for (int i=0; i<size; i++){
            if (array[i] == value){
                return true;
            }
        }

        return false;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<size; i++){
            sb.append(array[i] + " ");
        }

        return sb.toString();
    }
}