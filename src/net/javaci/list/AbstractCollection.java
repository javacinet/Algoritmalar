package net.javaci.list;

public class AbstractCollection implements MyCollection {
    protected int size = 0;

    // O(1)
    @Override
    public int size() {
        return size;
    }

    // O(1)
    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
