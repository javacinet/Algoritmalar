package ogrenciler.dogukanAydin.list;

import ogrenciler.dogukanAydin.Exceptions.EmptyListException;
import ogrenciler.dogukanAydin.list.Interfaces.MyList;

public class MyArrayList<T> implements MyList<T> {

    private static final int INITIAL_CAPACITY = 8;

    private T[] array;

    private int size = 0;

    public MyArrayList() {init();}

    private void init() {
        array = (T[]) new Object[INITIAL_CAPACITY];
        size = 0;
    }

    private void enlargeArray() {
        if (size == array.length) {
            T[] newArray = (T[]) new Object[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
    }

    private void shiftRight() {
        for (int i = size; i > 0; i--) {
            array[i] = array[i - 1];
        }
    }

    @Override
    public void addFirst(T e) {
        enlargeArray();
        shiftRight();
        array[0] = e;
        size++;
    }

    @Override
    public void addLast(T e) {
        enlargeArray();
        array[size++] = e;
    }

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

    @Override
    public T removeLast() {
        if (isEmpty()) {
            throw new EmptyListException();
        }

        return array[--size];
    }

    @Override
    public T get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    @Override
    public boolean contains(T e) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void clean() {
        init();
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
