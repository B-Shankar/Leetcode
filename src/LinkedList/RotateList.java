package LinkedList;

//61. Rotate List
public class RotateList {

    private ListNode head;

    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public void display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void insertAtLast(int value) {
        ListNode node = new ListNode(value);
        if (head == null) {
            head = node;
            return;
        }
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    public static void main(String[] args) {
        RotateList list = new RotateList();
        list.insertAtLast(1);
        list.insertAtLast(2);
        list.insertAtLast(3);
        list.insertAtLast(4);
        list.insertAtLast(5);

        System.out.println("Original List:");
        list.display();

        int k = 2; // Number of rotations
        list.head = list.rotateRight(list.head, k);

        System.out.println("Rotated List by " + k + " positions:");
        list.display();
    }

    public ListNode rotateRight(ListNode head, int k) {

        if (k <= 0 || head == null || head.next == null) return head;

        ListNode last = head;
        int length = 1;

        while (last.next !=null) {
            last = last.next;
            length++;
        }

        last.next = head; // make it circular
        int rotations = k % length;
        int skip = length - rotations;

        ListNode newLast = head;
        for (int i = 0; i < skip - 1; i++) {
            newLast = newLast.next;
        }

        head = newLast.next;
        newLast.next = null;
        return head;
    }
}
