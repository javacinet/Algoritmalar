package ogrenciler.serhat.list;

public interface MyStack<T> extends MyCollection {
    T peek();

    T pop();

    void push(T t);
}
