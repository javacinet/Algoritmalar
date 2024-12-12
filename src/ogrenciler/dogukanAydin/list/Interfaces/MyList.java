package ogrenciler.dogukanAydin.list.Interfaces;

public interface MyList<T> extends Collection{

    void addFirst(T e);

    void addLast(T e);

    T removeFirst();

    T removeLast();

    T get(int index);

    boolean contains(T e);

    void clean();

    default T getLast() {
        return get(size()-1);
    }
}
