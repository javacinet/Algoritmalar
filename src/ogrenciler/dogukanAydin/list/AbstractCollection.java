package ogrenciler.dogukanAydin.list;

import ogrenciler.dogukanAydin.list.Interfaces.Collection;

public class AbstractCollection implements Collection {
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
