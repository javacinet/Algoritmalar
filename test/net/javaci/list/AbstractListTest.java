package net.javaci.list;

import net.javaci.list.exception.EmptyListException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public abstract class AbstractListTest {
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
}
