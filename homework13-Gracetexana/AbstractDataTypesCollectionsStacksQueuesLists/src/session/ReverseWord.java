/*
* Grace Texana Long Torales
* gtl1500@g.rit.edu
*/

package session;

public class ReverseWord {
    public static void main(String[] args){
        NodeStack <String> stack = new NodeStack<String>();

        stack.push("A");
        stack.push("B");
        stack.push("C");
        
        int stop = stack.size();
        for (int i=0; i<stop; i++){
            System.out.print(stack.pop());
        }
    }
}
