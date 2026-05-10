package merge;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 * Input: list1 = [1,2,4], list2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 */
class Solution {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        return list1;
    }

    public static void main(String[] args) {
        ListNode node13 = new ListNode(4);
        ListNode node12 = new ListNode(2, node13);
        ListNode node11 = new ListNode(1, node12);

        ListNode node23 = new ListNode(4);
        ListNode node22 = new ListNode(3, node23);
        ListNode node21 = new ListNode(1, node22);

        ListNode node1 = node11;
        ListNode node2 = node21;
        LinkedList<Integer> result = new LinkedList<>();
        ListNode node = node11;
        while (node != null) {
            result.add(node.val);
            node = node.next;
        }
        int i = 0;
        while (node2 != null) {
            node2 = node2.next;
            i++;
        }

    }

    private static void printList(ListNode listNode) {
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}