package tree.binary;

public class Node {
    public Integer key;
    public Node left, right;

    Node(Integer key){
        this.key = key;
        this.left = this.right = null;
    }
}
