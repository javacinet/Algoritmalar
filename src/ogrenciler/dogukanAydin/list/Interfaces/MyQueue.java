package ogrenciler.dogukanAydin.list.Interfaces;

public interface MyQueue<T> extends Collection {

    void enqueue(T t);

    T dequeue();
}
