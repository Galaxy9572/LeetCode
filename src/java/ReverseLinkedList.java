/**
 * https://leetcode-cn.com/problems/reverse-linked-list/
 *
 * @author LJY
 */
public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode prev = null;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode sec = new ListNode(2);
        head.next = sec;
        ListNode thd = new ListNode(3);
        sec.next = thd;
        thd.next = null;
//        ListNode listNode = new ReverseLinkedList().reverseList(head);
        System.out.println(head);
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return val + "->" + next.val;
    }
}
