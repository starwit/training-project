package training;

/**
 * A simplified (and non-generic) implementation of <code>java.util.Set&lt;E&gt;</code>.
 * Stores <code>Object</code> and makes sure that all <code>Object</code>
 * are unique, that is, no two <code>Object</code> of the set are equal.
 * <code>Object</code> equality is based on <code>Object.equals()</code>.
 */
public class MySet {

    private Object[] mySet;
    public MySet() {
        this(new Object[0]);
    }
    
    public MySet(Object[] initialElements) {
        // constructor implementation
        this.mySet = initialElements.clone();
    }

    /**
     * Add <code>obj</code> to the set. If <code>obj</code> is already
     * in set, nothing happens.
     * @param obj The <code>Object</code> to be added.
     */
    public void add(Object obj) {
        if (!this.contains(obj)) {
            var temp = this.mySet;
            mySet = new Object[mySet.length + 1];
            mySet[mySet.length - 1] = obj;
        }
    }

    /**
     * Removes <code>obj</code> from the set, if it exists. 
     * If the set does not contain <code>obj</code>, nothing happens.
     * @param obj The <code>Object</code> to be removed.
     */
    public void remove(Object obj) {
        int i = getIndex(obj);
        if (i != -1) {
            removeIndex(i);
        }
    }

    /**
     * Checks if the set contains a given element.
     * @param obj Element to be checked.
     * @return Returns <code>true</code> if this set contains the given element. 
     * <code>False</code> otherwise.
     */
    public boolean contains(Object obj) {
        return (this.getIndex(obj) > -1);
    }

    /**
     * Returns the number of elements in set.
     */
    public int size() {
        return mySet.length;
    }

    /**
     * Returns whether this set does not contain any elements.
     * @return <code>true</code> if there are no elements
     */
    public boolean isEmpty() {
        return (mySet.length == 0);
    }

    // gets the index of the given object within the array, -1 if not found
    private int getIndex(Object obj) {
        for (int i=0; i < mySet.length; i++) {
            if (mySet[i].equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    // creates a new array without the element at the given index
    private void removeIndex(int i) {
        var temp = mySet;
        mySet = new Object[mySet.length - 1];
        int pos = 0;
        for (int m = 0; m < temp.length; m++) {
           if (m != i) {
               mySet[pos] = temp[m];
               pos++;
           }
        }
    }
}
