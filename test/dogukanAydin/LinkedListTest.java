package dogukanAydin;

import ogrenciler.dogukanAydin.list.Exceptions.EmptyListException;
import ogrenciler.dogukanAydin.list.LinkedList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    void testAddLastAndGet() {
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        assertEquals(10, list.get(0), "The first element should be 10");
        assertEquals(20, list.get(1), "The second element should be 20");
        assertEquals(30, list.get(2), "The third element should be 30");
    }

    @Test
    void testAddFirstAndGet() {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);

        assertEquals(30, list.get(0), "The first element should be 30");
        assertEquals(20, list.get(1), "The second element should be 20");
        assertEquals(10, list.get(2), "The third element should be 10");
    }

    @Test
    void testSize() {
        LinkedList<Integer> list = new LinkedList<>();
        assertEquals(0, list.size(), "The list should initially be empty");

        list.addLast(10);
        list.addLast(20);
        assertEquals(2, list.size(), "The size should be 2 after adding two elements");
    }

    @Test
    void testContains() {
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(10);
        list.addLast(20);

        assertTrue(list.contains(10), "The list should contain 10");
        assertFalse(list.contains(30), "The list should not contain 30");
    }

    @Test
    void testIsEmpty() {
        LinkedList<Integer> list = new LinkedList<>();
        assertTrue(list.isEmpty(), "The list should initially be empty");

        list.addLast(10);
        assertFalse(list.isEmpty(), "The list should not be empty after adding an element");
    }

    @Test
    void testClean() {
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(10);
        list.addLast(20);
        list.clean();

        assertEquals(0, list.size(), "The list size should be 0 after clean");
        assertTrue(list.isEmpty(), "The list should be empty after clean");
    }

    @Test
    void testRemoveLast() {
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        assertEquals(30, list.removeLast(), "The removed last element should be 30");
        assertEquals(2, list.size(), "The list size should be 2 after removing the last element");
    }

    @Test
    void testRemoveFirst() {
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        assertEquals(10, list.removeFirst(), "The removed first element should be 10");
        assertEquals(2, list.size(), "The list size should be 2 after removing the first element");
    }

    @Test
    void testGetWithInvalidIndex() {
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(10);
        list.addLast(20);

        assertThrows(IndexOutOfBoundsException.class, () -> list.get(-1), "Getting a negative index should throw IndexOutOfBoundsException");
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(10), "Getting an out-of-range index should throw IndexOutOfBoundsException");
    }

    @Test
    void testRemoveLastOnEmptyList() {
        LinkedList<Integer> list = new LinkedList<>();
        list.clean();
        assertThrows(EmptyListException.class, list::removeLast, "Removing the last element from an empty list should throw EmptyListException");
    }

    @Test
    void testRemoveFirstOnEmptyList() {
        LinkedList<Integer> list = new LinkedList<>();
        list.clean();
        assertThrows(EmptyListException.class, list::removeFirst, "Removing the first element from an empty list should throw EmptyListException");
    }
}


/*package dogukanAydin;

import ogrenciler.dogukanAydin.list.Exceptions.EmptyListException;
import ogrenciler.dogukanAydin.list.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Test for addLast() and get()
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        System.out.println("Test addLast and get: ");
        System.out.println(list.get(0) == 10 ? "Passed" : "Failed");
        System.out.println(list.get(1) == 20 ? "Passed" : "Failed");
        System.out.println(list.get(2) == 30 ? "Passed" : "Failed");

        // Test for addFirst()
        list = new LinkedList();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        System.out.println("\nTest addFirst and get: ");
        System.out.println(list.get(0) == 30 ? "Passed" : "Failed");
        System.out.println(list.get(1) == 20 ? "Passed" : "Failed");
        System.out.println(list.get(2) == 10 ? "Passed" : "Failed");

        // Test for size()
        list = new LinkedList();
        System.out.println("\nTest size: ");
        System.out.println(list.size() == 0 ? "Passed" : "Failed");
        list.addLast(10);
        list.addLast(20);
        System.out.println(list.size() == 2 ? "Passed" : "Failed");

        // Test contains()
        System.out.println("\nTest contains: ");
        System.out.println(list.contains(10) ? "Passed" : "Failed");
        System.out.println(list.contains(30) == false ? "Passed" : "Failed");

        // Test for isEmpty()
        list = new LinkedList();
        System.out.println("\nTest isEmpty: ");
        System.out.println(list.isEmpty() ? "Passed" : "Failed");
        list.addLast(10);
        System.out.println(list.isEmpty() == false ? "Passed" : "Failed");

        // Test for clean
        list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.clean();
        System.out.println("\nTest clean: ");
        System.out.println(list.size() == 0 ? "Passed" : "Failed");
        System.out.println(list.isEmpty() ? "Passed" : "Failed");

        // Test for removeLast
        list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        System.out.println("\nTest removeLast:");
        System.out.println(list.removeLast() == 30 ? "Passed" : "Failed");
        System.out.println(list.size() == 2 ? "Passed" : "Failed");

        // Test for removeFirst
        list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        System.out.println("\nTest removeFirst:");
        System.out.println(list.removeFirst() == 10 ? "Passed" : "Failed");
        System.out.println(list.size() == 2 ? "Passed" : "Failed");

        // Test for get() with invalid index
        System.out.println("\nTest for get() with invalid index");
        try {
            list.get(-1);
            System.out.println("Failed");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Passed");
        }

        try {
            list.get(10);
            System.out.println("Failed");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Passed");
        }

        // Test for removeLast() on empty list
        System.out.println("\nTest for removeLast() on empty list");
        list.clean();
        try {
            list.removeLast();
            System.out.println("Failed");
        } catch (EmptyListException e) {
            System.out.println("Passed");
        }

        // Test for removeFirst() on empty list
        System.out.println("\nTest for removeFirst() on empty list");
        try {
            list.removeFirst();
            System.out.println("Failed");
        } catch (EmptyListException e) {
            System.out.println("Passed");
        }
    }
}
*/