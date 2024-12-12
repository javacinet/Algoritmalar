package ogrenciler.dogukanAydin.list.Interfaces;

public interface MyStack<T> extends Collection{

    T peek();

    T pop();

    void push(T t);

}
