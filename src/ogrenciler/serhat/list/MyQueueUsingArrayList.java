package ogrenciler.serhat.list;

import net.javaci.list.exception.EmptyListException;


public class MyQueueUsingArrayList<T> implements MyQueue<T> {

    private final MyArrayList<T> queue = new MyArrayList<>();

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
