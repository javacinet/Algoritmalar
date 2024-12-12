package ogrenciler.besma.list.other;

public class IntArrayList implements IntList{
    private final int INITIAL_CAPACITY = 16 ;
    private int [] array;
    private int size = 0  ;

    public IntArrayList(){
        array = new int [INITIAL_CAPACITY];
    }

    @Override
    public void addLast(int e) {
        enlargeArray();
        array[size ++] = e;
    }

    private void enlargeArray() {
        if (size == array.length){
            int[] newArray = new int[array.length * 2];
            System.arraycopy(array,0,newArray,0,array.length);
            array = newArray;
        }
    }

    @Override
    public int get(int index) {
        if (index >= size){
            throw new ArrayIndexOutOfBoundsException(index);
        }
        return array[index];
    }

    @Override
    public boolean contains(int e) {
        for (int i = 0 ;i < size; i++){
            if (array[i] == e){
                return true;
            }
        }
        return false;
    }

    @Override
    public void addFirst(int e) {
        enlargeArray();
        shiftRight();
        array[0] = e;
        size++;
    }

    private void shiftRight() {
        if (array.length <= size){
            throw new ArrayIndexOutOfBoundsException(size);
        }
        for (int i = size; i > 0 ; i--){
            array[i] = array[i -1];
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clean() {
        array = new int[INITIAL_CAPACITY];
        size = 0;
    }

    @Override
    public int removeLast() {
        return array[--size];
    }

    @Override
    public int removeFirst() {
        if (isEmpty()){
            throw new RuntimeException("IntArrayList empty");
        }
        int retval = array[0];
        for (int i = 0 ; i < size-1; i++){
            array[i] = array[i + 1];
        }

        size-- ;

        return retval;
    }
}
