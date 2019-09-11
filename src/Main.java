import tree.binary.BinaryTree;
import tree.binary.BinaryTreeImp;
import tree.binary.Node;

public class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTreeImp();

        Node root = binaryTree.createTree(0);
        for(int i = 1; i <= 1000; i++){
            binaryTree.insert(root, i);
        }
        binaryTree.levelOrderTraversal(root);
        System.out.println("");
        binaryTree.deleteNode(root, 10001);
        binaryTree.deleteNode(root, 501);
    }
}
