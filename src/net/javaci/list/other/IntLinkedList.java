package net.javaci.list.other;

public class IntLinkedList implements IntList {

    private Node head;

    // O(n)
    @Override
    public void addLast(int e) {
        Node newNode = new Node(e);

        if (isEmpty()) {
            head = newNode;
            return;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    // O(n)
    @Override
    public int get(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException(index);
        }

        Node current = head;
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

    // O(n)
    @Override
    public boolean contains(int e) {
        if (isEmpty()) {
            return  false;
        }

        Node current = head;
        while (current != null) {
            if (current.data == e) {
                return true;
            }
            current = current.next;
        }

        return false;
    }

    // O(1)
    @Override
    public void addFirst(int e) {
        Node newNode = new Node(e);

        newNode.next = head;
        head = newNode;
    }

    // O(n)
    @Override
    public int size() {
        if (isEmpty()) {
            return 0;
        }

        Node current = head;
        int size = 0;
        while (current != null) {
            size++;
            current = current.next;
        }

        return size;
    }

    // O(1)
    @Override
    public boolean isEmpty() {
        return head == null;
    }

    // O(1) -  O(n)
    @Override
    public void clean() {
        head = null;
    }

    // O(n)
    @Override
    public int removeLast() {
        if (isEmpty()) {
            throw new EmptyListException();
        }

        // last - 1 . next = null
        Node pre = null;
        Node current = head;

        while (current != null) {
            pre = current;
            current = current.next;
        }

        int retVal = pre.data;
        pre.next = null;

        return retVal;
    }

    // O(1)
    @Override
    public int removeFirst() {
        if (isEmpty()) {
            throw new EmptyListException();
        }

        int retVal = head.data;
        head = head.next;
        return retVal;
    }

    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}
