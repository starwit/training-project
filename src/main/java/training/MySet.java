package training;

import java.util.ArrayList;
import java.util.List;

/**
 * A simplified (and non-generic) implementation of java.util.Set<E>.
 * Stores Object and makes sure that all Object are unique, that is, no two Object of the set are equal.
 * Object equality is based on Object.equals().
 */


public class MySet {

    private List<Object> objectList;

    public MySet() {
        objectList = new ArrayList<>();
    }

    public MySet(Object[] initialElements) {
        objectList = new ArrayList<>();
        for (Object obj : initialElements) {
            add(obj);
        }
    }

    /**
     * Add obj to the set. If obj is already in set, nothing happens.
     *
     * @param obj The Object to be added.
     */
    public void add(Object obj) {
        if (!objectList.contains(obj)) {
            objectList.add(obj);
        }
    }

    /**
     * Removes obj from the set, if it exists.
     * If the set does not contain obj, nothing happens.
     *
     * @param obj The Object to be removed.
     */
    public void remove(Object obj) {
        objectList.remove(obj);
    }

    /**
     * Checks if the set contains a given element.
     *
     * @param obj Element to be checked.
     * @return Returns true if this set contains the given element. False otherwise.
     */
    public boolean contains(Object obj) {
        return objectList.contains(obj);
    }

    /**
     * Returns the number of elements in set.
     *
     * @return The number of elements in the set.
     */
    public int size() {
        return objectList.size();
    }

    /**
     * Returns whether this set does not contain any elements.
     *
     * @return true if there are no elements in the set, false otherwise.
     */
    public boolean isEmpty() {
        return objectList.isEmpty();
    }
}

  