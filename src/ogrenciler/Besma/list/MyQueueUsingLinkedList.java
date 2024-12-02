package ogrenciler.Besma.list;

public class MyQueueUsingLinkedList<T> implements MyQueue<Void> {
    private final MyArrayList<Void> queue = new MyArrayList<>();

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public void enqueue(Object t) {
        queue.addLast((Void) t);
    }

    @Override
    public Void dequeu() {
        return null;
    }

}
