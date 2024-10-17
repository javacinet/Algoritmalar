package YigitOkur.list;
/*
 * @author of this code Yigit Okur (23Soft1040)
 * github.com/TurkishKEBAB
 */


import ogrenciler.YigitOkur.list.ArayayımListe;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DriverClassTest {

   private ArayayımListe list;

   @BeforeEach
   public void setup() {
      list = new ArayayımListe();
   }

   @Test
   public void testsonunaEkle() {
      list.sonunaEkle(10);
      assertEquals(1, list.sizeınKadarKonusAbidin());
      assertEquals(10, list.getLen(0));
   }
   
   @Test
   public void testAddMultiple() {
      for (int i = 0; i < 100; i++) {
         list.sonunaEkle(i);
      }
      assertEquals(100, list.sizeınKadarKonusAbidin());
      assertEquals(99, list.getLen(99));
   }

   @Test
   public void testvarMıSendeTrue() {
      list.sonunaEkle(50);
      assertTrue(list.varMıSende(50));
   }

   @Test
   public void testvarMıSendeFalse() {
      assertFalse(list.varMıSende(50));
   }

   @Test
   public void testsonuncuyuSilelim() {

   }

   @Test
   public void testAddFirst() {
      list.sonunaEkle(20);
      list.sonunaEkle(30);
      list.ilkineEkle(10);
      assertEquals(3, list.sizeınKadarKonusAbidin());
      assertEquals(10, list.getLen(0));
      assertEquals(20, list.getLen(1));
      assertEquals(30, list.getLen(2));
   }

   @Test
   public void testgetLenOutOfBounds() {
      int index = 1;
      list.sonunaEkle(100);
      Exception exception = assertThrows(IndexOutOfBoundsException.class, () -> {
         list.getLen(index);
      });
      assertEquals("Array index out of range: " + index, exception.getMessage());
   }

   @Test
   public void testEmptyListsizeınKadarKonusAbidin() {
      assertEquals(0, list.sizeınKadarKonusAbidin());
   }

   @Test
   public void testAddAndRemoveMixed() {
      list.sonunaEkle(50);
      list.sonunaEkle(100);
      list.sonuncuyuSilelim();
      list.ilkineEkle(10);
      assertEquals(2, list.sizeınKadarKonusAbidin());
      assertEquals(10, list.getLen(0));
      assertEquals(50, list.getLen(1));
   }

}
