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

    private Object[] objects;

    public MySet() {
        // constructor implementation
        objects = new Object[0];
    }
    
    public MySet(Object[] initialElements) {
        // constructor implementation
        objects = new Object[initialElements.length];
        for (int i = 0; i < initialElements.length; i++) {
            objects[i] = initialElements[i];
        }
    }

    /**
     * Add <code>obj</code> to the set. If <code>obj</code> is already
     * in set, nothing happens.
     * @param obj The <code>Object</code> to be added.
     */
    public void add(Object obj) {
        //prüfen, ob das übergebene Object schon im Array vorhanden ist (Methode contains)
        //weiteres Array mit Größe altes Array +1 anlegen, mit vorhandenen Werten füllen
        //neuen Wert an letzte Stelle schreiben
        //neues Array dem alten Array zuweisen und damit überschreiben
        if (!this.contains(obj)) {
            Object[] neuesArray = new Object[objects.length +1];
            for (int i = 0; i < objects.length ; i++) {
                neuesArray[i] = objects[i];
            }
            neuesArray[neuesArray.length-1] = obj;
            objects = neuesArray;
        }
    }

    /**
     * Removes <code>obj</code> from the set, if it exists. 
     * If the set does not contain <code>obj</code>, nothing happens.
     * @param obj The <code>Object</code> to be removed.
     */
    public void remove(Object obj) {
        if (this.contains(obj)) {
            Object[] weiteresArray = new Object[objects.length-1];
            int j = 0;
            for (int i = 0; i < objects.length; i++) {
                if (!objects[i].equals(obj)) {
                    weiteresArray[j] = objects[i];
                    j++;
                }
            }
            objects = weiteresArray;
        }
    }

    /**
     * Checks if the set contains a given element.
     * @param obj Element to be checked.
     * @return Returns <code>true</code> if this set contains the given element. 
     * <code>False</code> otherwise.
     */
    public boolean contains(Object obj) {
        for (int i = 0; i < objects.length ; i++) {
            if (objects[i].equals(obj)) {
                return true;
            }
        }
        return false;

    }

    /**
     * Returns the number of elements in set.
     */
    public int size() {
        return objects.length;
    }

    /**
     * Returns whether this set does not contain any elements.
     * @return <code>true</code> if there are no elements
     */
    public boolean isEmpty() {
        if (objects.length == 0) {
            return true;
        } else {
            return false;
        }
    }

}
