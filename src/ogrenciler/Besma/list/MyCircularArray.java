package ogrenciler.Besma.list;
// Circular Array (Dairesel Dizi), boyutu sabit olan ve sonuncu elemandan sonra başa dönen bir veri yapısıdır.
// Yani, bir tür "halka" gibi davranır.
// FIFO (First-In-First-Out) kuyruğu veya döngüsel veri işlemlerinde sıklıkla kullanılır.
// Adım Adım Yapı
//Temel özellikler: Sabit boyutlu bir dizi oluştur ve dairesellik mantığını uygula.
//Ekleme (add): Yeni eleman ekle ve gerekirse başa dön.
//Okuma (get): İstenen pozisyondaki elemanı getir.
//Silme (remove): Belirli bir pozisyondaki elemanı kaldır.
//Boyut kontrolü: Kaç eleman olduğunu takip et.

import net.javaci.list.MyList;
import net.javaci.list.exception.EmptyListException;
public class MyCircularArray<T> implements MyList<T> {
    private static final int INITIAL_CAPACITY = 16;

    private T[] array;
    private int capacity;
    private int head = 0;
    private int tail = 0;
    private int size = 0;

    public MyCircularArray(){
        this(INITIAL_CAPACITY);
    }
@SuppressWarnings("unchecked")
    public MyCircularArray(int initialCapacity) {
        this.capacity = initialCapacity;
        this.array = (T[]) new Object[initialCapacity];
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void addFirst(T e) {

    }

    @Override
    public void addLast(T e) {

    }

    @Override
    public T removeFirst() {
        return null;
    }

    @Override
    public T removeLast() {
        return null;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public boolean contains(T e) {
        return false;
    }

    @Override
    public void clean() {

    }
}
