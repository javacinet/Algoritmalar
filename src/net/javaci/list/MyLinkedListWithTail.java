package net.javaci.list;

public class MyLinkedListWithTail<T> implements MyList<T> {
    private Node<T> head;

    private Node<T> tail;

    private int size = 0;

    // O(1)
    @Override
    public void addFirst(T e) {
        Node<T> newNode = new Node<T>(e);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            size = 1;
            return;
        }

        tail.next = newNode;
        tail = newNode;
        size++;
    }

    @Override
    public void addLast(T e) {

    }

    @Override
    public T removeFirst() {
        return null;
    }

    @Override
    public T removeLast() {
        return null;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public boolean contains(T e) {
        return false;
    }

    @Override
    public void clean() {

    }

    // O(1)
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    private static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }
}
