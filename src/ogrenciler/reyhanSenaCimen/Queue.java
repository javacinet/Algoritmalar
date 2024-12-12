package ogrenciler.reyhanSenaCimen;

public class Queue<T> {
    private final DoublyLinkedList<T> list = new DoublyLinkedList<>();

    public void enqueue(T data) {
        list.addLast(data);
    }

    public T dequeue() {
        return list.removeFirst();
    }

    public int getSize() {
        return list.getSize();
    }
}

