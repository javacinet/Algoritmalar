package ogrenciler.Besma.list;
public interface MyQueue<T> extends Collection {
    void enqueue(Object t);

    T dequeu();

    public interface MyQueue<T> {
        int size();                // Kuyruk boyutunu döndürür
        boolean isEmpty();         // Kuyruğun boş olup olmadığını kontrol eder
        void enqueue(T t);         // Kuyruğa bir eleman ekler
        T dequeue();               // Kuyruktan bir eleman çıkarır ve döndürür
    }

}
