package ogrenciler.besma.list;

public class MyQueueUsingArrayList<T> implements MyQueue<T> {

    private final MyArrayList<T> queue = new MyArrayList<>();
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
        queue.addLast((T) t);
    }


    @Override
    public T dequeu() {
        return queue.removeFirst();
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
