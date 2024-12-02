package ogrenciler.Besma.list;

public interface MyList <T>{
    void addFirst(T e);

    void addLast(T e);

    T removeFirst();

    T removeLast();

    T get(int index);

    boolean contains(T e);

    void clean();
}
