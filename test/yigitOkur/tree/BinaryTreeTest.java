package yigitOkur.tree;

import ogrenciler.yigitOkur.tree.BinaryTree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 * Author: Yigit Okur (23Soft1040)
 * github.com/TurkishKEBAB
 */

class BinaryTreeTest {

   private BinaryTree tree;

   @BeforeEach
   void setup() {
      tree = new BinaryTree();
   }

   @Test
   void testInsert() {
      tree.insert(50);
      tree.insert(30);
      tree.insert(20);
      tree.insert(40);
      tree.insert(70);
      tree.insert(60);
      tree.insert(80);

      assertEquals(50, tree.root.value);
      assertEquals(30, tree.root.left.value);
      assertEquals(70, tree.root.right.value);
   }

   @Test
   void testInorder() {
      tree.insert(50);
      tree.insert(30);
      tree.insert(20);
      tree.insert(40);
      tree.insert(70);
      tree.insert(60);
      tree.insert(80);

      java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
      System.setOut(new java.io.PrintStream(out));

      tree.inorder();

      assertEquals("20 30 40 50 60 70 80 ", out.toString());
   }
}