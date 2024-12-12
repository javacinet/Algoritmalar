package YigitOkur.tree;

import ogrenciler.YigitOkur.tree.AVLTree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 * Author: Yigit Okur (23Soft1040)
 * github.com/TurkishKEBAB
 */

class AVLTreeTest {

   private AVLTree tree;

   @BeforeEach
   void setup() {
      tree = new AVLTree();
   }

   @Test
   void testInsert() {
      tree.insert(10);
      tree.insert(20);
      tree.insert(30);
      tree.insert(40);
      tree.insert(50);
      tree.insert(25);

      assertEquals(30, tree.root.value);
      assertEquals(20, tree.root.left.value);
      assertEquals(40, tree.root.right.value);
   }

   @Test
   void testInorder() {
      tree.insert(10);
      tree.insert(20);
      tree.insert(30);
      tree.insert(40);
      tree.insert(50);
      tree.insert(25);

      java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
      System.setOut(new java.io.PrintStream(out));

      tree.inorder();

      assertEquals("10 20 25 30 40 50 ", out.toString());
   }
}