package net.javaci.list;

import net.javaci.list.exception.EmptyListException;

public class MyArrayList<T> implements MyList<T> {

    private static final int INITIAL_CAPACITY = 16;

    private T[] array;

    private int size = 0;

    public MyArrayList() {
        init();
    }

    private void init() {
        array = (T[]) new Object[INITIAL_CAPACITY];
        size = 0;
    }

    // O(1)
    @Override
    public void addLast(T e) {
        enlargeArray();
        array[size++] = e;
    }

    // O(1)
    @Override
    public T get(int index) {
        if (index >= size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        return array[index];
    }

    // O(n)
    @Override
    public boolean contains(T e) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    // O(n)
    @Override
    public void addFirst(T e) {
        enlargeArray();
        shiftRight();
        array[0] = e;
        size++;
    }

    // O(n)
    private void shiftRight() {
        if (array.length <= size) {
            throw new ArrayIndexOutOfBoundsException(size);
        }
        for (int i = size; i > 0; i--) {
            array[i] = array[i - 1];
        }
    }

    // O(1)
    private void enlargeArray() {
        if (size == array.length) {
            T[] newArray = (T[]) new Object[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
    }

    // O(1)
    @Override
    public int size() {
        return size;
    }

    // O(1)
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    // O(1)
    @Override
    public void clean() {
        init();
    }

    // O(1)
    @Override
    public T removeLast() {
        if (isEmpty()) {
            throw new RuntimeException("IntArrayList empty");
        }

        return array[--size];
    }

    // O(n)
    @Override
    public T removeFirst() {
        if (isEmpty()) {
            throw new EmptyListException();
        }

        T retVal = array[0];
        for (int i = 0; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        size--;

        return retVal;
    }
}
