package serhat.test;

import ogrenciler.serhat.list.MyArrayList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {
    private MyArrayList<Integer> list;

    @Test
    void addFirst() {
        list = new MyArrayList<>();
        list.addFirst(10);
        assertEquals(1, list.size());
        assertEquals(10, list.get(0));

        list.addFirst(20);
        assertEquals(2, list.size());
        assertEquals(20, list.get(0));
        assertEquals(10, list.get(1));
    }

    @Test
    void addLast() {
        list = new MyArrayList<>();
        list.addLast(10);
        assertEquals(1, list.size());
        assertEquals(10, list.get(0));

        list.addLast(20);
        assertEquals(2, list.size());
        assertEquals(10, list.get(0));
        assertEquals(20, list.get(1));
    }

    @Test
    void removeFirst() {
        list = new MyArrayList<>();
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
    void removeLast() {
        list = new MyArrayList<>();
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
    void get() {
        list = new MyArrayList<>();
        list.addLast(10);
        list.addLast(20);
        assertEquals(10, list.get(0));
        assertEquals(20, list.get(1));

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.get(2));
    }

    @Test
    void contains() {
        list = new MyArrayList<>();
        list.addLast(10);
        list.addLast(20);
        assertTrue(list.contains(10));
        assertTrue(list.contains(20));
        assertFalse(list.contains(30));
    }

    @Test
    void clean() {
        list = new MyArrayList<>();
        list.addLast(10);
        list.addLast(20);
        assertEquals(2, list.size());

        list.clean();
        assertEquals(0, list.size());
    }

    @Test
    void size() {
        list = new MyArrayList<>();
        assertEquals(0, list.size());

        list.addLast(10);
        assertEquals(1, list.size());

        list.addLast(20);
        assertEquals(2, list.size());
    }

    @Test
    void isEmpty() {
        list = new MyArrayList<>();
        assertTrue(list.isEmpty());

        list.addLast(10);
        assertFalse(list.isEmpty());

        list.removeLast();
        assertTrue(list.isEmpty());
    }
}