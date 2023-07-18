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

    private Object[] objectArray;
    private int size;

    public MySet() {
        // constructor implementation
        objectArray = new Object[1000];
        size = 0;
    }
    
    public MySet(Object[] initialElements) {
        // constructor implementation
        objectArray = new Object[1000];
        for (Object obj : initialElements) {
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
            if (size < objectArray.length) {
                objectArray[size] = obj;
                size++;
            } else {
                System.out.println("Set full! Can't add more Elements.");
            }
        }
    }

    /**
     * Removes <code>obj</code> from the set, if it exists. 
     * If the set does not contain <code>obj</code>, nothing happens.
     * @param obj The <code>Object</code> to be removed.
     */
    public void remove(Object obj) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (objectArray[i].equals(obj)) {
                index = i;
                break;
            }
        } if (index != -1) {
            for (int i = index; i < size -1; i++) {
                objectArray[i] = objectArray[i+1];
            }
            objectArray[size-1] = null;
            size--;
        }
    }

    /**
     * Checks if the set contains a given element.
     * @param obj Element to be checked.
     * @return Returns <code>true</code> if this set contains the given element. 
     * <code>False</code> otherwise.
     */
    public boolean contains(Object obj) {
        for (int i = 0; i < size; i++) {
            if (objectArray[i].equals(obj)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns the number of elements in set.
     */
    public int size() {
        return size;
    }

    /**
     * Returns whether this set does not contain any elements.
     * @return <code>true</code> if there are no elements
     */
    public boolean isEmpty() {
        return size == 0;
    }

}
