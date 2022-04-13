package com.peter.about_linked_list;

public class ReverseLinkedListII {
}

class SolutionReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode pre = dummyHead;

        for (int i = 1; i < left; i++) {
            pre = pre.next;
        }
        head = pre.next;
        for (int i = left; i < right; i++) {
            ListNode cur = head.next;
            head.next = cur.next;
            cur.next = pre.next;
            pre.next = cur;
        }
        return dummyHead.next;
    }
}