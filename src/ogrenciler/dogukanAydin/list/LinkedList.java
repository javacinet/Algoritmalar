package ogrenciler.dogukanAydin.list;

import ogrenciler.dogukanAydin.list.Exceptions.EmptyListException;

public class LinkedList<T> implements MyList<T> {
    private Node<T> head;

    private static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {this.data = data;}
    }

    @Override
    public void addLast(T e) {
        Node<T> newNode = new Node<>(e) ;

        if (head == null) {
            head = newNode;
            return;
        }

        Node<T> last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next =newNode;
    }

    @Override
    public T get(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException();
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

        throw new IndexOutOfBoundsException(index);
    }

    @Override
    public boolean contains(T e) {
        if (head == null) {
            return false;
        }

        Node<T> current = head;
        while (current != null) {
            if (current.data == e) {
                return true;
            }
            current = current.next;
        }

        return false;
    }

    @Override
    public void addFirst(T e) {
        Node<T> newNode = new Node<>(e) ;
        newNode.next = head;
        head = newNode;
    }

    @Override
    public int size() {
        if (isEmpty()) {
            return 0;
        }

        Node<T> current = head;
        int size = 0;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void clean() {
        head = null;
        System.out.println("MyList cleaned");
    }

    @Override
    public T removeLast() {
        if (isEmpty()) {
            throw new EmptyListException("MyList is empty");
        }

        if (head.next == null) {
            T retVal = head.data;
            head = null;
            return retVal;
        }

        Node<T> prev = null;
        Node<T> current = head;

        while (current.next != null) {
            prev = current;
            current = current.next;
        }

        T retVal = current.data;
        prev.next = null;

        return retVal;
    }

    @Override
    public T removeFirst() {
        if (isEmpty()) {
            throw new EmptyListException("MyList is empty");
        }

        T retVal = head.data;
        head = head.next;
        return retVal;
    }


}