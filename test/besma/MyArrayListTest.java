package besma;

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

    @Test
    public void testRemoveLast(){
        MyArrayList<Integer> list = new MyArrayList<>();
        list.addLast(10);
        list.addLast(20);

        assertEquals(20, list.removeLast());
        assertEquals(1, list.size());
        assertEquals(10, list.get(0));
    }

    @Test
    public void testRemoveFirst(){
        MyArrayList<Integer>list = new MyArrayList<>();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        assertEquals(10,list.removeFirst()); // İlk eleman çıkarıldı
        assertEquals(2, list.size());  // Boyut azaldı
        assertEquals(20, list.get(0)); // Yeni ilk eleman
    }

    @Test
    public void testIsEmpty() {
        MyArrayList<Integer> list = new MyArrayList<>();
        assertTrue(list.isEmpty()); // Başlangıçta boş

        list.addLast(10);
        assertFalse(list.isEmpty()); // Eleman eklendiğinde boş değil
    }
    @Test
    public void testClean() {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.addLast(10);
        list.addLast(20);

        list.clean(); // Liste temizlendi
        assertEquals(0, list.size());    // Boyut sıfırlandı
        assertTrue(list.isEmpty());     // Liste artık boş
    }

}
