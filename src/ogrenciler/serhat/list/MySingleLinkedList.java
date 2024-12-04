package ogrenciler.serhat.list;

import net.javaci.list.exception.EmptyListException;

public class MySingleLinkedList<T> implements MyList<T> {

    private Node<T> head;
    private int size;

    @Override
    public void addFirst(T e) {
        Node<T> newNode = new Node<>(e);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }


    @Override
    public void addLast(T e) {
        Node<T> newNode = new Node<>(e);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    @Override
    public T removeFirst() {
        if (isEmpty()) {
            throw new EmptyListException();
        }
        T data = head.data;
        head = head.next;
        size--;
        return data;
    }

    @Override
    public T removeLast() {
        if (isEmpty()) {
            throw new EmptyListException();
        }
        Node<T> current = head;
        Node<T> prev = null;
        while (current.next != null) {
            prev = current;
            current = current.next;
        }
        if (prev == null) {
            head = null;
        } else {
            prev.next = null;
        }
        size--;
        return current.data;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(index);
        }
        if (isEmpty()) {
            throw new EmptyListException();
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
           if (i == index) {
               return current.data;
           }
            current = current.next;
        }

        return current.data;
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


    public static class Node<T> {
        public T data;
        public Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }
}
