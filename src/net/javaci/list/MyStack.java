package net.javaci.list;

public interface MyStack<T> extends MyCollection {

    T peek();

    T pop();

    void push(T t);
}
