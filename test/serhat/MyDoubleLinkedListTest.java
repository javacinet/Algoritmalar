package serhat;

import ogrenciler.serhat.list.MyDoubleLinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyDoubleLinkedListTest {
    private MyDoubleLinkedList<Integer> list;

    @BeforeEach
    public void setUp() {
        list = new MyDoubleLinkedList<>();
    }

    @Test
    public void testAddFirst() {
        list.addFirst(1);
        assertEquals((Integer) 1, list.get(0)); // Cast to Integer
        list.addFirst(2);
        assertEquals((Integer) 2, list.get(0)); // Cast to Integer
        assertEquals((Integer) 1, list.get(1)); // Cast to Integer
    }

    @Test
    public void testAddLast() {
        list.addLast(1);
        assertEquals((Integer) 1, list.get(0)); // Cast to Integer
        list.addLast(2);
        assertEquals((Integer) 1, list.get(0)); // Cast to Integer
        assertEquals((Integer) 2, list.get(1)); // Cast to Integer
    }

    @Test
    public void testRemoveFirst() {
        assertThrows(RuntimeException.class, () -> list.removeFirst());
        list.addLast(1);
        list.addLast(2);
        assertEquals((Integer) 1, list.removeFirst()); // Cast to Integer
        assertEquals((Integer) 2, list.get(0)); // Cast to Integer
        list.removeFirst();
        assertTrue(list.isEmpty());
    }

    @Test
    public void testRemoveLast() {
        assertThrows(RuntimeException.class, () -> list.removeLast());
        list.addLast(1);
        list.addLast(2);
        assertEquals((Integer) 2, list.removeLast()); // Cast to Integer
        assertEquals((Integer) 1, list.get(0)); // Cast to Integer
        list.removeLast();
        assertTrue(list.isEmpty());
    }

    @Test
    public void testGet() {
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(0));
        list.addLast(1);
        list.addLast(2);
        assertEquals((Integer) 1, list.get(0)); // Cast to Integer
        assertEquals((Integer) 2, list.get(1)); // Cast to Integer
    }

    @Test
    public void testContains() {
        assertFalse(list.contains(1));
        list.addLast(1);
        assertTrue(list.contains(1));
        assertFalse(list.contains(2));
    }

    @Test
    public void testClean() {
        list.addLast(1);
        list.clean();
        assertTrue(list.isEmpty());
        assertEquals(0, list.size()); // Ensure size is reset to 0
    }

    @Test
    public void testSize() {
        assertEquals(0, list.size());
        list.addLast(1);
        assertEquals(1, list.size());
        list.addLast(2);
        assertEquals(2, list.size());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(list.isEmpty());
        list.addLast(1);
        assertFalse(list.isEmpty());
    }
}