package ogrenciler.menekseyuncu.arraylist;

import net.javaci.list.MyList;

public class ArrayList<T> implements MyList<T> {

    private static final int INITIAL_CAPACITY = 20;
    private T[] array;
    private int size = 0;

    public ArrayList() {
        init();
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.addLast(66);
        list.addLast(20);
        list.addFirst(5);

        System.out.println("List elements:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("List contains 10: " + list.contains(10));

        System.out.println("Removed first element: " + list.removeFirst());

        System.out.println("Removed last element: " + list.removeLast());

        System.out.println("List is empty: " + list.isEmpty());
        System.out.println("List size: " + list.size());
    }

    private void init() {
        array = (T[]) new Object[INITIAL_CAPACITY];
        size = 0;
    }

    public void addLast(T e) {
        enlargeArray();
        array[size++] = e;
    }

    public T get(int index) {
        if (index >= size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        return array[index];
    }

    public boolean contains(T e) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    public void addFirst(T e) {
        enlargeArray();
        shiftRight();
        array[0] = e;
        size++;
    }

    private void shiftRight() {
        for (int i = size; i > 0; i--) {
            array[i] = array[i - 1];
        }
    }

    private void enlargeArray() {
        if (size == array.length) {
            T[] newArray = (T[]) new Object[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clean() {
        init();
    }

    public T removeLast() {
        if (isEmpty()) {
            throw new RuntimeException("List is empty");
        }
        return array[--size];
    }

    public T removeFirst() {
        if (isEmpty()) {
            throw new RuntimeException("List is empty");
        }

        T retVal = array[0];
        for (int i = 0; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return retVal;
    }
}
