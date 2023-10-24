class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTreeTraversal {
    Node root;

    public void leftTraversal(Node node) {
        if (node != null) {
            leftTraversal(node.left);
            System.out.print(node.data + " ");
            leftTraversal(node.right);
        }
    }

    public void bottomTraversal(Node node) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                System.out.print(node.data + " ");
            } else {
                bottomTraversal(node.left);
                bottomTraversal(node.right);
            }
        }
    }

    public static void main(String[] args) {
        BinaryTreeTraversal tree = new BinaryTreeTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.println("Left Traversal:");
        tree.leftTraversal(tree.root);

        System.out.println("\nBottom Traversal:");
        tree.bottomTraversal(tree.root);
    }
}
