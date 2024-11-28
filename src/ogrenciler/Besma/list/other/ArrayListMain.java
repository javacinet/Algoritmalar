package ogrenciler.Besma.list.other;

public class ArrayListMain {
    public static void main(String[] args){
        IntLinkedList list = new IntLinkedList();

        for (int i = 0 ; i < 100 ; i++){
            list.addLast((int) (Math.random() * 1000) );
        }

        System.out.println("Size: " + list.size());

        System.out.println("99.indeksteki eleman: " + list.get(99));

        System.out.println("50 listede var mi? " + list.contains(50));
        System.out.println("500 listede var mi? " + list.contains(500));

        System.out.println("1.indeksteki eleman: " + list.get(0));
        System.out.println("2.indeksteki eleman: " + list.get(1));
        System.out.println("3.indeksteki eleman: " + list.get(2));

        list.addFirst(5);

        System.out.println("1.indeksteki eleman: " + list.get(0));
        System.out.println("2.indeksteki eleman: " + list.get(1));
        System.out.println("3.indeksteki eleman: " + list.get(2));

        list.removeLast();

    }
}
