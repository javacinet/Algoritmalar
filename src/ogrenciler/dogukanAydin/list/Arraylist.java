package ogrenciler.dogukanAydin.list;

public class Arraylist {

    private final int INITIAL_CAPACİTY = 8;

    private int[] array;

    private int size = 0;

    public Arraylist() {
        array = new int[INITIAL_CAPACİTY];
    }

    public void addLast(int e) {
        largestArray() ;
        array[size++] = e;
    }

    public void largestArray() {
        if (size >= array.length) {
            int[] newArray = new int[array.length + 4];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
    }

    public int get(int index) {
        if (index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return array[index];
    }

    public boolean contains(int e) {
        for (int i = 0; i < size; i++) {
            if (array[i] == e) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return size;
    }

    public void listeyiGoster() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    public void shiftRight(int position) {
        if (array.length <= size) {
            largestArray();
        }
        for (int i = size; i >= position; i--) {
            array[i + 1] = array[i];
        } array[position] = 0;
    }

    public void addSomewhere(int where, int number) {
        for (int i = where++ ; i < size; i++) {
            
        }
    }



}
