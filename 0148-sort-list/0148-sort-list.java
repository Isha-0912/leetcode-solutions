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
    public ListNode sortList(ListNode head) {
        if (head == null) return null;
        ArrayList<Integer> list1 = new ArrayList<>();
        ListNode curr = head;
        while(curr!= null){
            list1.add(curr.val);
            curr = curr.next;
        }
        Collections.sort(list1);
        ListNode temp = new ListNode(list1.get(0));
        ListNode node = temp;
        for(int i=1;i<list1.size();i++){
            node.next = new ListNode(list1.get(i));
            node = node.next;
        }
        return temp;
    }
}