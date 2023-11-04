/*
* Grace Texana Long Torales
* gtl1500@g.rit.edu
*/

package session;

public class HashMapTest {
    public static void main(String[] args){
        Map<String,String> map = new HashMap<>();

        Entry<String,String> entry1 = new Entry<>("ABC1234", "Gracie");
        Entry<String,String> entry2 = new Entry<>("DFT589", "Alex");
        Entry<String,String> entry3 = new Entry<>("LK0946", "Ryan");
        Entry<String,String> entry4 = new Entry<>("FHT258", "Kate");

        map.put(entry1.getKey(), entry1.getValue());
        map.put(entry2.getKey(), entry2.getValue());
        map.put(entry3.getKey(), entry3.getValue());
        map.put(entry4.getKey(), entry4.getValue());
        
        String[] keys = {entry1.getKey(), entry2.getKey(), entry3.getKey(), entry4.getKey()};

        for (String key : keys){
            System.out.println(key + " is " + map.get(key));
        }
    }
}
