package Leetcode;

public class RemoveDuplicatesFromLL {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();

        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(1,listNode1);
        ListNode listNode3 = new ListNode(2,listNode2);
        solution1.deleteDuplicates(listNode1);


    }
}

  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution1 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head != null) {
            ListNode current = head;
            System.out.println("Current " + current.hashCode());
            while (current != null) {
                ListNode pointer = current.next;
                while (pointer != null) {
                    System.out.println("Pointer " + pointer.hashCode());
                    if (current.val == pointer.val) {
                        current.next = current.next.next;
                    }
                    pointer = pointer.next;
                }
                current = current.next;
            }
            System.out.println("Head " +head.hashCode());
            return head;
        } else {
            return null;
        }
    }
}
