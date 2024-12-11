package ogrenciler.ReyhanSenaCimen;


public class DoublyLinkedList<T> {

    private class Node {
        T data;
        Node prev, next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node head, tail;
    private int size = 0;


    public void addFirst(T data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }


    public void addLast(T data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }


    public T removeFirst() {
        if (head == null)
            return null;
        T data = head.data;
        head = head.next;
        if (head != null)
            head.prev = null;
        else
            tail = null;
        size--;
        return data;
    }


    public T removeLast() {
        if (tail == null)
            return null;
        T data = tail.data;
        tail = tail.prev;
        if (tail != null)
            tail.next = null;
        else
            head = null;
        size--;
        return data;
    }


    public int getSize() {
        return size;
    }
}
