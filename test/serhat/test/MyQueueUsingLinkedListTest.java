package serhat.test;

import net.javaci.list.exception.EmptyListException;
import ogrenciler.serhat.list.MyQueueUsingLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueUsingLinkedListTest {
    MyQueueUsingLinkedList<String> queue = new MyQueueUsingLinkedList<>();
    @Test
    public void testEnqueue() {

        queue.enqueue("Test1");
        assertEquals(1, queue.size());
    }

    @Test
    public void testDequeue() {

        queue.enqueue("Test1");
        queue.enqueue("Test2");

        String result = queue.dequeue();
        assertEquals("Test1", result);
        assertEquals(1, queue.size());
    }

    @Test
    public void testDequeueEmptyQueue() {

        assertThrows(EmptyListException.class, () -> queue.dequeue());
    }

    @Test
    public void testEnqueueNullElement() {

        assertThrows(java.lang.NullPointerException.class, () -> queue.enqueue(null));
    }

    @Test
    public void testIsEmpty() {

        assertTrue(queue.isEmpty());

        queue.enqueue("Test1");
        assertFalse(queue.isEmpty());
    }
}