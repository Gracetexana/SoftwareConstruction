/*
* Grace Texana Long Torales
* gtl1500@g.rit.edu
*/

package homework;

public class BinaryNode {
    private int value;
    private BinaryNode left;
    private BinaryNode right;

    public BinaryNode(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public void setValue(int newValue){
        value = newValue;
    }

    public BinaryNode getLeft(){
        return left;
    }

    public BinaryNode getRight(){
        return right;
    }

    public void setLeft(BinaryNode left){
        this.left = left;
    }

    public void setRight(BinaryNode right){
        this.right = right;
    }

    /**
     * traverses the binary tree stemming from this BinaryNode from left to right
     * @param visitor an interface including StringifyVisitor which prints each node in the tree
     */
    public void infixTraversal(Visitor visitor){
        if (left != null){
            left.infixTraversal(visitor);
        }

        visitor.visit(this);

        if (right != null){
            right.infixTraversal(visitor);
        }
    }

    /**
     * searches through the binary tree stemming from this node to find target value
     * @param target the value being searched for
     * @return true if the target is found within the tree or false if it is not
     */
    public boolean search(int target){
        // if value matches the target, return true
        if (value == target){
            return true;
        }

        // otherwise, search the left subtree and return true if the target is found
        if (left != null){
            if (left.search(target)){
                return true;
            }
        }

        // otherwise, search the right subtree and return true if the target is found
        if (right != null){
            if (right.search(target)){
                return true;
            }
        }

        // otherwise, return false
        return false;
    }

    /**
     * traverses a binary tree, starting from the root, and traveling a path such that value is less than or greater than each node until it can be inserted into an available space on the tree
     * @param value the value being added to the tree
     */
    public void binaryInsert(int value){
        if (value < this.value){
            if (left == null){
                setLeft(new BinaryNode(value));
            } else {
                left.binaryInsert(value);
            }

        } else {
            if (right == null){
                setRight(new BinaryNode(value));
            } else {
                right.binaryInsert(value);
            }
        }
    }

    /**
     * searches through a binary tree using bisection search
     * @param target the value being searched for
     * @return true if the value is found, false if the not
     */
    public boolean binarySearch(int target){
        if (target == value){
            return true;
        }

        if (target < value && left != null){
            return left.binarySearch(target);
        }

        if (target > value && right != null){
            return right.binarySearch(target);
        }

        return false;
    }

    /**
     * returns the length of the longest branch stemming from this node
     * @return the length of the longest branch stemming from this node
     */
    public int height(){
        int leftHeight = 0;
        int rightHeight = 0;

        if (left != null){
            leftHeight = left.height() + 1;
        }
        
        if (right != null){
            rightHeight = right.height() + 1;
        }

        return Math.max(leftHeight, rightHeight);
    }

    /**
     * determines whether all branches from this node are of equal length
     * @return true if all branches are of equal length or false if not
     */
    public boolean isPerfect(){
        // if left and right are both null, the node is symmetric
        if (left == null && right == null){
            return true;

        // if only one or the other is null, the node is not symmetric
        } else if (left == null ^ right == null){
            return false;

        // otherwise, symmetry needs to be tested further down and both sides must be symmetric
        } else {
            return (left.isPerfect() && right.isPerfect());
        }
    }

    /**
     * counts the number of terminating nodes on the tree
     * @return the number of terminating nodes on the tree
     */
    public int leaves(){
        if (isLeaf()){
            return 1;

        } else if (left == null && right != null){
            return right.leaves();

        } else if (left != null && right == null){
            return left.leaves();

        } else {
            return left.leaves() + right.leaves();
        }
    }

    /**
     * determines whether this is a terminating node
     * @return true if this node is a terminating node or false otherwise
     */
    public boolean isLeaf(){
        return (left == null && right == null);
    }

    @Override
    public boolean equals(Object other){
        if (other instanceof BinaryNode){
            BinaryNode otherNode = (BinaryNode) other;

            // check if the values are the same
            if (otherNode.value != this.value){
                return false;

            // check if the branches both terminate here
            } else {
                if (otherNode.isLeaf() && this.isLeaf()){
                    return true;

                // check if one branch continues while the other does not
                } else if ((otherNode.left == null 
                        ^ this.left == null) 
                    || (otherNode.right == null 
                        ^ this.right == null)){
                    return false;

                // check left side if right side ends
                } else if (otherNode.left != null
                    && otherNode.right == null){
                        return otherNode.left.equals(this.left);

                // check right side if left side ends
                } else if (otherNode.left == null
                    && otherNode.right != null){
                        return otherNode.right.equals(this.right);

                // check both sides
                } else {
                    return (otherNode.left.equals(this.left) && otherNode.right.equals(this.right));
                }
            }


        }

        return false;
    }

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

        // print tree
        System.out.println("      " + root.value);
        System.out.println("  " + root.left.value 
            + "       " + root.right.value);
        System.out.println(root.left.left.value 
            + "   " + root.left.right.value 
            + "   " + root.right.left.value
            + "   " + root.right.right.value);

        // visitor test
        StringBuilder builder = new StringBuilder();
        root.infixTraversal(new StringifyVisitor(builder));
        System.out.println(builder);

        // search test
        System.out.println(root.search(9));
        System.out.println(root.search(10));
        System.out.println(root.search(6));
        System.out.println(root.search(0));
        System.out.println();

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

        // print pokemon
        StringBuilder builder2 = new StringBuilder();
        pokemon.infixTraversal(new StringifyVisitor(builder2));
        System.out.println(builder2);

        // binary search test
        System.out.println(pokemon.binarySearch(26));
        System.out.println(pokemon.binarySearch(36));
        System.out.println(pokemon.binarySearch(1));
        System.out.println(pokemon.binarySearch(2));
        System.out.println();

        System.out.println(root.height());
        System.out.println(pokemon.height());
        System.out.println();

        // equals test
        BinaryNode node1 = new BinaryNode(1);
        BinaryNode node2 = new BinaryNode(2);
        System.out.println(node1.equals(node2));

        node2.setValue(1);
        System.out.println(node1.equals(node2));

        node1.setLeft(new BinaryNode(2));
        System.out.println(node1.equals(node2));

        node2.setLeft(new BinaryNode(3));
        System.out.println(node1.equals(node2));

        node2.setLeft(new BinaryNode(2));
        System.out.println(node1.equals(node2));

        node1.left.setLeft(new BinaryNode(3));
        node2.left.setLeft(new BinaryNode(3));
        node1.left.setRight(new BinaryNode(4));
        node2.left.setRight(new BinaryNode(4));
        node1.left.left.setRight(new BinaryNode(5));
        System.out.println(node1.equals(node2));

        node2.left.left.setRight(new BinaryNode(5));
        System.out.println(node1.equals(node2));

        node2.left.setRight(new BinaryNode(6));
        System.out.println(node1.equals(node2));

    }
}