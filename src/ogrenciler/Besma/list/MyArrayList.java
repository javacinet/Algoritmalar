package ogrenciler.Besma.list;


// O(1) Olmadığını Gösteren Durumlar:
// Döngü veya tekrar varsa (örneğin, dizi veya liste üzerinde işlem yapılıyorsa).
// Girdinin elemanlarına erişim veya tümünü kontrol etme gerekliliği varsa.
// Girdi boyutuyla orantılı bir işlem süresi gerekiyorsa.
public class MyArrayList<T> implements MyList<T> {
    private static final int INITIAL_CAPACITY = 16;
    private T[] array;
    private int size = 0;
    public MyArrayList() {
        init();
    }

    private void init() {
        array = (T[]) new Object[INITIAL_CAPACITY];  // Dizi başlatma
        size = 0;  // Başlangıç boyutu sıfır
    }

    // O(1):
    @Override
    public void addLast(T element) {
        // Eğer kapasite doluysa diziyi genişlet
        if (size >= array.length){
            enlargeArray();
        }
        array[size++]= element; // Elemanı ekle ve boyutu artır
    }

    // O(1):
    @Override
    //Geçerli bir indeks kontrolü yapar.
    public T get(int index) {
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Geçersiz indeks: " + index);
        }
        return array[index];
    }

    // O(n):
    @Override
    public boolean contains(T element) {
        for(int i = 0 ; i< size; i++){  // Listedeki tüm elemanları kontrol et
            if (array[i].equals(element)){
                return true;
            }
        }
        return false;
    }

    // O(n):
    @Override
    public void addFirst(T element) {
        if (size >= array.length){
            enlargeArray();
        }
        // Elemanları bir adım sağa kaydır

        for (int i = size; i > 0 ; i--){
            array[i] = array[i - 1] ;
        }
        // İlk pozisyona yeni elemanı yerleştir
        array[0] = element;
        size++; // Boyutu artır
    }
    // O(n):
    public void shiftRight() {
        // Hocamın kodunda sağa kaydırma işlemi ayrı bir metoda (shiftRight) taşınarak kod tekrarını azaltıp
        // daha düzenli bir yapı sağlarken benim yukarda yazdığım kod blokunda daha sade bir yöntem kullanılsa da
        // başka bir yerde de sağa kaydırma gerekirse tekrar yazmam gerekecektir.

        if (size >= array.length) {
            throw new ArrayIndexOutOfBoundsException(size);
        }
        for (int i = size; i > 0; i--) {
            array[i] = array[i - 1];
        }
    }

    // O(n):
    private void enlargeArray() {
        if (size >= array.length){
            T[] newArray = (T[]) new Object[array.length * 2]; // Yeni kapasiteyi iki katına çıkar

            // Eski elemanları taşımak kısmında ben "System.arraycopy(array,0,newArray,0, size yazmıştım);
            // avantajı: Performans açısından daha verimli, çünkü yalnızca kullanılan elemanlar kopyalanıyor.
            // Hocamın yöntemi: Hata yapma riskini azaltıyor; örneğin, ileride kapasite kontrolüyle ilgili bir hata yapılırsa sorun çıkmaz.

            System.arraycopy(array,0,newArray,0, array.length);
            // System.arraycopy(sourceArray, sourcePos, destArray, destPos, length);
            // System.arraycopy() metodu, Java'da mevcut bir diziden başka bir diziye elemanları hızlı bir şekilde kopyalamak için kullanılan bir yöntemdir.
            // sourceArray: Elemanları kopyalayacağınız kaynak dizi.
            // sourcePos: Kaynak dizideki kopyalamaya başlanacak pozisyon (indeks).
            // destArray: Elemanların kopyalanacağı hedef dizi.
            // destPos: Hedef dizide elemanların yerleştirileceği başlangıç pozisyonu (indeks).
            // length: Kopyalanacak elemanların sayısı.
            // Performans açısından çok optimize edilmiş bir yöntemdir ve doğrudan sistem seviyesinde çalıştığı için elle döngü ile kopyalama işlemine göre daha hızlıdır.
            array = newArray;
        }
    }

    // O(1):
    @Override
    public int size() {
        return size;
    }

    // O(1):
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    // O(1):
    @Override
    public void clean() {
        init(); // Diziyi ve boyutunu sıfırlamak için `init` metodunu çağırıyoruz.
    }

    // O(n):
    @Override
    public T removeFirst() {
        if (isEmpty()) {
            throw new RuntimeException("MyArrayList is empty");
        }
        T removedElement = array[0]; // İlk elemanı kaydet
        for (int i = 0; i < size - 1; i++) { // Elemanları sola kaydır
            array[i] = array[i + 1];
        }
        size--; // Boyutu azalt
        return removedElement; // Çıkarılan elemanı döndür
    }

    // O(1):
    @Override
    public T removeLast() {
        if (isEmpty()) { // Liste boşsa hata fırlat
            throw new RuntimeException("MyArrayList is empty");
        }
        return array[--size]; // Son elemanı döndür ve boyutu azalt
    }
}
