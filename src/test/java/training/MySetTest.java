package training;

import static org.junit.Assert.*;

import java.util.stream.IntStream;

import org.junit.Test;

public class MySetTest {

    @Test
    public void testSize() {
        MySet set = new MySet();
        assertEquals(0, set.size());
    }

    @Test
    public void testIsEmpty() {
        MySet set = new MySet();
        assertTrue(set.isEmpty());
    }

    @Test
    public void testAdd() {
        Integer elem1 = Integer.valueOf(1);
        MySet set = new MySet();
        set.add(elem1);
        assertTrue(set.contains(elem1));
        assertEquals(1, set.size());
    }

    @Test
    public void testRemove() {
        Integer elem1 = Integer.valueOf(1);
        MySet set = new MySet();
        set.add(elem1);
        assertTrue(set.contains(elem1));
        set.remove(elem1);
        assertTrue(set.isEmpty());
    }

    @Test
    public void testLarge() {
        Object[] elements = IntStream.range(0, 1000).boxed().toArray();
        MySet set = new MySet(elements);

        Integer elem500 = Integer.valueOf(500);
        Integer elem1000 = Integer.valueOf(1000);
        
        assertTrue(set.contains(elem500));
        assertFalse(set.contains(elem1000));
        assertEquals(1000, set.size());
        
        set.remove(elem500);
        
        assertFalse(set.contains(elem500));
        assertEquals(999, set.size());

    }
}
