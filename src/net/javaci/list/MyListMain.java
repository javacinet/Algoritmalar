package net.javaci.list;

public class MyListMain {
    public static void main(String[] args) {
        MyList<Integer> list = new MyLinkedList<>();

        for (int i = 0; i < 100; i++) {
            list.addLast((int) (Math.random() * 1000));
        }

        System.out.println("Size: " + list.size());

        System.out.println("99. indekteki eleman: " + list.get(99));

        System.out.println("50 listede var mi? " + list.contains(50));
        System.out.println("500 listede var mi? " + list.contains(500));

        System.out.println("1. indekteki eleman: " + list.get(0));
        System.out.println("2. indekteki eleman: " + list.get(1));
        System.out.println("3. indekteki eleman: " + list.get(2));

        list.addFirst(5);

        System.out.println("1. indekteki eleman: " + list.get(0));
        System.out.println("2. indekteki eleman: " + list.get(1));
        System.out.println("3. indekteki eleman: " + list.get(2));

        list.removeLast();


        MyList<String> strList = new MyArrayList<>();

        strList.addLast("str1");
        strList.addLast("str2");
        strList.addLast("str3");

        System.out.println(strList.removeFirst());
        System.out.println(strList.get(0));
    }
}
