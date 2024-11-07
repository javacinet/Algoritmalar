package net.javaci.list;

import net.javaci.list.exception.EmptyListException;

public class MyLinkedListWithTail<T> implements MyList<T> {
    private Node<T> head;

    private Node<T> tail;

    private int size = 0;

    // O()
    @Override
    public void addFirst(T e) {
        Node<T> newNode = new Node<>(e);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            size = 1;
            return;
        }

        newNode.next = head;
        head = newNode;
        size++;

    }

    // O(1)
    @Override
    public void addLast(T e) {
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

    // O(1)
    @Override
    public T removeFirst() {

        if (isEmpty()) {
            throw new EmptyListException();
        }

        T retVal = head.data;

        if (size == 1) {
            clean();
            return retVal;
        }

        head = head.next;
        size--;

        return retVal;
    }

    // O(n)
    @Override
    public T removeLast() {

        if (isEmpty()) {
            throw new EmptyListException();
        }

        if (size == 1) {
            T retVal = head.data;
            clean();
            return retVal;
        }

        // last - 1 . next = null
        Node<T> pre = head;
        Node<T> current = head.next;

        while (current.next != null) {
            pre = current;
            current = current.next;
        }

        T retVal = current.data;

        pre.next = null;

        return retVal;
    }

    @Override
    public T get(int index) {
        if (index < 0 || size <= index) {
            throw new IndexOutOfBoundsException(index);
        }

        Node<T> current = head;
        int i = 0;
        while (current != null) {
            if (i == index) {
                return current.data;
            }
            i++;
            current = current.next;
        }

        return null;
    }

    @Override
    public boolean contains(T e) {
        if (isEmpty()) {
            return false;
        }

        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(e)) {
                return true;
            }
            current = current.next;
        }

        return false;
    }

    @Override
    public void clean() {
        head = null;
        tail = null;
        size = 0;
    }

    // O(1)
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    private static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }
}
