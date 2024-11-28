package ogrenciler.Besma.list.other;

import net.javaci.list.exception.EmptyListException;

public class IntLinkedList {

    private Node head; // Listenin başını temsil eder

    // Listeye eleman ekleme (sonuna ekleme)
    public void addLast(int element) {
        Node newNode = new Node(element); // Yeni bir düğüm oluştur

        if (isEmpty()) { // Eğer liste boşsa
            head = newNode;
            return;
        }

        // Listenin sonuna kadar ilerle
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode; // Yeni düğümü son düğümün next'ine bağla
    }

    // Listenin başına eleman ekleme
    public void addFirst(int element) {
        Node newNode = new Node(element);
        newNode.next = head;
        head = newNode; // Yeni düğüm baş düğüm olarak ayarlanır
    }

    // Listenin belirli bir indeksindeki elemanı döndürme
    public int get(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Indeks negatif olamaz: " + index);
        }

        Node current = head;
        int i = 0;

        while (current != null) {
            if (i == index) {
                return current.data;
            }
            current = current.next;
            i++;
        }

        throw new IndexOutOfBoundsException("Indeks geçersiz: " + index);
    }

    // Listenin eleman içerip içermediğini kontrol etme
    public boolean contains(int element) {
        Node current = head;
        while (current != null) {
            if (current.data == element) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Listenin toplam eleman sayısını döndürme
    public int size() {
        int size = 0;
        Node current = head;

        while (current != null) {
            size++;
            current = current.next;
        }

        return size;
    }

    // Listenin boş olup olmadığını kontrol etme
    public boolean isEmpty() {
        return head == null;
    }

    // Tüm listeyi temizleme
    public void clean() {
        head = null; // Baş düğümü null yaparak listeyi temizle
    }

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
    
    public int removeFirst() {
        if (isEmpty()) {
            throw new EmptyListException();
        }

        int retVal = head.data;
        head = head.next;
        return retVal;
    }

    // İç içe sınıf: Düğüm yapısı
    private static class Node {
        int data; // Düğümdeki veri
        Node next; // Sonraki düğümü işaret eden referans

        public Node(int data) {
            this.data = data;
        }
    }
}
