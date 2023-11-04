import java.util.Iterator;
import java.util.LinkedList;

public class Exercise2 {
    public static void main(String[] args){
        LinkedList<String> first = new LinkedList<>();
        first.add("George");
        first.add("Jim");
        first.add("John");
        first.add("Blake");
        first.add("Kevin");
        first.add("Michael");
        
        LinkedList<String> second = new LinkedList<>();
        second.add("George");
        second.add("Katie");
        second.add("Kevin");
        second.add("Michelle");
        second.add("Ryan");

        System.out.println(union(first, second));
    }

    public static LinkedList<String> union(LinkedList<String> first, LinkedList<String> second){
        first.addAll(second);
        return first;
    }

    // public static ArrayList<Integer> difference(LinkedList<String> first, LinkedList<String> second){
    //     String[] firstA = (String[]) first.toArray();
    //     String[] secondA = (String[]) second.toArray();

    //     for (int i=0; i<(Math.min(first.size(), second.size())); i++){

    //     }

    // }
    
}
