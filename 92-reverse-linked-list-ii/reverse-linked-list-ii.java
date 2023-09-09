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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        //dummy node
        ListNode dummy= new ListNode();
        dummy.next=head;

        ListNode preTemp=dummy;
        ListNode curr=head;

        for(int i=0;i<left-1;i++){
            preTemp=preTemp.next;
            curr=curr.next;
        }

        ListNode sublistHead=curr;
        ListNode preNode=null;
        for(int i=0;i<=right-left;i++){
            ListNode nextNode=curr.next;
            curr.next=preNode;
            preNode=curr;
            curr=nextNode;
        }

        preTemp.next=preNode;
        sublistHead.next=curr;

        return dummy.next;
    }
}