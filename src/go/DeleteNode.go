package main

type org.jy.ListNode struct {
	Val  int
	Next *org.jy.ListNode
}

// https://leetcode-cn.com/problems/delete-node-in-a-linked-list/solution/
func deleteNode(node *org.jy.ListNode) {
	node.Val = node.Next.Val
	node.Next = node.Next.Next
}
