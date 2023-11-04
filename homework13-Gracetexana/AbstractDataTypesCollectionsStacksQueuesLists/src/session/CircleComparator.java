/*
* Grace Texana Long Torales
* gtl1500@g.rit.edu
*/

package session;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle>, java.io.Serializable{

    @Override
    public int compare(Circle s1, Circle s2) {
        if (s1.getArea() > s2.getArea()){
            return 1;
        } else if (s1.getArea() < s2.getArea()){
            return -1;
        } else {
            return 0;
        }
    }
    
}
