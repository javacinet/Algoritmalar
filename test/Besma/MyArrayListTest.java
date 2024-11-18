package Besma;

import ogrenciler.Besma.list.MyArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListTest {

    @Test
    public void testAddLast() {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.addLast(10);
        list.addLast(20);

        assertEquals(10, list.get(0));
        assertEquals(20, list.get(1));
        assertEquals(2, list.size()); // size() metodu çağrıldı
    }

    @Test
    public void testContains() {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.addLast(10);
        list.addLast(20);

        assertTrue(list.contains(10));
        assertFalse(list.contains(30));
    }

    @Test
    public void testAddFirst() {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.addLast(20);
        list.addFirst(10);

        assertEquals(10, list.get(0));
        assertEquals(20, list.get(1));
        assertEquals(2, list.size()); // size() metodu çağrıldı
    }
}
