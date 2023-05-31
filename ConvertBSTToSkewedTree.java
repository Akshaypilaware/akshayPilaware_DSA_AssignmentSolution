import java.util.ArrayList;
import java.util.List;

public class ConvertBSTToSkewedTree {

    public static void main(String[] args) {
        // Create a binary search tree
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(60);
        root.left.left = new Node(10);
        root.right.left = new Node(55);

        // Convert the binary search tree into a skewed tree
        List<Node> nodes = new ArrayList<>();
        convertBSTToSkewedTree(root, nodes);

        // Print the nodes of the skewed tree
        for (Node node : nodes) {
            System.out.print(node.data + " ");
        }
    }

    private static void convertBSTToSkewedTree(Node node, List<Node> nodes) {
        if (node == null) {
            return;
        }

        // Recursively convert the left subtree of the node
        convertBSTToSkewedTree(node.left, nodes);

        // Add the node to the list of nodes in the skewed tree
        nodes.add(node);

        // Recursively convert the right subtree of the node
        convertBSTToSkewedTree(node.right, nodes);
    }

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
}