package ogrenciler.dogukanAydin.list;

public interface IntList {

    void addLast(int e);

    int get(int index);

    boolean contains(int e);

    void addFirst(int e);

    int size();

    boolean isEmpty();

    void clean();

    int removeLast() ;

    int removeFirst();

}
