package net.javaci.referanslar;

public class OgrenciMain {
    public static void main(String[] args) {
        Ogrenci og1 = new Ogrenci("Umut", 25);
        Ogrenci og2 = new Ogrenci("Besma", 23);
        Ogrenci og3 = og1;

        System.out.println(og3.adi);
        og3.adi = "volkan";
        System.out.println(og1.adi);

        og3 = og2;

        og2.adi = "Onur";

        System.out.println(og1.adi);
        System.out.println(og3.adi);

    }
}
