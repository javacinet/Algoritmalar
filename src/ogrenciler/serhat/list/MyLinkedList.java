package ogrenciler.serhat.list;

public class MyLinkedList<T> implements MyList<T> {

    private Node<T> head;
    private Node<T> tail;

    private int size;

    @Override
    public void addFirst(T e) {
        Node<T> newNode = new Node<>(e);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;

        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;

    }

    @Override
    public void addLast(T e) {
        Node<T> newNode = new Node<>(e);
        if (isEmpty()) {
            head = newNode;
            tail = head;
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
            throw new RuntimeException("The list is empty!");
        }
        T removedElement = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return removedElement;
    }

    @Override
    public T removeLast() {
        if (isEmpty()) {
            throw new RuntimeException("The list is empty!");
        }
        T removedElement = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return removedElement;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
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
        if (isEmpty()) {
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
    public void clean() {
        head = null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }


    public static class Node<T> {
        T data;
        Node<T> next;
        Node<T> prev;

        public Node(T data) {
            this.data = data;
        }
    }
}
