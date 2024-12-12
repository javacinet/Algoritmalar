package ogrenciler.besma.list;
// Circular Array (Dairesel Dizi), boyutu sabit olan ve sonuncu elemandan sonra başa dönen bir veri yapısıdır.
// Yani, bir tür "halka" gibi davranır.
// FIFO (First-In-First-Out) kuyruğu veya döngüsel veri işlemlerinde sıklıkla kullanılır.

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
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0 ;
    }

    @Override
    public void addFirst(T e) {
        if (size == capacity){
            resize();
        }
        head = (head - 1 + capacity) % capacity;
        array [head] = e ;
        size ++ ;
        if (size == 1){
            tail = (head + size ) % capacity ;
        }
    }

    private void resize() {
        int newCapacity = capacity * 2;
        @SuppressWarnings("unchecked")
        T[] newArray = (T[]) new Object[newCapacity];
        for (int i = 0 ; i < size; i++){
            newArray[i] = array[(head + i) % capacity];
        }
        array = newArray;
        head = 0;
        tail = size;
        capacity = newCapacity;
    }

    @Override
    public void addLast(T e) {
        if(size == capacity){
            resize();
        }
        array[tail] = e;
        tail = (tail + 1) % capacity;
        size++;
    }

    @Override
    public T removeFirst() {
    if (isEmpty()){
        throw new EmptyListException();
    }
    T item = array [head];
    head = (head + 1) % capacity ;
    size-- ;
    return item;
    }

    @Override
    public T removeLast() {
        if (isEmpty()){
            throw new EmptyListException();
        }
        tail = (tail- 1 + capacity) % capacity;
        T item = array[tail];
        size--;
        return item;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException(index);
        }
        int actualIndex = (head + index) % capacity;
        return array[actualIndex];
    }

    @Override
    public boolean contains(T e) {
        for(int i = 0 ; i < size ; i++){
            if (array [(head + i) % capacity].equals(e)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void clean() {
        head = 0; tail = 0; size = 0;
    }
}
