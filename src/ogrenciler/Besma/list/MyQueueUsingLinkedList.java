package ogrenciler.besma.list;

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

    @Override
    public void enqueue(Integer integer) {

    }

    @Override
    public Integer dequeue() {
        return 0;
    }

    @Override
    public Integer peek() {
        return 0;
    }

    @Override
    public void clear() {

    }

}
