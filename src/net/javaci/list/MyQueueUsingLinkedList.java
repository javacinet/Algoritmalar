package net.javaci.list;

public class MyQueueUsingLinkedList<T> implements MyQueue<T> {

    private final MySingleLinkedList<T> queue = new MySingleLinkedList<>();

    @Override
    public void enqueue(T t) {
        queue.addLast(t);
    }

    @Override
    public T dequeue() {
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
