package ogrenciler.dogukanAydin.list;

import ogrenciler.dogukanAydin.list.Interfaces.MyList;
import ogrenciler.dogukanAydin.list.Interfaces.MyStack;

public class MyStackUsingArrayList<T> implements MyStack<T> {

    private final MyList<T> stack = new MyArrayList<>();

    @Override
    public T peek() {
        return stack.get(1);
    }

    @Override
    public T pop() {
        return stack.removeLast();
    }

    @Override
    public void push(T t) {
        stack.addLast(t);
    }

    @Override
    public int size() {
        return stack.size();
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
