package dogukanAydin;

import ogrenciler.dogukanAydin.list.EmptyListException;
import ogrenciler.dogukanAydin.list.IntLinkedList;

public class IntLinkedListTest {
    public static void main(String[] args) {
        IntLinkedList list = new IntLinkedList();

        // Test for addLast() and get()
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        System.out.println("Test addLast and get: ");
        System.out.println(list.get(0) == 10 ? "Passed" : "Failed");
        System.out.println(list.get(1) == 20 ? "Passed" : "Failed");
        System.out.println(list.get(2) == 30 ? "Passed" : "Failed");

        // Test for addFirst()
        list = new IntLinkedList();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        System.out.println("\nTest addFirst and get: ");
        System.out.println(list.get(0) == 30 ? "Passed" : "Failed");
        System.out.println(list.get(1) == 20 ? "Passed" : "Failed");
        System.out.println(list.get(2) == 10 ? "Passed" : "Failed");

        // Test for size()
        list = new IntLinkedList();
        System.out.println("\nTest size: ");
        System.out.println(list.size() == 0 ? "Passed" : "Failed");
        list.addLast(10);
        list.addLast(20);
        System.out.println(list.size() == 2 ? "Passed" : "Failed");

        // Test contains()
        System.out.println("\nTest contains: ");
        System.out.println(list.contains(10) ? "Passed" : "Failed");
        System.out.println(list.contains(30) == false ? "Passed" : "Failed");

        // Test for isEmpty()
        list = new IntLinkedList();
        System.out.println("\nTest isEmpty: ");
        System.out.println(list.isEmpty() ? "Passed" : "Failed");
        list.addLast(10);
        System.out.println(list.isEmpty() == false ? "Passed" : "Failed");

        // Test for clean
        list = new IntLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.clean();
        System.out.println("\nTest clean: ");
        System.out.println(list.size() == 0 ? "Passed" : "Failed");
        System.out.println(list.isEmpty() ? "Passed" : "Failed");

        // Test for removeLast
        list = new IntLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        System.out.println("\nTest removeLast:");
        System.out.println(list.removeLast() == 30 ? "Passed" : "Failed");
        System.out.println(list.size() == 2 ? "Passed" : "Failed");

        // Test for removeFirst
        list = new IntLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        System.out.println("\nTest removeFirst:");
        System.out.println(list.removeFirst() == 10 ? "Passed" : "Failed");
        System.out.println(list.size() == 2 ? "Passed" : "Failed");

        // Test for get() with invalid index
        System.out.println("\nTest for get() with invalid index");
        try {
            list.get(-1);
            System.out.println("Failed");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Passed");
        }

        try {
            list.get(10);
            System.out.println("Failed");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Passed");
        }

        // Test for removeLast() on empty list
        System.out.println("\nTest for removeLast() on empty list");
        list.clean();
        try {
            list.removeLast();
            System.out.println("Failed");
        } catch (EmptyListException e) {
            System.out.println("Passed");
        }

        // Test for removeFirst() on empty list
        System.out.println("\nTest for removeFirst() on empty list");
        try {
            list.removeFirst();
            System.out.println("Failed");
        } catch (EmptyListException e) {
            System.out.println("Passed");
        }
    }
}
