package ogrenciler.serhat.list;

import net.javaci.list.exception.EmptyListException;

public class MyStackUsingArrayList<T> implements MyStack<T> {
    private final MyList<T> stack = new MyArrayList<>();

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new EmptyListException( );
        }
        return stack.get(0);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new EmptyListException();
        }
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