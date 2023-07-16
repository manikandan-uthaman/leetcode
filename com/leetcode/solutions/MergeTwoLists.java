package com.leetcode.solutions;

/**
 * You are given the heads of two sorted linked lists list1 and list2.
 * Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
 * Return the head of the merged linked list.
 *
 * Input: list1 = [1,2,4], list2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 */
public class MergeTwoLists {
    public static void main(String[] args) {
        // First list [1,2,4]
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(4);
        ListNode n4 = new ListNode(6);
        ListNode n5 = new ListNode(8);
        ListNode n6 = new ListNode(9);

        n5.next = n6;
        n4.next = n5;
        n3.next = n4;
        n2.next = n3;
        n1.next = n2;

        // Second list [1,3,4]
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(4);
        l2.next = l3;
        l1.next = l2;

        ListNode result = mergeTwoLists(n1,l1);
        while (result.next != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode firstNode = null, lastNode = null;
        while(list1 != null || list2 != null) {
            int val;
            int v1 = list1 != null ? list1.val : Integer.MAX_VALUE;
            int v2 = list2 != null ? list2.val : Integer.MAX_VALUE;
            if(v1 <= v2) {
                val = v1;
                list1 = list1.next;
            } else {
                val = v2;
                list2 = list2.next;
            }
            if(firstNode == null) {
                firstNode = new ListNode(val);
                lastNode = firstNode;
            } else {
                lastNode.next = new ListNode(val);
                lastNode = lastNode.next;
            }
        }
        return firstNode;
    }
}

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
