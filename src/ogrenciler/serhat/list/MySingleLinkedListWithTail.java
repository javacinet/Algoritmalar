package ogrenciler.serhat.list;

import net.javaci.list.exception.EmptyListException;

public class MySingleLinkedListWithTail<T> extends AbstractCollection implements MyList<T> {
    private Node<T> head;

    private Node<T> tail;

    @Override
    public void addFirst(T e) {
        if (e == null) {
            throw new NullPointerException();
        }

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

    @Override
    public void addLast(T e) {
        if (e == null) {
            throw new NullPointerException();
        }

        Node<T> newNode = new Node<>(e);

        if (isEmpty()) {

            head = newNode;
            tail = newNode;
            size = 1;
            return;
        }

        if (tail == null) {
            throw new IllegalStateException("tail is null but head is not null");
        }

        tail.next = newNode;
        tail = newNode;
        size++;
    }

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
        Node<T> prev = head;
        Node<T> current = head.next;

        while (current.next != null) {
            prev = current;
            current = current.next;
        }

        T retVal = current.data;

        prev.next = null;
        tail = prev;
        size--;

        return retVal;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        if (isEmpty()) {
            throw new EmptyListException();
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
            throw new EmptyListException();
        }
        if (e == null) {
            throw new NullPointerException();
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
