package ogrenciler.YigitOkur.tree;

/*
 * @author of this code Yigit Okur (23Soft1040)
 * github.com/TurkishKEBAB
 */


public class AVLTree {
   public Node root;

   public static void main(String[] args) {
      AVLTree tree = new AVLTree();
      tree.insert(10);
      tree.insert(20);
      tree.insert(30);
      tree.insert(40);
      tree.insert(50);
      tree.insert(25);

      tree.inorder();
   }

   public void insert(int value) {
      root = insertRec(root, value);
   }

   private Node insertRec(Node node, int value) {
      if (node == null) {
         return new Node(value);
      }
      if (value < node.value) {
         node.left = insertRec(node.left, value);
      } else if (value > node.value) {
         node.right = insertRec(node.right, value);
      } else {
         return node;
      }

      node.height = 1 + Math.max(height(node.left), height(node.right));
      int balance = getBalance(node);

      if (balance > 1 && value < node.left.value) {
         return rightRotate(node);
      }
      if (balance < -1 && value > node.right.value) {
         return leftRotate(node);
      }
      if (balance > 1 && value > node.left.value) {
         node.left = leftRotate(node.left);
         return rightRotate(node);
      }
      if (balance < -1 && value < node.right.value) {
         node.right = rightRotate(node.right);
         return leftRotate(node);
      }

      return node;
   }

   private Node rightRotate(Node y) {
      Node x = y.left;
      Node T2 = x.right;

      x.right = y;
      y.left = T2;

      y.height = Math.max(height(y.left), height(y.right)) + 1;
      x.height = Math.max(height(x.left), height(x.right)) + 1;

      return x;
   }

   private Node leftRotate(Node x) {
      Node y = x.right;
      Node T2 = y.left;

      y.left = x;
      x.right = T2;

      x.height = Math.max(height(x.left), height(x.right)) + 1;
      y.height = Math.max(height(y.left), height(y.right)) + 1;

      return y;
   }

   private int height(Node node) {
      return node == null ? 0 : node.height;
   }

   private int getBalance(Node node) {
      return node == null ? 0 : height(node.left) - height(node.right);
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
      int height;
      public Node left;
      public Node right;

      Node(int value) {
         this.value = value;
         height = 1;
      }
   }
}