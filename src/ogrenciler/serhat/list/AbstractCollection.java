package ogrenciler.serhat.list;

public class AbstractCollection implements MyCollection {
    protected int size = 0;
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
