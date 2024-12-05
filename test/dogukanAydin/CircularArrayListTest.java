package dogukanAydin;

import ogrenciler.dogukanAydin.list.MyNewCircularArray;
import ogrenciler.dogukanAydin.list.Exceptions.ArrayEmptyException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircularArrayListTest {

    void testAddFirstAndGet() {
        MyNewCircularArray<Integer> list = new MyNewCircularArray<>();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);

        assertEquals(30, list.get(0), "The first element should be 30");
        assertEquals(20, list.get(1), "The second element should be 20");
        assertEquals(10, list.get(2), "The third element should be 10");
    }

    @Test
    void testSize() {
        MyNewCircularArray<Integer> list = new MyNewCircularArray<>();
        assertEquals(0, list.size(), "The list should initially be empty");

        list.addLast(10);
        list.addLast(20);
        assertEquals(2, list.size(), "The size should be 2 after adding two elements");
    }

    @Test
    void testContains() {
        MyNewCircularArray<Integer> list = new MyNewCircularArray<>();
        list.addLast(10);
        list.addLast(20);

        assertTrue(list.contains(10), "The list should contain 10");
        assertFalse(list.contains(30), "The list should not contain 30");
    }

    @Test
    void testIsEmpty() {
        MyNewCircularArray<Integer> list = new MyNewCircularArray<>();
        assertTrue(list.isEmpty(), "The list should initially be empty");

        list.addLast(10);
        assertFalse(list.isEmpty(), "The list should not be empty after adding an element");
    }

    @Test
    void testClean() {
        MyNewCircularArray<Integer> list = new MyNewCircularArray<>();
        list.addLast(10);
        list.addLast(20);
        list.clean();

        assertEquals(0, list.size(), "The list size should be 0 after clean");
        assertTrue(list.isEmpty(), "The list should be empty after clean");
    }

    @Test
    void testRemoveLast() {
        MyNewCircularArray<Integer> list = new MyNewCircularArray<>();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        assertEquals(30, list.removeLast(), "The removed last element should be 30");
        assertEquals(2, list.size(), "The list size should be 2 after removing the last element");
    }

    @Test
    void testRemoveFirst() {
        MyNewCircularArray<Integer> list = new MyNewCircularArray<>();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        assertEquals(10, list.removeFirst(), "The removed first element should be 10");
        assertEquals(2, list.size(), "The list size should be 2 after removing the first element");
    }

    @Test
    void testGetWithInvalidIndex() {
        MyNewCircularArray<Integer> list = new MyNewCircularArray<>();
        list.addLast(10);
        list.addLast(20);

        assertThrows(IndexOutOfBoundsException.class, () -> list.get(-1), "Getting a negative index should throw IndexOutOfBoundsException");
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(10), "Getting an out-of-range index should throw IndexOutOfBoundsException");
    }

    @Test
    void testRemoveLastOnEmptyList() {
        MyNewCircularArray<Integer> list = new MyNewCircularArray<>();
        list.clean();
        assertThrows(ArrayEmptyException.class, list::removeLast, "Removing the last element from an empty list should throw EmptyListException");
    }

    @Test
    void testRemoveFirstOnEmptyList() {
        MyNewCircularArray<Integer> list = new MyNewCircularArray<>();
        list.clean();
        assertThrows(ArrayEmptyException.class, list::removeFirst, "Removing the first element from an empty list should throw EmptyListException");
    }
}
