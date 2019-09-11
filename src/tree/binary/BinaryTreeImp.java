package tree.binary;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeImp implements BinaryTree {
    public Node createTree(Integer key){
        return new Node(key);
    }

    public void insert(Node root, Integer key){
        if(root == null){
            return;
        }
        else{
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);

            while (!queue.isEmpty()){
                Node node = queue.peek();
                queue.remove();

                if(node.left != null && node.right != null){
                    queue.add(node.left);
                    queue.add(node.right);
                }
                else if(node.left == null){
                    Node newNode = new Node(key);
                    node.left = newNode;
                    return;
                }
                else{
                    Node newNode = new Node(key);
                    node.right = newNode;
                    return;
                }
            }
        }
    }

    public void levelOrderTraversal(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            Node node = queue.peek();
            queue.remove();
            System.out.print(node.key +" ");
            if(node.left != null){
                queue.add(node.left);
            }
            if(node.right != null){
                queue.add(node.right);
            }
        }
    }

    public Node findKey(Node root, Integer key){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            Node node = queue.peek();
            if(node.key == key){
                return node;
            }
            queue.remove();

            if(node.left != null){
                queue.add(node.left);
            }
            if(node.right != null){
                queue.add(node.right);
            }
        }
        return null;
    }

    public Node findDeepestNode(Node root, Integer key){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            Node node = queue.peek();
            queue.remove();

            if(node.left == null && node.right == null && queue.size() == 1){
                return node;
            }
            if(node.left != null){
                queue.add(node.left);
            }
            if(node.right != null){
                queue.add(node.right);
            }
        }
        return null;
    }

    public void deleteNode(Node root, Integer key){
        Node nodeToBeDelete = findKey(root, key);
        if (nodeToBeDelete != null){
            System.out.println("Key Found");
        }
        else{
            System.out.println("Key Doesn't Found");
        }
        Node deepestNode = findDeepestNode(root, key);
        System.out.println("Deepest Node :" + deepestNode.key);


    }
}
