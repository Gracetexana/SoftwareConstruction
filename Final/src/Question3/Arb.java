package Question3;

import java.util.Random;

public class Arb implements Arbin{
    private int value;
    private Arb left;
    private Arb right;

    public Arb(int value){
        this.value = value;
        this.left = null;
        this.right = null;
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
        // because this method was not described as having a parameter, I chose 0 as the default value for any new node created this way
        left = new Arb(0);
    }

    @Override
    public void createRightChild() {
        // because this method was not described as having a parameter, I chose 0 as the default value for any new node created this way
        right = new Arb(0);
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
            value = right.content();

        } else if (!existsRightChild()){
            value = left.content();

        } else {
            value = left.content() + right.content();
        }
    }
    
}
