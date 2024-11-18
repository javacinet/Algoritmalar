package ogrenciler.Besma.list;

public interface MyList <T>{
    void addLast (T element); // Listenin sonuna eleman ekleme
    T get(int index); // Belirtilen indeksteki elemanı alma
    boolean contains(T element); // Belirli bir elemanın listede olup olmadığını kontrol etme
    void addFirst(T element); // Listenin başına eleman ekleme

    void clean();
    int size();
    boolean isEmpty();

    T removeFirst();

    T removeLast();

    void shiftRight();
}
