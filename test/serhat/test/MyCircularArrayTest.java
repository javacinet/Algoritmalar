package serhat.test;

import ogrenciler.serhat.list.MyCircularArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCircularArrayTest {

    private MyCircularArray<Integer> list;

    @Test
    public void testAddFirst() {
        list = new MyCircularArray<>();
        list.addFirst(10);
        assertEquals(1, list.size());
        assertEquals(10, list.get(0));

        list.addFirst(20);
        assertEquals(2, list.size());
        assertEquals(20, list.get(0));
        assertEquals(10, list.get(1));
    }

    @Test
    public void testAddLast() {
        list = new MyCircularArray<>();
        list.addLast(10);
        assertEquals(1, list.size());
        assertEquals(10, list.get(0));

        list.addLast(20);
        assertEquals(2, list.size());
        assertEquals(10, list.get(0));
        assertEquals(20, list.get(1));
    }

    @Test
    public void testRemoveFirst() {
        list = new MyCircularArray<>();
        list.addLast(10);
        list.addLast(20);
        assertEquals(2, list.size());

        int removed = list.removeFirst();
        assertEquals(10, removed);
        assertEquals(1, list.size());
        assertEquals(20, list.get(0));

        removed = list.removeFirst();
        assertEquals(20, removed);
        assertEquals(0, list.size());
    }

    @Test
    public void testRemoveLast() {
        list = new MyCircularArray<>();
        list.addLast(10);
        list.addLast(20);
        assertEquals(2, list.size());

        int removed = list.removeLast();
        assertEquals(20, removed);
        assertEquals(1, list.size());
        assertEquals(10, list.get(0));

        removed = list.removeLast();
        assertEquals(10, removed);
        assertEquals(0, list.size());
    }

    @Test
    public void testGet() {
        list = new MyCircularArray<>();
        list.addLast(10);
        list.addLast(20);
        assertEquals(10, list.get(0));
        assertEquals(20, list.get(1));

        assertThrows(IndexOutOfBoundsException.class, () -> list.get(2));
    }

    @Test
    public void testContains() {
        list = new MyCircularArray<>();
        list.addLast(10);
        list.addLast(20);
        assertTrue(list.contains(10));
        assertTrue(list.contains(20));
        assertFalse(list.contains(30));
    }

    @Test
    public void testClean() {
        list = new MyCircularArray<>();
        list.addLast(10);
        list.addLast(20);
        assertEquals(2, list.size());

        list.clean();
        assertEquals(0, list.size());
    }

    @Test
    public void testSize() {
        list = new MyCircularArray<>();
        assertEquals(0, list.size());

        list.addLast(10);
        assertEquals(1, list.size());

        list.addLast(20);
        assertEquals(2, list.size());
    }

    @Test
    public void testIsEmpty() {
        list = new MyCircularArray<>();
        assertTrue(list.isEmpty());

        list.addLast(10);
        assertFalse(list.isEmpty());

        list.removeLast();
        assertTrue(list.isEmpty());
    }
}