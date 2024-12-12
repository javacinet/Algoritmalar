package besma;
import ogrenciler.Besma.list.MyCircularArray;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CircularArrayTest {
    @Test
    public void testAddFirst(){
        MyCircularArray<Integer> circularArray = new MyCircularArray<>(5);
        circularArray.addFirst(10);
        circularArray.addFirst(20);

        assertEquals(2,circularArray.size());
        assertEquals(20,circularArray.get(0));
        assertEquals(10,circularArray.get(1));
    }
    @Test
    public void testAddLast(){
        MyCircularArray<Integer> circularArray = new MyCircularArray<>(5);
        circularArray.addFirst(10);
        circularArray.addFirst(20);

        assertEquals(2,circularArray.size());
        assertEquals(20,circularArray.get(0));
        assertEquals(10,circularArray.get(1));
    }

    @Test
    public void testRemoveFirst (){
        MyCircularArray<Integer> circularArray = new MyCircularArray<>(5);
        circularArray.addLast(10);
        circularArray.addLast(20);
        int removed = circularArray.removeFirst();

        assertEquals(10, removed);
        assertEquals(1, circularArray.size());
        assertEquals(20,circularArray.get(0));
    }

    @Test
    public void testRemoveLast(){
        MyCircularArray<Integer> circularArray = new MyCircularArray<>(5); // Kapasite: 5
        circularArray.addLast(10); // [10]
        circularArray.addLast(20); // [10, 20]
        int removed = circularArray.removeLast(); // Son eleman (20) çıkarılıyor
        assertEquals(20, removed); // Çıkarılan eleman 20 olmalı
        assertEquals(1, circularArray.size()); // Kalan eleman sayısı 1 olmalı
        assertEquals(10, circularArray.get(0)); // Dizide kalan eleman 10 olmalı
    }

    @Test
    public void testResize(){
        MyCircularArray<Integer> circularArray = new MyCircularArray<>(2); // Kapasitesi 2 olan bir dizi oluşturulur.
        circularArray.addLast(10);
        circularArray.addLast(20);
        circularArray.addLast(30); // Kapasiteyi aşar, resize çalışır

        assertEquals(3,circularArray.size());
        assertEquals(10,circularArray.get(0));
        assertEquals(20,circularArray.get(1));
        assertEquals(30,circularArray.get(2));

    }
}
