package LinkedList;

public class LinkedListCycle {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // Helper: build linked list from array
    public static ListNode buildList(int[] values) {
        if (values.length == 0) return null;
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    static public class Solution {
        public boolean hasCycle(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;          // move 1 step
                fast = fast.next.next;     // move 2 steps

                if (slow == fast) {
                    return true;           // cycle detected
                }
            }
            return false;                  // reached end, no cycle
        }

        public int cycleLength(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;          // move 1 step
                fast = fast.next.next;     // move 2 steps

                if (slow == fast) {
                    System.out.println("Met at node with value: " + slow.val);

                    ListNode temp = slow;
                    int length = 0;
                    do {
                        temp = temp.next;
                        length++;
                        System.out.println("Visited node: " + temp.val + ", length=" + length);
                    } while (temp != slow);

                    return length;
                }
            }
            return 0;                  // reached end, no cycle
        }
    }

    public static void main(String[] args) {
        // Example input
        int[] values = {1, 2, 3, 4, 5};

        // Build list
        ListNode head = buildList(values);

        // ✅ Manually create a cycle for testing
        head.next.next.next.next = head.next; // connects last node -> 2nd node

        // Apply solution
        Solution sol = new Solution();
        boolean result = sol.hasCycle(head);
        int ans = sol.cycleLength(head);

        System.out.println("Linked list has Cycle(Cyclic): " + result);
        System.out.println("Linked list cycle length: " + ans);
    }
}
