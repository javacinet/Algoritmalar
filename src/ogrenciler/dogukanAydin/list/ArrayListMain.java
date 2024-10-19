package ogrenciler.dogukanAydin.list;

public class ArrayListMain {
    public static void main(String[] args) {
        Arraylist list = new Arraylist();

        for (int i = 0; i < 16; i++) {
            list.addLast(i);
        }

        System.out.println(list);

        System.out.println("Size: " + list.size());

        list.addLast(12);

        list.listeyiGoster();

        list.shiftRight(4);

        System.out.println("a");

        list.listeyiGoster();
    }
}
