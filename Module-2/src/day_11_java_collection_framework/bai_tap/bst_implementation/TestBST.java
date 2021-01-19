package day_11_java_collection_framework.bai_tap.bst_implementation;

public class TestBST {
    public static void main(String[] args) {
        //create a BST
        BST<String> tree = new BST<>();
        tree.insert("George");
        tree.insert("Michael");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");
        //traverse tree
        System.out.println("===Inorder (sorted)===");
        tree.inorder();
        System.out.println("===Preorder (sorted)===");
        tree.preorder();
        System.out.println("===Postorder (sorted)===");
        tree.postorder();
        System.out.println("The number of nodes is: " + tree.getSize());
        //delete node
        System.out.println("===Delete \"George\"===");
        tree.delete("George");
        tree.preorder();
    }
}
