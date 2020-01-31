package org.jy;

/**
 * https://leetcode-cn.com/problems/linked-list-cycle/
 * @author LJY
 */
public class HasCycle {

    public boolean hasCycle(ListNode head) {
        // 采用双指针碰撞解法
        ListNode fastNode = head,slowNode = head;
        while(slowNode != null && fastNode != null && fastNode.next != null){
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
            if(fastNode == slowNode){
                return true;
            }
        }
        return false;
    }

}
