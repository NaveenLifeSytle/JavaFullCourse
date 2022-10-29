public class Main {
   public static BinarySearchTree tree = new BinarySearchTree(50);
    public static void main(String[] args) {


        tree.insert(20);
        tree.insert(10);
        tree.insert(70);
        tree.insert(60);
        tree.insert(55);
        tree.insert(90);
        tree.insert(80);
        tree.insert(75);



        search(1);
        tree.inOrder(tree.root);
        System.out.println();
        tree.delete(70);
        tree.inOrder(tree.root);
    }
    public static  void search(int val){

        if (tree.search(tree.root, val) == null)

            System.out.println("\nnotFound");
        else
            System.out.println( "\n found);                                                                                                                                    Found");
    }


}