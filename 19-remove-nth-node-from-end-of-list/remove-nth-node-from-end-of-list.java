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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int cnt=0;
        while(temp!=null){
            temp=temp.next;
            cnt++;
        }
        int index=cnt-n;
        ListNode temp2=head;
        cnt=0;
        if(index==0){
            head=head.next;
            return head;
        }
        while(temp2!=null && cnt!=index-1){
            temp2=temp2.next;
            cnt++;
        }
        temp2.next=temp2.next.next;
        return head;
    }
}