package LinkedL;

/**
 *
 */
//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

}

class Solution {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        ListNode temp = listNode.next;
        temp.next = new ListNode(3);
        temp = temp.next;
        temp.next = new ListNode(4);
        ListNode temp2 = listNode;

        while (temp2 != null) {
            System.out.println(temp2.val);
            temp2 = temp2.next;
        }
        reorderList(listNode, listNode.next, listNode.next);
    }

    private static ListNode reorderList(ListNode head, ListNode end, ListNode temp) {
        if (end == null || end.next == null) {
            return end;
        }
        ListNode last = reorderList(head, end.next, temp);
        end.next = null;
        head.next = last;
        last.next = temp;
       last = reorderList(temp, temp.next,temp.next);//2 3  4
        return temp;
    }

}