package dogukanAydin;

import ogrenciler.dogukanAydin.Exceptions.EmptyListException;
import ogrenciler.dogukanAydin.list.AbstractCollection;
import ogrenciler.dogukanAydin.list.Interfaces.MyQueue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public abstract class AbstractQueueTest extends AbstractCollection {
    protected MyQueue<Integer> queue;



    @Test
    public void testEnqueue() {
        queue.enqueue(10);
        queue.enqueue(20);

        assertEquals(2, queue.size()); // Kuyruk boyutunun 2 olması gerekir
    }

    @Test
    public void testDequeue() {
        queue.enqueue(10);
        queue.enqueue(20);

        int dequeuedValue = queue.dequeue();
        assertEquals(10, dequeuedValue); // İlk eklenen değer 10 olduğu için 10 döndürmeli

        assertEquals(1, queue.size()); // Kuyruk boyutunun 1 olması gerekir
    }

    @Test
    public void testSize() {
        assertEquals(0, queue.size()); // Kuyruk başlangıçta boş olmalı

        queue.enqueue(10);
        assertEquals(1, queue.size()); // Kuyruk boyutunun 1 olması gerekir

        queue.enqueue(20);
        assertEquals(2, queue.size()); // Kuyruk boyutunun 2 olması gerekir
    }

    @Test
    public void testIsEmpty() {
        assertTrue(queue.isEmpty()); // Kuyruk başlangıçta boş olmalı

        queue.enqueue(10);
        assertFalse(queue.isEmpty()); // Kuyruk boş olmamalı
    }

    @Test
    public void testDequeueEmptyQueue() {
        Exception exception = assertThrows(EmptyListException.class, () -> {
            queue.dequeue(); // Kuyruk boşken dequeue çağrıldığında bir hata fırlatılmalı
        });

        assertEquals(null, exception.getMessage()); // Hata mesajını kontrol et
    }

}
