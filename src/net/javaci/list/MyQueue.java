package net.javaci.list;

public interface MyQueue<T> extends Collection {

    void enqueue(T t );

    T dequeu();
}
