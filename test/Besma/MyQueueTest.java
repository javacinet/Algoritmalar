package Besma;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * QueueJUnitTest class demonstrates how to test queue operations using JUnit.
 */
public class MyQueueTest {

    private LinkedList<Integer> myQueue;

    @BeforeEach
    public void setUp() {
        // Her testten önce yeni bir kuyruk oluşturulur
        myQueue = new LinkedList<>();
    }

    @Test
    public void testEnqueue() {
        // Eleman ekleme (enqueue)
        myQueue.addLast(10);
        myQueue.addLast(20);

        // Boyut ve elemanları kontrol et
        assertEquals(2, myQueue.size());
        assertEquals(Integer.valueOf(10), myQueue.getFirst()); // İlk eklenen eleman
        assertEquals(Integer.valueOf(20), myQueue.getLast()); // Son eklenen eleman
    }

    @Test
    public void testDequeue() {
        // Eleman ekleme
        myQueue.addLast(30);
        myQueue.addLast(40);

        // İlk elemanı çıkar (dequeue)
        int dequeued = myQueue.removeFirst();
        assertEquals(30, dequeued);

        // Kuyruk boyutunu kontrol et
        assertEquals(1, myQueue.size());
        assertEquals(Integer.valueOf(40), myQueue.getFirst()); // Kalan eleman
    }

    @Test
    public void testPeek() {
        // Eleman ekleme
        myQueue.addLast(50);

        // İlk elemanı görüntüle (peek)
        int peeked = myQueue.getFirst();
        assertEquals(50, peeked);

        // Kuyruk boyutunu değiştirmediğini kontrol et
        assertEquals(1, myQueue.size());
    }

    @Test
    public void testIsEmpty() {
        // Kuyruk başlangıçta boş olmalı
        assertTrue(myQueue.isEmpty());

        // Eleman ekle
        myQueue.addLast(60);
        assertFalse(myQueue.isEmpty());

        // Tüm elemanları çıkar
        myQueue.removeFirst();
        assertTrue(myQueue.isEmpty());
    }
}
