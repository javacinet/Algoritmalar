package dogukanAydin;

import ogrenciler.dogukanAydin.Exceptions.EmptyListException;
import ogrenciler.dogukanAydin.list.Interfaces.Collection;
import ogrenciler.dogukanAydin.list.Interfaces.MyList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public abstract class AbstractListTest extends AbstractCollectionTest {

    protected MyList<Integer> list;

    @Test
    public void testAddLastAndGet() {
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        assertEquals(10, list.get(0), "The first element should be 10");
        assertEquals(20, list.get(1), "The second element should be 20");
        assertEquals(30, list.get(2), "The third element should be 30");
    }

    @Test
    public void testAddFirstAndGet() {
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);

        assertEquals(30, list.get(0), "The first element should be 30");
        assertEquals(20, list.get(1), "The second element should be 20");
        assertEquals(10, list.get(2), "The third element should be 10");
    }

    @Test
    public void testSize() {
        assertEquals(0, list.size(), "The list should initially be empty");

        list.addLast(10);
        list.addLast(20);
        assertEquals(2, list.size(), "The size should be 2 after adding two elements");
    }

    @Test
    public void testContains() {
        list.addLast(10);
        list.addLast(20);

        assertTrue(list.contains(10), "The list should contain 10");
        assertFalse(list.contains(30), "The list should not contain 30");
    }

    @Test
    public void testIsEmpty() {
        assertTrue(list.isEmpty(), "The list should initially be empty");

        list.addLast(10);
        assertFalse(list.isEmpty(), "The list should not be empty after adding an element");
    }

    @Test
    public void testClear() {
        list.addLast(10);
        list.addLast(20);
        list.clean();

        assertEquals(0, list.size(), "The list size should be 0 after clear");
        assertTrue(list.isEmpty(), "The list should be empty after clear");
    }

    @Test
    public void testRemoveLast() {
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        assertEquals(30, list.removeLast(), "The removed last element should be 30");
        assertEquals(2, list.size(), "The list size should be 2 after removing the last element");
    }

    @Test
    public void testOneElementRemoveLast() {
        list.addLast(10);

        assertEquals(10, list.removeLast(), "The removed last element should be 30");
        assertEquals(0, list.size(), "The list size should be 2 after removing the last element");
    }


    @Test
    public void testRemoveFirst() {
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        assertEquals(10, list.removeFirst(), "The removed first element should be 10");
        assertEquals(2, list.size(), "The list size should be 2 after removing the first element");
    }

    @Test
    void testGetWithInvalidIndex() {
        list.addLast(10);
        list.addLast(20);

        assertThrows(IndexOutOfBoundsException.class, () -> list.get(-1), "Getting a negative index should throw IndexOutOfBoundsException");
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(10), "Getting an out-of-range index should throw IndexOutOfBoundsException");
    }

    @Test
    void testRemoveLastOnEmptyList() {
        list.clean();
        assertThrows(EmptyListException.class, list::removeLast, "Removing the last element from an empty list should throw EmptyListException");
    }

    @Test
    void testRemoveFirstOnEmptyList() {
        list.clean();
        assertThrows(EmptyListException.class, list::removeFirst, "Removing the first element from an empty list should throw EmptyListException");
    }

    @Override
    public Collection getCollection() {
        return list;
    }

    @Test
    public void testAddAndRemoveElements() {
        for (int i = 0; i < 10000; i++) {
            list.addLast(i);
        }

        assertEquals(10000, list.size(), "The list should contain 1 million elements");

        for (int i = 0; i < 10000; i++) {
            list.removeFirst();
        }

        assertEquals(0, list.size(), "The list should be empty after removing all elements");
        assertTrue(list.isEmpty(), "The list should be empty after removing all elements");
    }

    @Test
    public void testAddFirstAndRemoveElements() {
        for (int i = 0; i < 10000; i++) {
            list.addFirst(i);
        }

        assertEquals(10000, list.size(), "The list should contain 1 million elements");

        for (int i = 0; i < 10000; i++) {
            list.removeLast();
        }

        assertEquals(0, list.size(), "The list should be empty after removing all elements");
        assertTrue(list.isEmpty(), "The list should be empty after removing all elements");
    }

    @Test
    public void testContainsOnEmptyList() {
        assertFalse(list.contains(10), "The list should not contain any element when it is empty");
    }

}
