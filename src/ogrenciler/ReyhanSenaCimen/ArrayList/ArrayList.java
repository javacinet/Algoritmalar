package ogrenciler.ReyhanSenaCimen.ArrayList;

import java.util.Scanner;

public class ArrayList {
    private final int init_capacity = 16;
    private int[] array;
    private int size = 0;

    public ArrayList() {
        array = new int[init_capacity];
    }

    public void arrayLarger() {
        if (size >= array.length) {
            int[] newArr = new int[array.length * 2];

            for (int i = 0; i < array.length; i++) {
                newArr[i] = array[i];
            }
            array = newArr;
        }
    }

    public void addLast(int newlast) {
        arrayLarger();

        for (int i = 0; i < array.length; i++) {

            if (array[i] == 0) {
                array[i] = newlast;
                size++;
                return;
            }
        }
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Unvalid Index");
        }
        return array[index];
    }

    public boolean contains(int elem) {
        for (int i = 0; i < size; i++) {
            if (array[i] == elem) {
                return true;
            }
        }
        return false;
    }

    public void showArray() {
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");

        }
    }

    public int size() {
        return size;
    }

    public void shiftRight(int position) {
        if (array.length <= size) {
            arrayLarger();
        }
        for (int i = size - 1; i >= 0; i--) {
            array[i + position] = array[i];
        }

        for (int i = 0; i < position; i++) {
            array[i] = 0;
        }
    }

    public void addSomewhere(int where, int number) {
        Scanner scan = new Scanner(System.in);
        if (array[where] != 0) {
            System.out.println("There is already an element at position " + where);
            System.out.println("Would you like to override it or shift elements to the right?");
            System.out.print("Type 'override' or 'shift': ");
            String answer = scan.nextLine();

            if (answer.equalsIgnoreCase("override")) {
                array[where] = number;
            } else if (answer.equalsIgnoreCase("shift")) {
                shiftRight(where);
                array[where] = number;
                size++;
            } else {
                System.out.println("Invalid input. Please type 'override' or 'shift'.");
            }
        } else {
            array[where] = number;
            size++;
        }
    }

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();

        System.out.println("addLast() method:");
        arrayList.addLast(10);
        arrayList.addLast(20);
        arrayList.addLast(30);
        System.out.print("Array contents: ");
        arrayList.showArray();
        System.out.println("\n");

        System.out.println("get() method:");
        try {
            System.out.println("Element at index 1: " + arrayList.get(1));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        // contains() method test
        System.out.println("contains() method:");
        System.out.println("Does the array contain 20? " + arrayList.contains(20));
        System.out.println("Does the array contain 40? " + arrayList.contains(40));
        System.out.println();

        // shiftRight() method test
        System.out.println("shiftRight() method:");
        arrayList.shiftRight(2);
        System.out.print("Array after shifting right: ");
        arrayList.showArray();
        System.out.println("\n");

        // addSomewhere() method test
        System.out.println("addSomewhere() method:");
        arrayList.addSomewhere(1, 50);
        System.out.print("Array after adding at specific position: ");
        arrayList.showArray();
        System.out.println("\n");

        // size() method test
        System.out.println("size() method:");
        System.out.println("Number of elements in the array: " + arrayList.size());
    }
}
