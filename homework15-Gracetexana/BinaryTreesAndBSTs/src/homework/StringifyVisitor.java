/*
* Grace Texana Long Torales
* gtl1500@g.rit.edu
*/

package homework;

public class StringifyVisitor implements Visitor{
    StringBuilder stringify;
    
    public StringifyVisitor(StringBuilder stringify){
        this.stringify = stringify;
    }
    

    @Override
    public void visit(BinaryNode node) {
        stringify.append(node.getValue() + " ");
    }

    @Override
    public String toString(){
        return stringify.toString();
    }
}
