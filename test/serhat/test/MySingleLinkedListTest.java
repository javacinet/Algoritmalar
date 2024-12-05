package serhat.test;

import net.javaci.list.exception.EmptyListException;
import ogrenciler.serhat.list.MySingleLinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MySingleLinkedListTest {
    private MySingleLinkedList<Integer> linkedList;

    @BeforeEach
    public void setup() {
        linkedList = new MySingleLinkedList<>();
    }

    @Test
    public void testAddFirst() {
        linkedList.addFirst(1);
        assertEquals(1, linkedList.get(0));
        assertEquals(1, linkedList.size());
    }

    @Test
    public void testAddLast() {
        linkedList.addLast(1);
        assertEquals(1, linkedList.get(0));
        assertEquals(1, linkedList.size());
    }

    @Test
    public void testRemoveFirst() {
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        assertEquals(2, linkedList.removeFirst());
        assertEquals(1, linkedList.get(0));
        assertEquals(1, linkedList.size());
    }

    @Test
    public void testRemoveLast() {
        linkedList.addLast(1);
        linkedList.addLast(2);
        assertEquals(2, linkedList.removeLast());
        assertEquals(1, linkedList.get(0));
        assertEquals(1, linkedList.size());
    }

    @Test
    public void testGet() {
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        assertEquals(2, linkedList.get(0));
        assertEquals(1, linkedList.get(1));
    }

    @Test
    public void testContains() {
        linkedList.addFirst(1);
        assertTrue(linkedList.contains(1));
        assertFalse(linkedList.contains(2));
    }

    @Test
    public void testClean() {
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.clean();
        assertEquals(0, linkedList.size());
        assertTrue(linkedList.isEmpty());
    }

    @Test
    public void testSize() {
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        assertEquals(2, linkedList.size());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(linkedList.isEmpty());
        linkedList.addFirst(1);
        assertFalse(linkedList.isEmpty());
    }

    @Test
    public void testRemoveFirstFromEmptyList() {
        assertThrows(EmptyListException.class, () -> linkedList.removeFirst());
    }

    @Test
    public void testRemoveLastFromEmptyList() {
        assertThrows(EmptyListException.class, () -> linkedList.removeLast());
    }
}