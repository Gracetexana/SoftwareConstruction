/*
* Grace Texana Long Torales
* gtl1500@g.rit.edu
*/

package homework;

public class BinaryNodeLeaf {
    /**
     * tests leaves() from BinaryNode
     * @param args
     */
    public static void main(String[] args){
        // create nodes
        BinaryNode root = new BinaryNode(2);
            BinaryNode left = new BinaryNode(3);
                BinaryNode leftLeft = new BinaryNode(9);
                BinaryNode leftRight = new BinaryNode(4);
            BinaryNode right = new BinaryNode(7);
                BinaryNode rightLeft = new BinaryNode(1);
                BinaryNode rightRight = new BinaryNode(6);
        
        // link nodes
        root.setLeft(left);
            left.setLeft(leftLeft);
            left.setRight(leftRight);
        root.setRight(right);
            right.setLeft(rightLeft);
            right.setRight(rightRight);

        // binary insert test
        BinaryNode pokemon = new BinaryNode(39);
        pokemon.binaryInsert(4);
        pokemon.binaryInsert(147);
        pokemon.binaryInsert(75);
        pokemon.binaryInsert(129);
        pokemon.binaryInsert(8);
        pokemon.binaryInsert(146);
        pokemon.binaryInsert(20);
        pokemon.binaryInsert(26);
        pokemon.binaryInsert(36);

        System.out.println(root.leaves());
        System.out.println(pokemon.leaves());
    }
}
