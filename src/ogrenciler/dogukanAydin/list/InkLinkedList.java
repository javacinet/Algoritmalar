package ogrenciler.dogukanAydin.list;

public class InkLinkedList implements IntList {
    private Node head;

    private static class Node {
        int data;
        Node next;

        public Node(int data) {this.data = data;}
    }

    @Override
    public void addLast(int e) {
        Node newNode = new Node(e) ;

        if (head == null) {
            head = newNode;
            return;
        }

        Node last = head;
        while (last.next != 0) {
            last = last.next;
        }
        last.next =newNode;
    }

    @Override
    public int get(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException();
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

    @Override
    public boolean contains(int e) {
        if (head == null) {
            return false;
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

    @Override
    public void addFirst(int e) {
        Node newNode = new Node(e) ;

        newNode.next = head;
        head = newNode;
    }

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

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void clean() {
        head = null;
        System.out.println("List cleaned");
    }

    @Override
    public int removeLast() {
        if (isEmpty()) {
            throw new EmptyListException("List is empty");
        }

        Node prev = null;
        Node current = head;

        while (current != null) {
            prev = current;
            current = current.next;
        }

        int retVal = prev.data;
        prev.next = null;

        return retVal;
    }

    @Override
    public int removeFirst() {
        if (isEmpty()) {
            throw new EmptyListException("List is empty");
        }

        int retVal = head.data;
        head = head.next;
        return retVal;
    }


}
