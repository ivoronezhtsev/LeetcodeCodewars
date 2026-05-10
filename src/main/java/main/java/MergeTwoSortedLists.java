/*
import merge.ListNode;

void main() {
    ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
    ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
    printList(list1);
    System.out.println();
    printList(list2);
    System.out.println();
    printList(mergeList(list1, list2));
}
//1 2 4
//1 3 4
ListNode mergeList(ListNode list1, ListNode list2) {
    ListNode dummy = new ListNode(0);
    ListNode tail = dummy;
    while (list1 != null && list2 != null) {
        if(list1.val <= list2.val) {
            tail.next = list1;
            list1 = list1.next;
        } else {
            tail.next = list2;
            list2 = list2.next;
        }
        tail = tail.next;
    }
    tail.next = (list1 != null) ? list1 : list2;
    return dummy.next;
}
void printList(ListNode node) {
    while (node != null) {
        System.out.print(node.val + " ");
        node = node.next;
    }
}*/
