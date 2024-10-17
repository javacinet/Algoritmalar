package ogrenciler.YigitOkur.list;

import java.util.Random;

public class DriverClass {

   public static void main(String[] args) {
      Random rd = new Random();
      ArayayımListe list = new ArayayımListe();

      list.sonunaEkle(10);
      list.sonunaEkle(20);
      list.sonunaEkle(30);
      System.out.println("Size: " + list.sizeınKadarKonusAbidin());
      System.out.println("Element at index 0: " + list.getLen(0));
      System.out.println("Element at index 1: " + list.getLen(1));
      System.out.println("Element at index 2: " + list.getLen(2));
      System.out.println("List contains 20: " + list.varMıSende(20));
      System.out.println("List contains 40: " + list.varMıSende(40));

      list.ilkineEkle(5);
      System.out.println("Element at index 0 after adding to the beginning: " + list.getLen(0));

      list.sonuncuyuSilelim();
      System.out.println("Size after removing the last element: " + list.sizeınKadarKonusAbidin());

      list.ilkiniSilelim();
      System.out.println("Size after removing the first element: " + list.sizeınKadarKonusAbidin());

      list.temizlikImandandır();
      System.out.println("Size after clearing the list: " + list.sizeınKadarKonusAbidin());


      for (int i = 0; i < 100; i++) {
         int sayımıBelirleLa = rd.nextInt(0, 1000);
         list.sonunaEkle(sayımıBelirleLa);
      }
      System.out.println("Size after adding 100 random elements: " + list.sizeınKadarKonusAbidin());
      System.out.println("Element at index 99: " + list.getLen(99));
      System.out.println("List contains 500: " + list.varMıSende(500));
   }
}