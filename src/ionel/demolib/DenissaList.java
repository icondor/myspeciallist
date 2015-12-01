package ionel.demolib;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by condor on 21/11/15.
 */
public class DenissaList extends LinkedList {

    public Object remove(int index1) {

        Object o1 = super.remove(index1);
        ListIterator li =this.listIterator();
        while(li.hasNext()) {
            Object o = li.next();
            System.out.println(o);
        }
        return o1;
    }
}