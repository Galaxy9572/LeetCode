package org.jy;


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

// https://leetcode-cn.com/problems/delete-node-in-a-linked-list/solution/
public class DeleteNode {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

}
