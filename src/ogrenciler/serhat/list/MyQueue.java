package ogrenciler.serhat.list;

public interface MyQueue<T> extends MyCollection {

    void enqueue(T t );

    T dequeue();
}
