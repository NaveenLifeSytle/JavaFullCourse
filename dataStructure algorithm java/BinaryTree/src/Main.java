public class Main {
    public static void main(String[] args) {

BinaryTree tree=new BinaryTree(10);
tree.insertLeft(tree.root,5);
tree.insertRight(tree.root,15);
tree.insertLeft(tree.root.left,3);
tree.insertRight(tree.root.left,8);
tree.insertLeft(tree.root.right,12);
//traversal
     //we can achieve it in three ways
        // preOrder - root left  right
        //InOrder   - left root  right
        //postOrder - left right root

BinaryTree.preOrder(tree.root);
System.out.println();
BinaryTree.ineOrder(tree.root);
System.out.println();
BinaryTree.postOrder(tree.root);
    }
}