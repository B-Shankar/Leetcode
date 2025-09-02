package LinkedList;

public class ReverseLinkedListRecursion {

    private Node head;
    private Node tail;
    private int size;

    private ReverseLinkedListRecursion() {
        this.size = 0;
    }

    public void insertAtLast(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        ReverseLinkedListRecursion list = new ReverseLinkedListRecursion();
        list.insertAtLast(1);
        list.insertAtLast(2);
        list.insertAtLast(3);
        list.insertAtLast(4);
        list.insertAtLast(5);

        System.out.println("Original List:");
        list.display();

        list.reverseList(list.head); // no return, just updates list internally

        System.out.println("Reversed List:");
        list.display();
    }

    private void reverseList(Node node) {
        if (node == null) {
            return;
        }

        if (node == tail) {
            head = tail;
            return;
        }

        reverseList(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

}
