package ogrenciler.besma.list;

import net.javaci.list.MyDoubleLinkedList;

public class MyStackUsingLinkedList<T> implements MyStack<Object> {
    private final MyDoubleLinkedList<Object> stack = new MyDoubleLinkedList<>();
    @Override
    public int size() {
        return stack.size();
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public Object peek() {
        return stack.get(0);
    }

    @Override
    public Object pop() {
        return stack.removeFirst();
    }

    @Override
    public void push(Object t) {
        stack.addFirst(t);
    }

    @Override
    public void clear() {

    }
}
