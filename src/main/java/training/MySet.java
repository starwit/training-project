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

    private List<Object> elements;
    public MySet() {
        // constructor implementation

        elements = new ArrayList<>();
    }



    
    public MySet(Object[] initialElements) {
        // constructor implementation
        for (int i = 0; i < initialElements.length; i++) {
            Object obj = initialElements[i];
            add(obj);
        }

    }
    /**
     * Add <code>obj</code> to the set. If <code>obj</code> is already
     * in set, nothing happens.
     * @param obj The <code>Object</code> to be added.
     */
    public void add(Object obj) {
            if (!contains(obj)) {
                elements.add(obj);
            }
    }

    /**
     * Removes <code>obj</code> from the set, if it exists. 
     * If the set does not contain <code>obj</code>, nothing happens.
     * @param obj The <code>Object</code> to be removed.
     */
    public void remove(Object obj) {
        elements.remove(obj);
    }

    /**
     * Checks if the set contains a given element.
     * @param obj Element to be checked.
     * @return Returns <code>true</code> if this set contains the given element. 
     * <code>False</code> otherwise.
     */
    public boolean contains(Object obj) {
        return elements.contains(obj);
    }

    /**
     * Returns the number of elements in set.
     */
    public int size() {
        return elements.size();
    }

    /**
     * Returns whether this set does not contain any elements.
     * @return <code>true</code> if there are no elements
     */
    public boolean isEmpty() {
        return elements.isEmpty();
    }

}
