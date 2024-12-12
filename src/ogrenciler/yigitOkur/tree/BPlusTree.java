package ogrenciler.yigitOkur.tree;

/*
 * @author of this code Yigit Okur (23Soft1040)
 * github.com/TurkishKEBAB
 */

import java.util.ArrayList;
import java.util.Collections;

public class BPlusTree {
   private static final int T = 3;
   public Node root = new Node();

   public static void main(String[] args) {
      BPlusTree tree = new BPlusTree();
      tree.insert(10);
      tree.insert(20);
      tree.insert(5);
      tree.insert(6);
      tree.insert(12);
      tree.insert(30);
      tree.insert(7);
      tree.insert(17);

      tree.traverse();
   }

   public void insert(int key) {
      Node r = root;
      if (r.keys.size() == T - 1) {
         Node s = new Node();
         root = s;
         s.isLeaf = false;
         s.children.add(r);
         splitChild(s, 0);
         insertNonFull(s, key);
      } else {
         insertNonFull(r, key);
      }
   }

   private void splitChild(Node x, int i) {
      Node z = new Node();
      Node y = x.children.get(i);
      z.isLeaf = y.isLeaf;
      for (int j = 0; j < T / 2 - 1; j++) {
         z.keys.add(y.keys.remove(T / 2));
      }
      if (!y.isLeaf) {
         for (int j = 0; j < T / 2; j++) {
            z.children.add(y.children.remove(T / 2));
         }
      }
      x.children.add(i + 1, z);
      x.keys.add(i, y.keys.removeFirst());
   }

   private void insertNonFull(Node x, int k) {
      int i = x.keys.size() - 1;
      if (x.isLeaf) {
         x.keys.add(k);
         Collections.sort(x.keys);
      } else {
         while (i >= 0 && k < x.keys.get(i)) {
            i--;
         }
         i++;
         Node child = x.children.get(i);
         if (child.keys.size() == T - 1) {
            splitChild(x, i);
            if (k > x.keys.get(i)) {
               i++;
            }
         }
         insertNonFull(x.children.get(i), k);
      }
   }

   public void traverse() {
      traverse(root);
   }

   private void traverse(Node node) {
      for (int i = 0; i < node.keys.size(); i++) {
         if (!node.isLeaf) {
            traverse(node.children.get(i));
         }
         System.out.print(node.keys.get(i) + " ");
      }
      if (!node.isLeaf) {
         traverse(node.children.get(node.keys.size()));
      }
   }

   public static class Node {
      public ArrayList<Integer> keys;
      ArrayList<Node> children;
      boolean isLeaf = true;

      Node() {
         keys = new ArrayList<>(T - 1);
         children = new ArrayList<>(T);
      }
   }
}