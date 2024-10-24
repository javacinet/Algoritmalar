package net.javaci.list.other;

public class IntArrayList implements IntList {

    private final int INITIAL_CAPACITY = 16;

    private int[] array;

    private int size = 0;

    public IntArrayList() {
        array = new int[INITIAL_CAPACITY];
    }

    // O(1)
    @Override
    public void addLast(int e) {
        enlargeArray();
        array[size++] = e;
    }

    // O(1)
    @Override
    public int get(int index) {
        if (index >= size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        return array[index];
    }

    // O(n)
    @Override
    public boolean contains(int e) {
        for (int i = 0; i < size; i++) {
            if (array[i] == e) {
                return true;
            }
        }
        return false;
    }

    // O(n)
    @Override
    public void addFirst(int e) {
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
            int[] newArray = new int[array.length * 2];
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
        array = new int[INITIAL_CAPACITY];
        size = 0;
    }

    // O(1)
    @Override
    public int removeLast() {
        return array[--size];
    }

    // O(n)
    @Override
    public int removeFirst() {
        if (isEmpty()) {
            throw new RuntimeException("IntArrayList empty");
        }

        int retVal = array[0];
        for (int i = 0; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        size--;

        return retVal;
    }
}
