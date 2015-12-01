package ionel.demolib;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by condor on 21/11/15.
 */
public class DenissaList extends LinkedList {

    /*
    enhance the initial behavior of list remove by printing the new list
     */
    public Object remove(int index1) {

        Object o1 = super.remove(index1);
        for (Object o : this) {
            System.out.println(o);
        }

        /* or the old style
        ListIterator li =this.listIterator();
        while(li.hasNext()) {
            Object o = li.next();
            System.out.println(o);
        }
         */

        return o1;
    }
}