/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k==0) return head;
        ListNode temp = head;
        int count=0;
        while(temp != null){
            count++;
            temp=temp.next;
        }
        ListNode slow = head;
        ListNode fast = head;
        count = k % count;
        if  (count==0) return head;
        for(int i=0;i<count;i++){
            fast = fast.next;
        }
        while(fast.next != null){
            slow=slow.next;
            fast=fast.next;
        }
        ListNode curr = slow.next;
        slow.next = null;
        fast.next = head;
        return curr;
    }
}