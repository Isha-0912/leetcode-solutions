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
    public int pairSum(ListNode head) {
        int max_sum = 0;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev = null;
        ListNode curr = slow;
        while(curr != null){
            ListNode after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        while(prev != null){
            max_sum = Math.max(max_sum,head.val+prev.val);
            head = head.next;
            prev = prev.next;
        }
        return max_sum;
    }
}