package ogrenciler.reyhanSenaCimen;

public class Stack<T> {
    private final DoublyLinkedList<T> list = new DoublyLinkedList<>();

    public void push(T data) {
        list.addFirst(data);
    }

    public T pop() {
        return list.removeFirst();
    }


    public int getSize() {
        return list.getSize();
    }
}
