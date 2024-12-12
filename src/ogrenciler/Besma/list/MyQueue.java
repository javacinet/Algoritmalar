package ogrenciler.Besma.list;
public interface MyQueue<T> extends Collection {
    void enqueue(Object t);

    T dequeu();

    void enqueue(Integer integer);

    Integer dequeue();

    Integer peek();

    void clear();
}
