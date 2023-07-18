package training;

import java.util.ArrayList;
import java.util.List;

/**
 * A simplified (and non-generic) implementation of <code>java.util.Set&lt;E&gt;</code>.
 * Stores <code>Object</code> and makes sure that all <code>Object</code>
 * are unique, that is, no two <code>Object</code> of the set are equal.
 * <code>Object</code> equality is based on <code>Object.equals()</code>.
 */
public class MySet {



    public MySet() {
        // constructor implementation
        //Object[] objectArray = new Object[100];

    }
    /*public MySet(Object[] initialElements) {
        // constructor implementation

    }*/

    /**
     * Add <code>obj</code> to the set. If <code>obj</code> is already
     * in set, nothing happens.
     * @param obj The <code>Object</code> to be added.
     */
    public void add(Object obj) {
        return;

    }

    /**
     * Removes <code>obj</code> from the set, if it exists. 
     * If the set does not contain <code>obj</code>, nothing happens.
     * @param obj The <code>Object</code> to be removed.
     */
    public void remove(Object obj) {
        return;
    }

    /**
     * Checks if the set contains a given element.
     * @param obj Element to be checked.
     * @return Returns <code>true</code> if this set contains the given element. 
     * <code>False</code> otherwise.
     */
    public boolean contains(Object obj) {
        return true;
    }

    /**
     * Returns the number of elements in set.
     */
    public int size() {
        return 0;
    }

    /**
     * Returns whether this set does not contain any elements.
     * @return <code>true</code> if there are no elements
     */
    public boolean isEmpty() {
        return true;
    }

}
