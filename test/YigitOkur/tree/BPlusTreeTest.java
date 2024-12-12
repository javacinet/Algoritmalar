package YigitOkur.tree;

/*
 * Author: Yigit Okur (23Soft1040)
 * github.com/TurkishKEBAB
 */

import ogrenciler.YigitOkur.tree.BPlusTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BPlusTreeTest {

   @Test
   void insert() {
      BPlusTree tree = new BPlusTree();
      tree.insert(10);
      tree.insert(20);
      tree.insert(5);
      tree.insert(6);
      tree.insert(12);
      tree.insert(30);
      tree.insert(7);
      tree.insert(17);

      // Check if the root has the correct keys
      assertEquals(1, tree.root.keys.size());
      assertEquals(5, (int) tree.root.keys.getFirst());
   }

   @Test
   void traverse() {
      BPlusTree tree = new BPlusTree();
      tree.insert(10);
      tree.insert(20);
      tree.insert(5);
      tree.insert(6);
      tree.insert(12);
      tree.insert(30);
      tree.insert(7);
      tree.insert(17);

      // Capture the output of the traverse method
      java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
      System.setOut(new java.io.PrintStream(out));

      tree.traverse();

      // Check if the traverse method prints the keys in sorted order
      assertEquals("20 10 5 12 6 30 7 17 ", out.toString());
   }
}