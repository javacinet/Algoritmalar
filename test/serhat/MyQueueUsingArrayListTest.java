package serhat;

import net.javaci.list.exception.EmptyListException;
import ogrenciler.serhat.list.MyQueueUsingArrayList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueUsingArrayListTest {

    private MyQueueUsingArrayList<Integer> queue;

    @Test
    public void testEnqueue() {
        queue = new MyQueueUsingArrayList<>();
        queue.enqueue(10);
        assertEquals(1, queue.size());

        queue.enqueue(20);
        assertEquals(2, queue.size());
    }

    @Test
    public void testDequeue() {
        queue = new MyQueueUsingArrayList<>();
        queue.enqueue(10);
        queue.enqueue(20);
        assertEquals(2, queue.size());

        int dequeued = queue.dequeue();
        assertEquals(10, dequeued);
        assertEquals(1, queue.size());

        dequeued = queue.dequeue();
        assertEquals(20, dequeued);
        assertEquals(0, queue.size());
    }

    @Test
    public void testDequeueEmptyQueue() {
        queue = new MyQueueUsingArrayList<>();
        assertThrows(EmptyListException.class, () -> queue.dequeue());
    }

    @Test
    public void testEnqueueNull() {
        queue = new MyQueueUsingArrayList<>();
        assertThrows(NullPointerException.class, () -> queue.enqueue(null));
    }

    @Test
    public void testSize() {
        queue = new MyQueueUsingArrayList<>();
        assertEquals(0, queue.size());

        queue.enqueue(10);
        assertEquals(1, queue.size());

        queue.enqueue(20);
        assertEquals(2, queue.size());
    }

    @Test
    public void testIsEmpty() {
        queue = new MyQueueUsingArrayList<>();
        assertTrue(queue.isEmpty());

        queue.enqueue(10);
        assertFalse(queue.isEmpty());

        queue.dequeue();
        assertTrue(queue.isEmpty());
    }
}