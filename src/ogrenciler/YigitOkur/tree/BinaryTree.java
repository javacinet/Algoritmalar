package ogrenciler.YigitOkur.tree;

/*
 * @author of this code Yigit Okur (23Soft1040)
 * github.com/TurkishKEBAB
 */

public class BinaryTree {
   public Node root;

   public static void main(String[] args) {
      BinaryTree tree = new BinaryTree();
      tree.insert(50);
      tree.insert(30);
      tree.insert(20);
      tree.insert(40);
      tree.insert(70);
      tree.insert(60);
      tree.insert(80);

      tree.inorder();
   }

   public void insert(int value) {
      root = insertRec(root, value);
   }

   private Node insertRec(Node root, int value) {
      if (root == null) {
         root = new Node(value);
         return root;
      }
      if (value < root.value) {
         root.left = insertRec(root.left, value);
      } else if (value > root.value) {
         root.right = insertRec(root.right, value);
      }
      return root;
   }

   public void inorder() {
      inorderRec(root);
   }

   private void inorderRec(Node root) {
      if (root != null) {
         inorderRec(root.left);
         System.out.print(root.value + " ");
         inorderRec(root.right);
      }
   }

   public static class Node {
      public int value;
      public Node left;
      public Node right;

      Node(int value) {
         this.value = value;
         left = right = null;
      }
   }
}