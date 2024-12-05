package ogrenciler.serhat.list;

import net.javaci.list.exception.EmptyListException;

public class MyQueueUsingLinkedList<T> implements MyQueue<T> {

    private final MySingleLinkedList<T> queue = new MySingleLinkedList<>();

    @Override
    public void enqueue(T t) {
        if (t == null) {
            throw new NullPointerException();
        }
        queue.addLast(t);
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new EmptyListException();
        }
        return queue.removeFirst();
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
