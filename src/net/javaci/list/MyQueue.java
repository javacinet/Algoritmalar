package net.javaci.list;

public interface MyQueue<T> extends MyCollection {

    void enqueue(T t );

    T dequeue();
}
