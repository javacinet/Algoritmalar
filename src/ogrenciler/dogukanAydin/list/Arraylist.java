package ogrenciler.dogukanAydin.list;

import ogrenciler.dogukanAydin.list.Exceptions.ArrayEmptyException;

public class Arraylist<T> implements MyList<T> {

    private static final int INITIAL_CAPACITY = 10;

    private T[] array;

    private int size = 0;

    public Arraylist() { init(); }

    private void init() {
        array = (T[]) new Object[INITIAL_CAPACITY];
        size = 0;
    }

    private void largestArray() {
        if (size == array.length) {
            T[] newArray = (T[]) new Object[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
    }

    private void shiftRight() {
        if (size >= array.length) {
            throw new IndexOutOfBoundsException(size);
        }
        for (int i = size; i > 0; i--) {
            array[i] = array[i - 1];
        }
    }

    @Override
    public T get(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    @Override
    public boolean contains(T e) {
        for (int i = 0; i < size; i++) {
            if (array[i] == e) {
                return true;
            }
        }
        return false;
    }



    @Override
    public void addLast(T e) {
        largestArray();
        array[size++] = e;
    }

    @Override
    public void addFirst(T e) {
        largestArray();
        shiftRight();
        array[0] = e;
        size++;
    }

    @Override
    public void clean() {
        init();
    }

    @Override
    public T removeLast() {
        if (isEmpty()) {
            throw new ArrayEmptyException("Array is empty");
        }
        return array[--size];
    }

    @Override
    public T removeFirst() {
        if (isEmpty()) {
            throw new ArrayEmptyException("Array is empty");
        }

        T retVal = array[0];
        for (int i = 0; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;

        return retVal;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }


//    private final int INITIAL_CAPACİTY = 8;
//
//    private int[] array;
//
//    private int size = 0;
//
//    public Arraylist() {
//        array = new int[INITIAL_CAPACİTY];
//    }
//
//    public void addLast(int e) {
//        largestArray() ;
//        array[size++] = e;
//    }
//
//    public void largestArray() {
//        if (size >= array.length) {
//            int[] newArray = new int[array.length + 4];
//            System.arraycopy(array, 0, newArray, 0, size);
//            array = newArray;
//        }
//    }
//
//    public int get(int index) {
//        if (index > size) {
//            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
//        }
//        return array[index];
//    }
//
//    public boolean contains(int e) {
//        for (int i = 0; i < size; i++) {
//            if (array[i] == e) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public int size() {
//        return size;
//    }
//
//    public void listeyiGoster() {
//        for (int i = 0; i < size; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println("");
//    }
//
//    public void shiftRight(int position) {
//        if (array.length <= size) {
//            largestArray();
//        }
//        for (int i = size; i >= position; i--) {
//            array[i + 1] = array[i];
//        } array[position] = 0;
//    }
//
//    public void addSomewhere(int where, int number) {
//        for (int i = where++ ; i < size; i++) {
//
//        }
//    }



}
