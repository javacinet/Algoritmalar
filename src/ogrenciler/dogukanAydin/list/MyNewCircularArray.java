package ogrenciler.dogukanAydin.list;

import ogrenciler.dogukanAydin.list.Exceptions.ArrayEmptyException;

public class MyNewCircularArray<T> implements MyList<T> {
    private static final int INITIAL_CAPACITY = 10;

    private T[] array;
    private int capacity;
    private int head = 0;
    private int tail = 0;
    private int size = 0;

    public MyNewCircularArray() {
        this(INITIAL_CAPACITY);
    }

    MyNewCircularArray(int initialCapacity) {
        this.capacity = initialCapacity;
        this.array = (T[]) new Object[initialCapacity];
    }

    private void resize() {
        int newCapacity = capacity + 5;

        T[] newArray = (T[]) new Object[newCapacity];

        for (int i = 0; i < size; i++) {
            newArray[i] = array[(head + i) % capacity];
        }

        array = newArray;
        head = 0;
        tail = size;
        capacity = newCapacity;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(index);
        }
        int actualIndex = (head + index) % capacity;
        return array[actualIndex];
    }

    @Override
    public boolean contains(T e) {
        for (int i = 0; i < size; i++) {
            if (array[(head + i) % capacity].equals(e)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void addLast(T e) {
        if (size == capacity) {
            resize();
        }
        array[tail] = e;
        tail = (tail + 1) % capacity;
        size++;
    }

    @Override
    public void addFirst(T e) {
        if (size == capacity) {
            resize();
        }
        head = (head - 1 + capacity) % capacity;
        array[head] = e;
        size++;
        if (size == 1) {
            tail = (head + size) % capacity;
        }
    }

    @Override
    public void clean() {
        head = 0;
        tail = 0;
        size = 0;
    }

    @Override
    public T removeLast() {
        if (isEmpty()) {
            throw new ArrayEmptyException("Array is empty");
        }
        tail = (tail - 1 + capacity) % capacity;
        T item = array[tail];
        size--;
        return item;
    }

    @Override
    public T removeFirst() {
        if (isEmpty()) {
            throw new ArrayEmptyException("Array is empty");
        }
        T item = array[head];
        head = (head + 1) % capacity;
        size--;
        return item;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
