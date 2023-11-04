/*
* Grace Texana Long Torales
* gtl1500@g.rit.edu
*/

package homework;

import java.util.Random;

public class ArrayHeapTest {
    /**
     * test ArrayHeap class
     * @param args
     */
    public static void main(String[] args){
        Random random = new Random();
        ArrayHeap ah = new ArrayHeap();
        ArrayHeap removed = new ArrayHeap();

        while (ah.size() < 50){
            int addThis = random.nextInt(101);
            if (!ah.contains(addThis)){
                ah.add(addThis);
                System.out.println(addThis);
            }
        }

        System.out.println();
        System.out.println(ah);
        System.out.println();

        while (ah.size()>0){
            removed.add(ah.remove());
        }

        System.out.println(removed);
    }
}
