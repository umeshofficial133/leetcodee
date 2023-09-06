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
    public ListNode[] splitListToParts(ListNode head, int k){
        //find size of linked list
        ListNode ll=head;
        int length=0;
        while(ll!=null){
            length++;
            ll=ll.next;
        }

        //split
        int n=length/k;
        int rem=length%k;
        
        ListNode[] result=new ListNode[k];
        ListNode cur=head;

        for(int i=0;i<k;++i){
            ListNode temp=cur;

            for(int j=0;j<n+(i<rem?1:0)-1;++j)
            {
                if(cur!=null){
                    cur=cur.next;
                }
            }
            if(cur!=null){
                ListNode prev=cur;
                cur=cur.next;
                prev.next=null;
            }
            result[i]=temp;
        }

        return result;
    }
}