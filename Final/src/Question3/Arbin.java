package Question3;
public interface Arbin {
    public int content(); //returns the value of the current node
    public boolean existsLeftChild(); //provides information on the existence of children to the left of the current node
    public boolean existsRightChild(); //provides information on the existence of children to the right of the current node
    public Arbin leftChild(); //gives access to the left child of the current node
    public Arbin rightChild(); //gives access to the right child of the current node
    public void setContent(int c); //sets the value of the current node using the input parameter
    public void createLeftChild(); //creates a new direct descendent to the left of the current node
    public void createRightChild(); //creates a new direct descendent to the right of the current node
    public int height(); //returns the height of the tree
    public void calculateValues(); //sets the values of the current node as follows:
        //if the current node is a leaf, randomly assigns a value between 0 and 5
        //if the node is not a leaf, assigns the value to be the sum of its left and right nodes
    public int compare(Arbin leftChild); // compares two binary trees, returning 0 if and only if the trees are identical in shape and value, otherwise returning 1
}
