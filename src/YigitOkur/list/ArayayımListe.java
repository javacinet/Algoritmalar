package YigitOkur.list;

/*
 * @author of this code Yigit Okur (23Soft1040)
 * github.com/TurkishKEBAB
 */

public class ArayayımListe {

   private final int TOPLAM_CAPIN_BU_KADAR_ABIDIN = 16;
   private int[] arayayım;
   private int sizeınKadarKonusAbidin = 0;

   public ArayayımListe() {
      arayayım = new int[TOPLAM_CAPIN_BU_KADAR_ABIDIN];
   }

   public void sonunaEkle(int e) {
      enlargeArray();
      arayayım[sizeınKadarKonusAbidin++] = e;
   }

   public int getLen(int index) {
      if (index >= sizeınKadarKonusAbidin) {
         throw new ArrayIndexOutOfBoundsException(index);
      }
      return arayayım[index];
   }

   public boolean varMıSende(int e) {
      for (int i = 0; i < sizeınKadarKonusAbidin; i++) {
         if (arayayım[i] == e) {
            return true;
         }
      }
      return false;
   }

   public void ilkineEkle(int e) {
      enlargeArray();
      sagaOtele();
      arayayım[0] = e;
      sizeınKadarKonusAbidin++;
   }

   private void sagaOtele() {
      if (arayayım.length <= sizeınKadarKonusAbidin) {
         throw new ArrayIndexOutOfBoundsException(sizeınKadarKonusAbidin);
      }
      for (int i = sizeınKadarKonusAbidin; i > 0; i--) {
         arayayım[i] = arayayım[i - 1];
      }
   }

   private void enlargeArray() {
      if (sizeınKadarKonusAbidin >= arayayım.length) {
         int yeniCapin = arayayım.length * 2;
         int yeniArayayım[] = new int[yeniCapin];
         System.arraycopy(arayayım, 0, yeniArayayım, 0, arayayım.length);
         arayayım = yeniArayayım;
      }
   }

   public int sizeınKadarKonusAbidin() {
      return sizeınKadarKonusAbidin;
   }

   public boolean bosMuGontrolEt() {
      return sizeınKadarKonusAbidin == 0;
   }

   public void temizlikImandandır() {
      arayayım = new int[TOPLAM_CAPIN_BU_KADAR_ABIDIN];
      sizeınKadarKonusAbidin = 0;
   }

   public int sonuncuyuSilelim() {
      if (bosMuGontrolEt()) {
         throw new RuntimeException("ArayayımListem boştur low");
      }
      return arayayım[--sizeınKadarKonusAbidin];
   }

   public int ilkiniSilelim() {
      if (bosMuGontrolEt()) {
         throw new RuntimeException("ArayayımListem boştur low");
      }

      int geriDonusumunDegeri = arayayım[0];
      for (int i = 0; i < sizeınKadarKonusAbidin - 1; i++) {
         arayayım[i] = arayayım[i + 1];
      }

      arayayım[--sizeınKadarKonusAbidin] = 0;
      return geriDonusumunDegeri;
   }

}
