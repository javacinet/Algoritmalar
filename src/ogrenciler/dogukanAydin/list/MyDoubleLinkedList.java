package ogrenciler.dogukanAydin.list;

import ogrenciler.dogukanAydin.Exceptions.EmptyListException;
import ogrenciler.dogukanAydin.list.Interfaces.MyList;

public class MyDoubleLinkedList<T> extends AbstractCollection implements MyList<T> {
    private Node<T> head;

    private Node<T> tail;

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
        head.prev = newNode;
        head = newNode;

        size++;
    }

    @Override
    public void addLast(T e) {
        Node<T> newNode = new Node<>(e);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            size = 1;
            return;
        }

        newNode.prev = tail;
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
            head = null;
            tail = null;
            size = 0;
            return retVal;
        }

        // Node<T> oldHead = head;
        head = head.next;
        head.prev = null;
        // oldHead.next = null;

        size--;

        return retVal;
    }

    @Override
    public T removeLast() {
        if (isEmpty()) {
            throw new EmptyListException();
        }

        T retVal = tail.data;

        if (size == 1) {
            head = null;
            tail = null;
            size = 0;
            return retVal;
        }

        tail = tail.prev;
        tail.next = null;
        size--;

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
        if (size > 1) {

            Node<T> pre = head;
            Node<T> current = head.next;

            while(current != null) {

                pre.next = null;
                pre.prev = null;

                pre = current;
                current = current.next;
            }
        }

        head = null;
        tail = null;
        size = 0;
    }

    private static class Node<T> {
        T data;
        Node<T> next;
        Node<T> prev;

        public Node(T data) {
            this.data = data;
        }
    }


}
