package ogrenciler.dogukanAydin.list;

import ogrenciler.dogukanAydin.list.Collection;

public interface MyList<T> extends Collection {

    T get(int index);

    boolean contains(T e);

    void addLast(T e);

    void addFirst(T e);

    void clean();

    T removeLast() ;

    T removeFirst();


}
