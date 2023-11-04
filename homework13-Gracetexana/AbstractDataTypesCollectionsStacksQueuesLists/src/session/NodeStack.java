/*
* Grace Texana Long Torales
* gtl1500@g.rit.edu
*/

package session;

import java.util.ArrayList;

public class NodeStack<T> implements Stack<T> {
    T top = null;
    ArrayList<T> stack = new ArrayList<>();

    @Override
    public void push(T input) {
        stack.add(input);
        top = input;
    }

    @Override
    public T pop() {
        try{
            return top;
        }
        finally{
            stack.remove(stack.size() -1);
            if (stack.size() < 1){
                top = null;
            } else {
                top = stack.get(stack.size()-1);
            }
        }
    }

    @Override
    public T peek() {
        return top;
    }

    @Override
    public int size() {
        return stack.size();
    }

    
}
