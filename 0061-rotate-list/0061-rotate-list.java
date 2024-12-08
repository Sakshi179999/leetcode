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
        if(k==0 || head==null){
            return head;
        }
        ListNode temp=head;
        int len=1;                    //calaculating length
        while(temp.next!=null){
            temp=temp.next;
            len++;
        }
        //make the ll circular
        temp.next=head;
        
        // claculating new head by formula
        
        k=k%len;
        
        //now finding head and rotating list
        
        int stepsfornewHead=len-k;
        ListNode tail=head;
        for(int i=1;i<stepsfornewHead;i++){
            tail=tail.next;
        }
        ListNode newhead= tail.next;
            tail.next=null;
        return newhead;
    }
}