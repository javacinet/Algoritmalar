package ogrenciler.besma.list;
public interface MyStack<T> extends Collection {
    T peek();
    T pop();
    void push(T t);

    void clear();
}
