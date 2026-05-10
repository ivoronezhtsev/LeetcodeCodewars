package easy_list;
import easy_list.ReverseList.ListNode;
/**
 * Input: head = [1,2,2,1]
 * Output: true
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class IsPalindrome {
    public static boolean isPalindrome(ReverseList.ListNode head) {
        if(head == null || head.next == null) {
            return true;
        }
        ReverseList.ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ReverseList.ListNode prev = null;
        while (slow != null) {
            ReverseList.ListNode tempNext = slow.next;
            slow.next = prev;
            prev = slow;
            slow = tempNext;
        }

        ReverseList.ListNode left = head;
        ReverseList.ListNode right = prev;
        while (right != null) {
            if(left.val != right.val) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }





    public static void main(String[] args) {
        ListNode node3 = new ListNode(0);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(2, node2);
        ListNode node0 = new ListNode(1, node1);
        System.out.println(isPalindrome(node0));
    }
}
