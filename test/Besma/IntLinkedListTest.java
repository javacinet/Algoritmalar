package Besma;

import ogrenciler.Besma.list.other.IntLinkedList;

public class IntLinkedListTest {
    public static void main(String[] args) {
        IntLinkedList list = new IntLinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        System.out.println("Liste boyutu: " + list.size()); // 3
        System.out.println("İlk eleman: " + list.get(0));   // 10
        System.out.println("Son eleman: " + list.get(2));   // 30
        System.out.println("20 içeriyor mu? " + list.contains(20)); // true
        System.out.println("50 içeriyor mu? " + list.contains(50)); // false

        list.clean();
        System.out.println("Liste temizlendi. Boş mu? " + list.isEmpty()); // true
    }

}


