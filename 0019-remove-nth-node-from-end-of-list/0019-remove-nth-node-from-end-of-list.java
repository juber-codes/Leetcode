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

        int size = sizeOfList(head);

        int idx = size - n;

        if(idx == 0){
            head = head.next;
            return head;
        }

        ListNode temp = head;

        for(int i=0; i<idx-1; i++){
                temp = temp.next;
        }
        temp.next = temp.next.next;

        return head;

       
    }

    public int sizeOfList(ListNode head){
        
         int size =0;

        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        
        return size;
    }
}