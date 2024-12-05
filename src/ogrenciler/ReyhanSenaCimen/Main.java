package ogrenciler.ReyhanSenaCimen;

public class Main {
    public static void main(String[] args) {

        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<>();
        doublyLinkedList.addFirst(10);
        doublyLinkedList.addLast(20);
        doublyLinkedList.addFirst(5);
        System.out.println("Doubly Linked List Size: " + doublyLinkedList.getSize());
        System.out.println("Removed First: " + doublyLinkedList.removeFirst());
        System.out.println("Removed Last: " + doublyLinkedList.removeLast());
        System.out.println("Size After Removals: " + doublyLinkedList.getSize());


        Queue<String> queue = new Queue<>();
        queue.enqueue("Rey");
        queue.enqueue("Reyy");
        queue.enqueue("Reyyy");
        System.out.println("\nQueue Size: " + queue.getSize());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Size After Dequeues: " + queue.getSize());


        Stack<Double> stack = new Stack<>();
        stack.push(1.1);
        stack.push(2.2);
        stack.push(3.3);
        System.out.println("\nStack Size: " + stack.getSize());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Size After Pops: " + stack.getSize());
    }
}
