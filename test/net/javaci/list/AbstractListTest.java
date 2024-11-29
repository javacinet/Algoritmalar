package net.javaci.list;

import net.javaci.list.exception.EmptyListException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public abstract class AbstractListTest extends AbstractCollectionTest {
    protected MyList<Integer> list;

    @Test
    public void addFirstTest() {
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        list.addFirst(5);

        assertEquals(4, list.size());
        assertEquals(5, list.get(0));
        assertEquals(10, list.get(1));
        assertEquals(20, list.get(2));
        assertEquals(30, list.get(3));
    }

    @Test
    public void testAddLast() {
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        assertEquals(3, list.size(), "Dizi boyutu 3 olmalı.");
        assertEquals(10, list.get(0), "Index 0'deki eleman 10 olmalı.");
        assertEquals(20, list.get(1), "Index 1'deki eleman 20 olmalı.");
        assertEquals(30, list.get(2), "Index 2'deki eleman 30 olmalı.");
    }

    @Test
    public void testGetOutOfBounds() {
        list.addLast(10);
        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.get(1);
        }, "Index 1'de bir eleman olmamalı.");
    }

    @Test
    public void testContains() {
        list.addLast(10);
        list.addLast(20);
        assertTrue(list.contains(20), "Dizi 20'yi içermeli.");
        assertFalse(list.contains(30), "Dizi 30'u içermemeli.");
    }

    @Test
    public void testContainsEmptyList() {
        // list.addLast(5);
        assertEquals(0, list.size(), "Liste bos degil");
        assertFalse(list.contains(4), "dortun listede olmamasi lazim");
    }

    @Test
    public void testRemoveFromEmptyList() {
        assertThrows(EmptyListException.class, () -> list.removeFirst(), "EmptyListException atilmaliydi");
    }

    @Test
    void testAddFirstAndGet() {
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);

        assertEquals(30, list.get(0), "The first element should be 30");
        assertEquals(20, list.get(1), "The second element should be 20");
        assertEquals(10, list.get(2), "The third element should be 10");
    }

    @Test
    void testSize() {
        assertEquals(0, list.size(), "The list should initially be empty");

        list.addLast(10);
        list.addLast(20);
        assertEquals(2, list.size(), "The size should be 2 after adding two elements");
    }





    //////////////////////////////// DOGUKAN ////////////////////////////////
    @Test
    void testContains_D() {
        list.addLast(10);
        list.addLast(20);

        assertTrue(list.contains(10), "The list should contain 10");
        assertFalse(list.contains(30), "The list should not contain 30");
    }

    @Test
    void testIsEmpty() {
        assertTrue(list.isEmpty(), "The list should initially be empty");

        list.addLast(10);
        assertFalse(list.isEmpty(), "The list should not be empty after adding an element");
    }

    @Test
    void testClean() {
        list.addLast(10);
        list.addLast(20);
        list.clean();

        assertEquals(0, list.size(), "The list size should be 0 after clean");
        assertTrue(list.isEmpty(), "The list should be empty after clean");
    }

    @Test
    void testRemoveLast() {
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        assertEquals(30, list.removeLast(), "The removed last element should be 30");
        assertEquals(20, list.getLast(), "The last element should be 20");
        assertEquals(2, list.size(), "The list size should be 2 after removing the last element");
    }

    @Test
    void testRemoveFirst() {
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
    public MyCollection getCollection() {
        return list;
    }
}
