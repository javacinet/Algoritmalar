package ogrenciler.Besma.list;

import net.javaci.list.exception.EmptyListException;

// To understand what is Linked list you can watch :: https://www.youtube.com/watch?v=N6dOwBde7-M
public class MyLinkedList<T> implements MyList<T> {
    private Node<T> head;

    // O(1)
    @Override
    public void addFirst(T element) {
        Node<T> newNode = new Node<>(element);
        newNode.next = head;
        head = newNode;
    }

    // O(n)
    @Override
    public void addLast(T element) {
        Node<T> newNode = new Node<>(element);

        if (isEmpty()){
            head = newNode;
            return;
        }
        Node<T> last = head;
        while (last.next != null){
            last = last.next;
        }
        last.next = newNode;
    }

    // O(1)
    @Override
    public T removeFirst() {
        if (isEmpty()) {
            throw new EmptyListException();
        }

        T retVal = head.data; // İlk düğümün verisini sakla
        head = head.next; // head'i bir sonraki düğüme taşı
        return retVal; // Kaldırılan düğümün verisini döndür
    }

    // O(n)
    @Override
    public T removeLast() {
        if (isEmpty()){
            throw new RuntimeException();
        }
        // last -1 . next = null
        Node<T> pre = null;
        Node<T> current = head;
        while (current.next != null){
            pre = current ;
            current = current.next;
        }
        T retval = current.data;
        if (pre == null){
            head = null;
        }else {
            pre.next = null;
        }

        return null;
    }

    @Override
    public void shiftRight() {
    }


    // O(n)
    @Override
    public T get(int index) {
        if (index < 0){
            throw new IndexOutOfBoundsException(index);
        }
        Node<T> current = head;
        int i = 0;
        while (current != null){
            if (i == index){
                return current.data;
            }
            i++;
            current = current.next;
        }
        throw new IndexOutOfBoundsException(index);
    }

    // O(n)
    @Override
    public boolean contains(T element) {
        if (isEmpty()){
            return false;
        }
        Node<T> current = head;
        while (current != null){
             if (current.data.equals(element)){
                 return true;
             }
             current = current.next;
        }
        return false;
    }

    // O(n)
    @Override
    public int size() {
        if (isEmpty()){
            return 0;
        }
        Node<T> current = head;
        int size = 0;
        while (current != null) {
            size ++;
            current = current.next;
        }

        return size();
    }

    // O(1) -  O(n)
    @Override
    public void clean() {
        head = null;
    }

    // O(1)
    @Override
    public boolean isEmpty() {
        return head == null;
    }


    public static class Node<T> {
        public T data;
        public Node<T> next;
        public Node(T data) {
            this.data = data;
        }
    }
}
