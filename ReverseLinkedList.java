class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(20);
        head.next = new ListNode(40);
        head.next.next = new ListNode(60);
        head.next.next.next = new ListNode(80);
        ListNode reversedHead = reverseList(head);
        printList(reversedHead);
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode nextTemp = current.next;
            current.next = prev;
            prev = current;
            current = nextTemp;
        }
        return prev;
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}

