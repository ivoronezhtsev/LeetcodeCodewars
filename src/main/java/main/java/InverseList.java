/*
void main() {
    ListNode head = new ListNode(1,
            new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
    printList(head);
    System.out.println();
    printList(inverseList(head));
}

void printList(ListNode head) {
    while(head!=null){
        System.out.print(head.val + " ");
        head = head.next;
    }
}
//1 2 3 4 5

ListNode inverseList(ListNode head) {
    ListNode prev = null;
    ListNode current = head;
    while (current != null) {
        ListNode tempNext = current.next;
        current.next = prev;
        prev = current;
        current = tempNext;
    }
    return prev;
}

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}*/
