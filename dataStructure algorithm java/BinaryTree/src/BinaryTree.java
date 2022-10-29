public class BinaryTree {

    Node root;


    class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = null;
            right = null;
        }
    }

    BinaryTree(int d) {
        root = new Node(d);
    }

    public void insertLeft(Node root, int val) {

        Node newNode = new Node(val);

        root.left = newNode;

    }

    public void insertRight(Node root, int val) {
        Node newNode = new Node(val);

        root.right = newNode;
    }

    public static void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }

    }

    public static void ineOrder(Node root) {
        if (root != null) {

            ineOrder(root.left);
            System.out.print(root.data+" ");
            ineOrder(root.right);
        }

    }

    public static void postOrder(Node root) {
        if (root != null) {

            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }


    }
}