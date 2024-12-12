package ogrenciler.besma.list;

public interface MyList <T>{
    void addFirst(T e);

    void addLast(T e);

    T removeFirst();

    T removeLast();

    T get(int index);

    boolean contains(T e);

    // O(n)
    int size();

    void clean();

    // O(1)
    boolean isEmpty();

}
