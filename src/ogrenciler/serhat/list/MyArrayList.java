package ogrenciler.serhat.list;

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

    @Override
    public void addFirst(T e) {
        enlargeArrayCapacity();
        shiftArrayToRight();
        array[0] = e;
        size++;

    }

    @Override
    public void addLast(T e) {
        enlargeArrayCapacity();
        array[size++] = e;
    }

    @Override
    public T removeFirst() {
        if (isEmpty()) {
            throw new RuntimeException("List is empty, cannot remove element");
        }
        T removedElement = array[0];
        for (int i = 0; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return removedElement;
    }

    @Override
    public T removeLast() {
        if (isEmpty()) {
            throw new RuntimeException("List is empty, cannot remove element");
        }
        return array[--size];
    }

    @Override
    public T get(int index) {
        if (index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index: " + index + ", Size: " + size);
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

    private void shiftArrayToRight() {
        if (size == array.length) {
            enlargeArrayCapacity();
        }
        for (int i = size; i > 0; i--) {
            array[i] = array[i - 1];
        }

    }

    private void enlargeArrayCapacity() {
        if (size == array.length) {
            T[] newArray = (T[]) new Object[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            this.array = newArray;
        }
    }

    @Override
    public void clean() {
        init();
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }
}
