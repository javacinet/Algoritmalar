package net.javaci.list;

public class MyStackUsingLinkedList<T> implements MyStack<T> {
    private final MyList<T> stack = new MyDoubleLinkedList<>();

    @Override
    public T peek() {
        return stack.get(0);
    }

    @Override
    public T pop() {
        return stack.removeFirst();
    }

    @Override
    public void push(T t) {
        stack.addFirst(t);
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
