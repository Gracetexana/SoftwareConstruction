package Question3;

import java.util.ArrayList;
import java.util.Random;

public class Arb implements Arbin{
    private int value;
    private Arbin left;
    private Arbin right;

    public static void main(String[] args){
        Random random = new Random();
        int numberOfNodes = random.nextInt(11) + 10;

        ArrayList<Arbin> tree = new ArrayList<>();
        Arb mainNode = new Arb();
        tree.add(mainNode);

        for (int i=1; i<numberOfNodes; i++){
            
            int whichNode = random.nextInt(tree.size());

            int leftOrRight = random.nextInt(2);

            Arbin thisNode = tree.get(whichNode);


            while (true){
                if (leftOrRight == 0){
                    if (thisNode.existsLeftChild()){
                        thisNode = thisNode.leftChild();
                    } else {
                        thisNode.createLeftChild();
                        tree.add(thisNode.leftChild());
                        break;
                    }
                }

                if (leftOrRight == 1){
                    if (thisNode.existsRightChild()){
                        thisNode = thisNode.rightChild();
                    } else {
                        thisNode.createRightChild();
                        tree.add(thisNode.rightChild());
                        break;
                    }
                }
            }
        }

        mainNode.calculateValues();

        // the instructions do not say that I have to print the values in any particular order, so I will be printing them in the order that they were created

        for (Arbin node : tree){
            System.out.println(node.content());
        }

    }

    @Override
    public int content() {
        return value;
    }

    @Override
    public boolean existsLeftChild() {
        return (left != null);
    }

    @Override
    public boolean existsRightChild() {
        return (right != null);
    }

    @Override
    public Arbin leftChild() {
        return left;
    }

    @Override
    public Arbin rightChild() {
        return right;
    }

    @Override
    public void setContent(int c) {
        value = c;
    }

    @Override
    public void createLeftChild() {
        left = new Arb();
    }

    @Override
    public void createRightChild() {
        right = new Arb();
    }

    @Override
    public int height() {
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

    @Override
    public void calculateValues() {
        if (!existsLeftChild() && !existsRightChild()){
            Random random = new Random();
            value = random.nextInt(6);

        } else if (!existsLeftChild()){
            rightChild().calculateValues();
            value = right.content();

        } else if (!existsRightChild()){
            leftChild().calculateValues();
            value = left.content();

        } else {
            leftChild().calculateValues();
            rightChild().calculateValues();
            value = left.content() + right.content();
        }
    }

    /**
     * determines whether this is a terminating node
     * @return true if this node is a terminating node or false otherwise
     */
    public boolean isLeaf(){
        return (left == null && right == null);
    }

    public int compare(Arbin other){
        if (other instanceof Arb){
            Arb otherNode = (Arb) other;

            // check if the values are the same
            if (otherNode.value != this.value){
                return 1;

            // check if the branches both terminate here
            } else {
                if (otherNode.isLeaf() && this.isLeaf()){
                    return 0;

                // check if one branch continues while the other does not
                } else if ((otherNode.left == null 
                        ^ this.left == null) 
                    || (otherNode.right == null 
                        ^ this.right == null)){
                    return 1;

                // check left side if right side ends
                } else if (otherNode.left != null
                    && otherNode.right == null){
                        return otherNode.leftChild().compare(this.leftChild());

                // check right side if left side ends
                } else if (otherNode.left == null
                    && otherNode.right != null){
                        return otherNode.rightChild().compare(this.rightChild());

                // check both sides
                } else {
                    return Math.min(1, (otherNode.leftChild().compare(this.leftChild()) + otherNode.rightChild().compare(this.rightChild())));
                }
            }


        }

        return 1;
    }
    
}
