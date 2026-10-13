/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        int count1=0;
        int count2=0;

        while(a != null){
            count1++;
            a=a.next;;
        }
        while(b != null){
            count2++;
            b=b.next;
        }
        a=headA;
        b=headB;
        
        while(count1 > count2){
            a = a.next;
            count1--;
        }

        while(count2 > count1){
            b = b.next;
            count2--;
        }

        while(a != null){
            if(a == b){
                return a;
            }
            a= a.next;
            b= b.next;
        }
        return null;
    }
}