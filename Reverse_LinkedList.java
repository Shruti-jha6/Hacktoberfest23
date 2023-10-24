class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void reverseTraversal(Node node) {
        if (node == null) {
            return;
        }
        reverseTraversal(node.next);
        System.out.print(node.data + " ");
    }

    public void traverseReverse() {
        reverseTraversal(head);
        System.out.println();
    }
}

public class ReverseLinkedListTraversal {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        System.out.println("Original Linked List:");
        list.traverseReverse();

        System.out.println("Reversed Linked List (Traversed in Reverse Order):");
        list.traverseReverse();
    }
}
