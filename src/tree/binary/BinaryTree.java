package tree.binary;

public interface BinaryTree {
    public Node createTree(Integer key);
    public void insert(Node root, Integer key);
    public void levelOrderTraversal(Node root);
    public void deleteNode(Node root, Integer key);
}
