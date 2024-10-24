package net.javaci.list;

public class MyQueueUsingArrayList<T> implements MyQueue<T> {

    private final MyArrayList<T> queue = new MyArrayList<>();

    @Override
    public void enqueue(T t) {
        queue.addLast(t);
    }

    @Override
    public T dequeu() {
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
